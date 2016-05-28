package com.empty.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {

	public static void main(String[] args){
		Socket socket = null;
		BufferedReader bred=null;
		BufferedWriter bw=null;
		//连接服务端
			try {
				socket = new Socket("127.0.0.1", 8888);
			} catch (UnknownHostException e1) {
				System.out.println("0.1");
			} catch (IOException e1) {
				System.out.println("0.2");
			}
			//读取服务端数据线程
			try {
				new Thread(new ClientThread(socket)).start();
			} catch (IOException e1) {
				System.out.println("0.3");
			}
			//读取键盘数据
			bred = new BufferedReader(new InputStreamReader(System.in));
			//向服务端发送数据
			try {
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			} catch (IOException e1) {
				System.out.println("0.4");
			}
			String rdata;
		try{
				while(true){
					rdata = bred.readLine();
					bw.write("客户端:"+rdata);
					bw.newLine();
					bw.flush();
					if(rdata.equals("exit")){
						break;
					}
				}
		}catch(IOException e){
			System.out.println("服务端不在线");
		}
		try{
			bw.close();
			socket.close();
		}catch(IOException e){
			//System.out.println("2");
		}
		System.out.println("本次会话结束");
	}

}

class ClientThread implements Runnable{
	Socket sk = null;
	BufferedReader br = null;
	public ClientThread(Socket sk)throws IOException{
		this.sk=sk;
		br=new BufferedReader(new InputStreamReader(sk.getInputStream()));
	}

	@Override
	public void run() {
		String data;
		try {
			while((data=br.readLine())!=null){
				if(data.equals("exit")){
					break;
				}
				System.out.println("Admin:"+data);
			}
			br.close();
		} catch (IOException e) {
		}
	}
	
}
