package com.empty.otherio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo{
	public static void main(String []  args){
/*		try{
			RandomAccessFile reader = new RandomAccessFile(new File("D:/NotePad.txt"), "r");
			//���һ�µ�ǰָ��λ��
			System.out.println("��ǰָ��λ��:"+reader.getFilePointer());
			//�ƶ�ָ��
			reader.seek(500);
			int length;
			byte [] buf=new byte[1024];
			while((length=reader.read(buf))!=-1){
				System.out.println(new String(buf, 0, length));//���������ļ�ǰ500���ֽ�û��
				//Ҳ����˵�Ǵӵ�500���ֽ������
			}
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}*/
		try {
			RandomAccessFile file = new RandomAccessFile(new File("D:/123.txt"), "rw");
			file.seek(300);
			file.writeUTF("123456");
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
