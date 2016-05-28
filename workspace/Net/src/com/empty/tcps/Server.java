package com.empty.tcps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static TcpMap<String,Socket> map = new TcpMap<>();
	public static int SERVER_PORT=8000;
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try {
			serverSocket = new ServerSocket(SERVER_PORT);
			System.out.println("服务端已启动等待客户端连接");
			while(true){
				Socket socket = serverSocket.accept();
				new Thread(new ServerThread(socket)).start();;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}

class ServerThread implements Runnable{
	
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	Socket socket=null;
	public ServerThread(Socket  socket){
		this.socket=socket;
	}


	@Override
	public void run() {
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String data=null;
			while((data=br.readLine())!=null){
				
				//如果是注册信息
				if(data.startsWith(IPackageProtocol.USER_REG)&&data.endsWith(IPackageProtocol.USER_REG)){
					data=getRealmessage(data);
					String result=Server.map.put(data, socket);
					//System.out.println("[S] " + "result:" + result);
					bw.write(result);
					bw.newLine();
					bw.flush();
					if(result.equals(IPackageProtocol.LOGIN_SUCCESS)){
						for(String k:Server.map.keys()){
							if(k!=null){
								System.out.println("当前:"+k+"在线 ");
							}
						}
					}
					
				//如果是私信
				}else if(data.startsWith(IPackageProtocol.PRIVATE_MSG)&&data.endsWith(IPackageProtocol.PRIVATE_MSG)){
					data=getRealmessage(data);
					
					String user = data.split(IPackageProtocol.SPLIT)[0];
					String message = data.split(IPackageProtocol.SPLIT)[1];
					Socket userresult=null;
					String username=Server.map.valueGetkey(socket);
					if((userresult=Server.map.keyGetvalue(user))!=null){
						BufferedWriter uBr = new BufferedWriter(new OutputStreamWriter(userresult.getOutputStream()));
						uBr.write(IPackageProtocol.USER_MSG+username+IPackageProtocol.SPLIT+message+IPackageProtocol.USER_MSG);
						uBr.newLine();
						uBr.flush();
					}	
					
				}
				//head.equals(tail)
				
				
				
				
			}
			
			
		} catch (IOException e) {
			
			System.out.println(Server.map.valueGetkey(socket)+"断开连接");
			Server.map.remove(socket);
			//e.printStackTrace();
		}
	}
	
	public String getRealmessage(String message){
		return message.substring(IPackageProtocol.PROTOCOL_LEN,message.length()-IPackageProtocol.PROTOCOL_LEN);
	}
	
}
