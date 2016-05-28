package com.empty.awt;

import java.awt.Color;
import java.awt.Frame;

public class FrameDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myFrame = new MyFrame("Framework");
		myFrame.init();
	}

}

class MyFrame extends Frame{
	/**
	 * serialVersionUID作用是序列化时保持版本的兼容性，即在版本升级时反序列化仍保持对象的唯一性。
	 */
	private static final long serialVersionUID = 1L;

	//使用父类的构造器
	public MyFrame(String title){
		super(title);
	}
	
	public void init(){
		//this.setSize(300, 300);//设置窗口大小 //默认在左上角
		this.setBounds(300, 300, 300, 300);//x轴位置,y轴位置,宽度，高度
		this.setBackground(Color.RED);
		this.setVisible(true);//设置窗口可见
	}
}
