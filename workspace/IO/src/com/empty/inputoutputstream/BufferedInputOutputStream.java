package com.empty.inputoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStream {

	public static void main(String[] args) {
		try {
			BufferedCopy.Copy(new  File("D:/���ҷ����������ǡ������ؼ�-����1080P.mp4"), new File("D:/123.mp4"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class BufferedCopy{
	public static void Copy(File file,File file2)throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		FileOutputStream fileOutputStream = new FileOutputStream(file2);
		//Ĭ�Ͽ�����һ��8192�ֽڵĻ�����
		BufferedInputStream inputStream = new BufferedInputStream(fileInputStream);
		BufferedOutputStream outputStream = new BufferedOutputStream(fileOutputStream);
		int data;
		//inputStream.read���ص������ݲ��ǳ���
		while((data=inputStream.read())!=-1){
			outputStream.write(data);
		}
		
		inputStream.close();
		outputStream.close();
	}
}
