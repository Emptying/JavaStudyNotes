package com.empty.inputoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamDemo {

	public static void main(String[] args)throws IOException {
		String name="zhangsan";
		int age = 18;
		char sex='男';
		double money=9.99;
		boolean b=false;
		DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("D:/123.txt"));
		outputStream.writeUTF(name);
		outputStream.writeInt(age);
		outputStream.writeChar(sex);
		outputStream.writeDouble(money);
		outputStream.writeBoolean(b);
		outputStream.close();
		DataInputStream inputStream = new DataInputStream(new FileInputStream("D:/123.txt"));
		//读取的时候也要按照写入的顺序来读
		System.out.println(inputStream.readUTF());
		System.out.println(inputStream.readInt());
		System.out.println(inputStream.readChar());
		System.out.println(inputStream.readDouble());
		System.out.println(inputStream.readBoolean());
		inputStream.close();
		
	}

}
