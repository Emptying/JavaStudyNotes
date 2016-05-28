package com.empty.readerwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderWriterDemo {

	public static void main(String[] args) {
		try{
			FileHelper.CopyFile(new FileReader("C:/Users/cws10/Desktop/NotePad.txt"),new FileWriter("D:/NotePad.txt"));
		}catch(IOException e){
			e.printStackTrace();//´òÓ¡¶ÑÕ»¸ú×Ù
		}
		
	}

}
class FileHelper{
	public static void CopyFile(Reader rd,Writer wt)throws IOException{
		//Ä¬ÈÏ×Ö·û»º³åÇø8k
		BufferedReader bR = new BufferedReader(rd);
		BufferedWriter bW = new BufferedWriter(wt);
		String data;
		while((data=bR.readLine())!=null){
			bW.write(data);
			bW.newLine();
		}
		bR.close();
		bW.close();
	}
}