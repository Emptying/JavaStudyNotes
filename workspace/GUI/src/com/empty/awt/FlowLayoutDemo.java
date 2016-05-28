package com.empty.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame3 myFrame3 =  new MyFrame3("Framework");
		myFrame3.init();

	}

}

class MyFrame3 extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame3(String title){
		super(title);
	}
	
	public void init(){
		this.setSize(300,300);//
		this.setBackground(Color.BLUE);
		FlowLayout layout  = new FlowLayout(FlowLayout.LEFT,30,30);//流式布局管理器
		this.setLayout(layout);
		Button button = new Button("btn1");
		Button button2 = new Button("btn2");
		Button button3 = new Button("btn3");
		this.add(button);
		this.add(button2);
		this.add(button3);
		this.setVisible(true);
		
	}
}