package com.empty.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		//���������Ĵ���·��
		File file = new File("D:/123.txt");
		try {
			System.out.println(file.createNewFile());//�½��ļ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("aaa");
		}
		System.out.println(file.exists());//�ж��ļ��Ƿ����
		
		System.out.println(file.getAbsoluteFile());//��ȡ�ļ��ľ���·��
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getFreeSpace());//���ش˳���·����ָ���ķ�����δ������ֽ���
		System.out.println(file.getName());//�����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ�
		System.out.println(file.getParent());//���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null
		System.out.println(file.getParentFile());
		File  file2 = new File("D:/");//���ص�ǰĿ¼�е��ļ���Ŀ¼��
		String []files=file2.list();
		for(String o:files){
			System.out.println(o);
		}
		System.out.println(file2.length());//��ȡ��С
		
		File file3 = new File("D:/Test");
		System.out.println(file3.mkdir());//�ڵ�ǰĿ¼�½��ļ�
		file3.delete();
		
		String[]files2=file2.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".txt");
			}
		});
		
		for(String o : files2){
			System.out.println(o);
		}
		
		for(File o:file2.listFiles()){
			System.out.println(o.getName()+"...."+o.length());
		}
		
		File[] listFiles2 = file2.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".txt") && pathname.length()>0;
			}
		});
		System.out.println("*****************************************");
		for(File o:listFiles2){
			System.out.println(o.getName()+"...."+o.length());
		}
	}

}
