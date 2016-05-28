package com.empty.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayoutDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame2 myFrame2 =  new MyFrame2("Framework");
		myFrame2.init();

	}

}

class MyFrame2 extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame2(String title){
		super(title);
	}
	
	public void init(){
		this.setSize(300,300);//
		this.setBackground(Color.BLUE);
		//Frame默认布局就是//BorderLayout layout  = new BorderLayout();//边框布局管理器使其符合下列五个区域：北、南、东、西、中
		//this.setLayout(layout);
		this.add(new Button("中"),BorderLayout.CENTER);
		this.add(new Button("东"),BorderLayout.EAST);
		this.add(new Button("北"),BorderLayout.NORTH);
		this.add(new Button("南"),BorderLayout.SOUTH);
		this.add(new Button("西"),BorderLayout.WEST);
		//this.add(new Button("开头"),BorderLayout.PAGE_START);
		//this.add(new Button("结尾"),BorderLayout.PAGE_END);
		//this.add(new Button("行结尾"),BorderLayout.LINE_END);
		//this.add(new Button("行开头"),BorderLayout.LINE_START);
		this.setVisible(true);
		
	}
}