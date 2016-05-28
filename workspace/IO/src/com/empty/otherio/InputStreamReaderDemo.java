package com.empty.otherio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException{
		//InputStreamReader  OutputStreamWriter可以指定编码格式
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:/test.txt"), "UTF-8");
//		BufferedWriter bw = new BufferedWriter(osw);
//		bw.write("你好");
//		bw.close();
		InputStreamReader isr = new InputStreamReader(new FileInputStream("D:/test.txt"),"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String data;
		while((data=br.readLine())!=null){
			System.out.println(data);
		}
		br.close();
		
		
		
	}

}
