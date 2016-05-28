package com.empty.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSocketDemo {

	public static void main(String[] args) {
		try {
			//Ĭ�ϵĻ����������һ���˿�
			DatagramSocket socket = new DatagramSocket(8001);
			String str = "hello word";
			//�����ݴ��
			DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(),InetAddress.getByName("localhost"),8000);
			//�������ݰ�
			socket.send(packet);
			//�������ݰ�
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
