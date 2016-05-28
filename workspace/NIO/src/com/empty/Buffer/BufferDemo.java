package com.empty.Buffer;

import java.nio.CharBuffer;

public class BufferDemo {
	/**
	 * 1.capacity ����������
	 * 2.limit ���� λ��limit������ݲ��ɱ���д
	 * 3.position λ�� ����ָ����һ���ɱ���д�û�����λ��
	 * 4.mark ָ����0��position֮���λ��
	 * ���ǵĹ�ϵ
	 * 0<=mark<=position<=limit<=capacity
	 * */

	public static void main(String[] args) {
		//ͨ��allocate��������һ��capacityΪ8��CharBuffer
		CharBuffer buff = CharBuffer.allocate(8);
		//�鿴��ǰ��capacity��limit��position
		//��ǰ
		//capacity:8
		//limit:8
		//position:0
		System.out.println("capacity:"+buff.capacity());
		System.out.println("limit:"+buff.limit());
		System.out.println("position:"+buff.position());
		//����3��Ԫ��
		buff.put('A');
		buff.put('B');
		buff.put('C');
		//position�ƶ�����3��λ��
		System.out.println("position:="+buff.position());
		//
		buff.flip();
		//ִ��flip��limit��position��λ��
		//limit = 3
		//position = 0
		System.out.println("flip_limit="+buff.limit());
		System.out.println("flip_position="+buff.position());
		//ȡ����һ��Ԫ��
		System.out.println("��һ��Ԫ��:"+buff.get());
		System.out.println("��һ��Ԫ�غ�position:"+buff.position());
		//ִ��clear��(clear : Ϊ�ٴ���buffer��װ��������׼��)
		buff.clear();
		//limit��position�ָ���Ĭ��λ��
		System.out.println("ִ��clear��limit:"+buff.limit());//8
		System.out.println("ִ��clear��position:"+buff.position());//0
		//���ǻ�������û�б����
		System.out.println("ִ��clear��ڶ���Ԫ��:"+buff.get(1));
		//ִ�о��Զ�ȡ��ĵ�position����Ϊ0
		System.out.println("ִ�о��Զ�ȡ��ĵ�position"+buff.position());
		
		
	}

}
