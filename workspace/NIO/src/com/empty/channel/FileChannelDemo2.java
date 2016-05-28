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
			//�Զ�д��ʽ�����ļ�
			RandomAccessFile accessFile = new RandomAccessFile(file, "rw");
			FileChannel channel = accessFile.getChannel();
			//���ļ�������ӳ���ByteBuffer
			MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
			//��positionָ��ŵ��ļ�ĩβ
			channel.position(file.length());
			//�Ѷ�����������дһ�ݵ��ļ�ĩβ
			channel.write(buffer);
			accessFile.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
