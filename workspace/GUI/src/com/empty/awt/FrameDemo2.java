package com.empty.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame1 myFrame = new MyFrame1("标题");
		myFrame.init();

	}

}
class MyFrame1 extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame1(String title){
		super(title);
	}
	
	public void init(){
		//创建窗体
		this.setBounds(300, 300, 330, 300);//设置窗体大小
		this.setBackground(Color.GREEN);
		this.setLayout(null);//去掉窗体的布局管理器
		
		//创建面板
		Panel panel  = new Panel();//创建一个Panel容器面板
		panel.setBounds(0, 0, 250, 250);//设置面板大小
		panel.setBackground(Color.BLUE);
		panel.setLayout(null);//去掉Panel容器默认布局管理器
		
		//创建按钮
		Button btn1 = new Button("按钮1");
		btn1.setBounds(50, 50, 100, 100);//设置按钮位置，大小
		btn1.setBackground(Color.RED);
		//把按钮放到面板
		panel.add(btn1);
		
		//把面板放到窗体
		this.add(panel);
		//显示窗体
		this.setVisible(true);
	}
}