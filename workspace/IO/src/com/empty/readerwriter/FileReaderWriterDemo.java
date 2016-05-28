package com.empty.readerwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args)throws IOException {
	/**
	 * ×Ö·ûIOÁ÷
	 * */
	FileReader  reader  = new FileReader("C:/Users/cws10/Desktop/NotePad.txt");
	FileWriter writer = new FileWriter("D:/NotePad.txt");
	char [] cbuf = new char[100];
	int length;
	while((length=reader.read(cbuf))!=-1){
		writer.write(cbuf,0,length);
	}
	reader.close();
	writer.close();
	
	

	}

}
