package com.empty.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args){
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedWriter bw = null;
		BufferedReader bred = null;
		//1.创建ServerSocket服务端对象
		try {
			serverSocket = new ServerSocket(8888);
		} catch (IOException e) {
			System.out.println("4");
		}
		//2.使用accept  侦听并接受到此套接字的连接
		try {
			socket = serverSocket.accept();
		} catch (IOException e) {
			System.out.println("5");
		}
		System.out.println(socket.getInetAddress()+"连接成功");
		//新建一个线程用来接收服务端信息
		try {
			new Thread(new ServerThread(socket)).start();
		} catch (IOException e) {
			System.out.println("6");
		}
		//用来向客户端InputStream发送数据
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("7");
		}
		//接收键盘输入的内容
		bred = new BufferedReader(new InputStreamReader(System.in)); 
		
		//读取键盘数据
		String rdata;
		//向客户端发送数据
		try{
			while(true){
				rdata=bred.readLine();
				bw.write(rdata);
				bw.newLine();
				bw.flush();
				if(rdata.equals("exit")){
					break;
				}
			}
		}catch(IOException  e){
			System.out.println("退出服务程序");
		}
		
		try{
			bw.close();
			bred.close();
			serverSocket.close();
		}catch(IOException  e){
			System.out.println("9");
		}
		
		System.out.println("本次会话结束");
		
	}
	
}

class ServerThread implements Runnable{
	
	Socket sk=null;
	BufferedReader br=null;
	public ServerThread(Socket sk) throws IOException{
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
				System.out.println(data);
			}
			br.close();
			sk.close();
		} catch (IOException e) {
			System.out.println("客户端断开连接");
		}
		
	}
	
}
