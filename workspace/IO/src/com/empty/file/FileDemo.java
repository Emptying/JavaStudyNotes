package com.empty.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		//参数操作的磁盘路径
		File file = new File("D:/123.txt");
		try {
			System.out.println(file.createNewFile());//新建文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("aaa");
		}
		System.out.println(file.exists());//判断文件是否存在
		
		System.out.println(file.getAbsoluteFile());//获取文件的绝对路径
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getFreeSpace());//返回此抽象路径名指定的分区中未分配的字节数
		System.out.println(file.getName());//返回由此抽象路径名表示的文件或目录的名称。
		System.out.println(file.getParent());//返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null
		System.out.println(file.getParentFile());
		File  file2 = new File("D:/");//返回当前目录中的文件和目录。
		String []files=file2.list();
		for(String o:files){
			System.out.println(o);
		}
		System.out.println(file2.length());//获取大小
		
		File file3 = new File("D:/Test");
		System.out.println(file3.mkdir());//在当前目录新建文件
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
