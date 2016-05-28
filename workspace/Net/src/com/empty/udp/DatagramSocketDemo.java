package com.empty.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSocketDemo {

	public static void main(String[] args) {
		try {
			//默认的话会随机分配一个端口
			DatagramSocket socket = new DatagramSocket(8001);
			String str = "hello word";
			//将数据打包
			DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(),InetAddress.getByName("localhost"),8000);
			//发送数据包
			socket.send(packet);
			//接收数据包
			byte []  buf = new byte[100];
			DatagramPacket packet2 = new DatagramPacket(buf,100);
			socket.receive(packet2);
			System.out.println(packet2.getAddress()+":"+packet2.getPort()+":"+new String(buf,0,packet2.getLength()));
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
