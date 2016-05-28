package com.empty.url;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		try {
			DownLoaderHelper.DownLoader("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png", "baidu.png", "D:/URLtest");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


class DownLoaderHelper{
	public static void DownLoader(String urlName,String fileName,
			String filePath)throws IOException{
		//新建URL对象
		URL url = new URL(urlName);
		//打开URl链接
//		URLConnection connection = url.openConnection();
//		//获取到链接的IO流
//		InputStream is = connection.getInputStream();
		InputStream is = url.openStream();
		File file = new File(filePath);
		file.mkdir();
		FileOutputStream fos = new FileOutputStream(file.getAbsolutePath()+"/"+fileName);
		
		byte [] buf = new byte[1024*1024];
		
		int length;
		while((length=is.read(buf))!=-1){
			fos.write(buf, 0, length);
		}
		is.close();
		fos.close();
		
	}
}