package com.empty.channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo3 {

	public static void main(String[] args) {
		File file = new File("D:/独家发布《疯狂动物城》超长特辑-国语1080P.mp4");
		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream("D:/11111.MP4");
			FileChannel outChannel = fos.getChannel();
			FileChannel inChannel = fis.getChannel();
			ByteBuffer buf = ByteBuffer.allocate(256);
			
			while(inChannel.read(buf)!=-1){
				buf.flip();//锁定空白区
				outChannel.write(buf);
				buf.clear();//为下次读取做准备
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
