package com.empty.channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo3 {

	public static void main(String[] args) {
		File file = new File("D:/���ҷ����������ǡ������ؼ�-����1080P.mp4");
		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream("D:/11111.MP4");
			FileChannel outChannel = fos.getChannel();
			FileChannel inChannel = fis.getChannel();
			ByteBuffer buf = ByteBuffer.allocate(256);
			
			while(inChannel.read(buf)!=-1){
				buf.flip();//�����հ���
				outChannel.write(buf);
				buf.clear();//Ϊ�´ζ�ȡ��׼��
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
