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
		
		File file = new File("D:/���ҷ����������ǡ������ؼ�-����1080P.mp4");
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
		File file2 =  new File(pathname); //����һ���������յĿն����ļ�
		file2.createNewFile();
		FileInputStream inputStream = new FileInputStream(file);//
		FileOutputStream outputStream = new FileOutputStream(file2);
		byte [] cache= new byte[2048*2048];//�½�һ��4M������
		long time1=System.currentTimeMillis();
		int lenth=0;
		while((lenth=inputStream.read(cache))!=-1){//�ļ�ȫ������᷵��һ��-1
			//��һ��дһ��ֱ������-1
			outputStream.write(cache,0,lenth);//�ӻ��������0�ֽڵ���ǰ�������Ĵ�Сƫ����д�������ļ���
		}
		long time2=System.currentTimeMillis();
		System.out.println("�����ļ���ʱ��Ϊ:"+(time2-time1)+"����");
		outputStream.flush();//ˢ�´��������ǿ��д�����л��������ֽ�
		inputStream.close();//�رմ����������ͷ�������йص�����ϵͳ��Դ
		outputStream.close();//�رմ���������ͷ�������йص�����ϵͳ��Դ
	}
}

