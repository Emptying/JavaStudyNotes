package com.empty.inputoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopydirDemo {

	public static void main(String[] args) {
		try {
			DirHelper.CopyDir(new File("E:/Android"), new File("D:/Android"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class DirHelper{
	public static void CopyDir(File file,File file2)throws IOException{
		File[] listFiles = file.listFiles();
		file2.mkdir();//�Ƚ�����ǰ�ļ���
		FileInputStream input=null;
		FileOutputStream output=null;
		for(File o:listFiles){
			if(o.isDirectory()){//������ļ��оͽ���ݹ�
				//�½��ļ������ǵ�ǰ�ļ��ľ���·��+��ǰ�����Ķ�����
				CopyDir(o,new File(file2.getAbsoluteFile()+"/"+o.getName()));
			}else{
				byte [] cache = new byte[2048*2048];
				input=new FileInputStream(o);
				
				int length;
				while((length=input.read(cache))!=-1){
					output= new FileOutputStream(file2.getAbsoluteFile()+"/"+o.getName());
					output.write(cache, 0, length);
				}
				input.close();
				output.close();	
			}
		}
		
	}
	
}