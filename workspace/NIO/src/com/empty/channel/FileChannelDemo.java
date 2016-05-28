package com.empty.channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File file = new File("D:/NotePad.txt");
		//
		try {
			FileChannel inChannel = new FileInputStream(file).getChannel();
			FileChannel outChannel = new FileOutputStream("D:/1.txt").getChannel();
			//通过Map方法将inchannel的数据映射成bytebuffer
			//map(读写模式在FileChannel.MapMode中,数据的起始位置,数据的长度)
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
			outChannel.write(buffer);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
