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
		//1.����ServerSocket����˶���
		try {
			serverSocket = new ServerSocket(8888);
		} catch (IOException e) {
			System.out.println("4");
		}
		//2.ʹ��accept  ���������ܵ����׽��ֵ�����
		try {
			socket = serverSocket.accept();
		} catch (IOException e) {
			System.out.println("5");
		}
		System.out.println(socket.getInetAddress()+"���ӳɹ�");
		//�½�һ���߳��������շ������Ϣ
		try {
			new Thread(new ServerThread(socket)).start();
		} catch (IOException e) {
			System.out.println("6");
		}
		//������ͻ���InputStream��������
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("7");
		}
		//���ռ������������
		bred = new BufferedReader(new InputStreamReader(System.in)); 
		
		//��ȡ��������
		String rdata;
		//��ͻ��˷�������
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
			System.out.println("�˳��������");
		}
		
		try{
			bw.close();
			bred.close();
			serverSocket.close();
		}catch(IOException  e){
			System.out.println("9");
		}
		
		System.out.println("���λỰ����");
		
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
			System.out.println("�ͻ��˶Ͽ�����");
		}
		
	}
	
}
