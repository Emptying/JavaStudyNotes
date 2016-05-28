package com.empty.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame4 myFrame2 =  new MyFrame4("Framework");
		myFrame2.init();

	}

}

class MyFrame4 extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame4(String title){
		super(title);
	}
	
	public void init(){
		this.setSize(300,300);//
		this.setBackground(Color.BLUE);
		GridLayout layout = new GridLayout(3, 3);//网格布局管理器3*3
		this.setLayout(layout);
		this.add(new Button("1"));
		this.add(new Button("2"));
		this.add(new Button("3"));
		this.add(new Button("4"));
		this.add(new Button("5"));
		this.add(new Button("6"));
		this.add(new Button("7"));
		this.add(new Button("8"));
		this.add(new Button("9"));

		this.setVisible(true);
		
	}

}