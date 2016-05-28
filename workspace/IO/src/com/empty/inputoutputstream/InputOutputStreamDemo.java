package com.empty.inputoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamDemo {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		File file = new File("D:/test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte [] b={'c','b','c','d','e'};
		FileOutputStream outputStream;
		try {
			outputStream = new FileOutputStream(file);
			outputStream.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		File file = new File("D:/独家发布《疯狂动物城》超长特辑-国语1080P.mp4");
		try {
			FileCopy.Copy(file, "D:/123.mp4");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

class FileCopy{
	public static void Copy (File file,String pathname)throws IOException{
		File file2 =  new File(pathname); //创建一个用来接收的空对象文件
		file2.createNewFile();
		FileInputStream inputStream = new FileInputStream(file);//
		FileOutputStream outputStream = new FileOutputStream(file2);
		byte [] cache= new byte[2048*2048];//新建一个4M缓冲区
		long time1=System.currentTimeMillis();
		int lenth=0;
		while((lenth=inputStream.read(cache))!=-1){//文件全部读完会返回一个-1
			//读一次写一次直到返回-1
			outputStream.write(cache,0,lenth);//从缓存区存的0字节到当前缓存区的大小偏移量写到对象文件中
		}
		long time2=System.currentTimeMillis();
		System.out.println("拷贝文件的时间为:"+(time2-time1)+"毫秒");
		outputStream.flush();//刷新此输出流并强制写出所有缓冲的输出字节
		inputStream.close();//关闭此输入流并释放与此流有关的所有系统资源
		outputStream.close();//关闭此输出流并释放与此流有关的所有系统资源
	}
}

