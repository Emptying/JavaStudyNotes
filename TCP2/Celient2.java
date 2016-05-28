//package com.empty.tcps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Celient1 {

	public static void main(String[] args) {
		Socket socket=null;
		try {
			socket = new Socket("127.0.0.1",Server.SERVER_PORT);
			new Thread(new Celient1Thread(socket)).start();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader brj = new BufferedReader(new InputStreamReader(System.in));
			
			while(true){
				System.out.println("请输入用户名");
				String data;
				while((data=brj.readLine())!=null){
					bw.write(IPackageProtocol.USER_REG+data+IPackageProtocol.USER_REG);
					bw.newLine();
					bw.flush();
				}
			
				if(br.readLine().equals(IPackageProtocol.LOGIN_SUCCESS)){
					break;
				}
			}
			String data2;
			while(true){
				data2=brj.readLine();
				if(data2.startsWith("//")){
					data2=data2.substring(2, data2.length());
					String user=data2.split(":")[0];
					String msg = data2.split(":")[1];
			
					data2=IPackageProtocol.PRIVATE_MSG+user+IPackageProtocol.SPLIT+msg+IPackageProtocol.PRIVATE_MSG;
					
				}
				bw.write(data2);
				bw.newLine();
				bw.flush();
				
			}

			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Celient1Thread implements Runnable{
	private Socket socket=null;
	private BufferedReader br=null;
	
	public Celient1Thread(Socket socket){
		this.socket=socket;
	}
	
	@Override
	public void run() {
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data;
			String user=null;
			String message=null;
			while((data=br.readLine())!=null){
				if(data.startsWith(IPackageProtocol.USER_MSG)&&data.endsWith(IPackageProtocol.USER_MSG)){
					data=getRealmessage(data);
					user=data.split(IPackageProtocol.SPLIT)[0];
					message=data.split(IPackageProtocol.SPLIT)[1];
					System.out.print(user+":");
					System.out.println(message);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public String getRealmessage(String message){
		return message.substring(IPackageProtocol.PROTOCOL_LEN,message.length()-IPackageProtocol.PROTOCOL_LEN);
	}
	
}
