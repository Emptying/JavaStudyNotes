package com.empty.channel;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo2 {

	public static void main(String[] args) {
		File file = new File("D:/NotePad.txt");
		try {
			//以读写方式访问文件
			RandomAccessFile accessFile = new RandomAccessFile(file, "rw");
			FileChannel channel = accessFile.getChannel();
			//将文件的数据映射成ByteBuffer
			MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
			//将position指针放到文件末尾
			channel.position(file.length());
			//把读到的数据再写一份到文件末尾
			channel.write(buffer);
			accessFile.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
