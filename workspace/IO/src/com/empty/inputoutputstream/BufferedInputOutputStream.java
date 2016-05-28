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
			BufferedCopy.Copy(new  File("D:/独家发布《疯狂动物城》超长特辑-国语1080P.mp4"), new File("D:/123.mp4"));
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
		//默认开辟了一个8192字节的缓冲区
		BufferedInputStream inputStream = new BufferedInputStream(fileInputStream);
		BufferedOutputStream outputStream = new BufferedOutputStream(fileOutputStream);
		int data;
		//inputStream.read返回的是数据不是长度
		while((data=inputStream.read())!=-1){
			outputStream.write(data);
		}
		
		inputStream.close();
		outputStream.close();
	}
}
