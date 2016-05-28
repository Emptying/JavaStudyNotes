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
		//FrameĬ�ϲ��־���//BorderLayout layout  = new BorderLayout();//�߿򲼾ֹ�����ʹ���������������򣺱����ϡ�����������
		//this.setLayout(layout);
		this.add(new Button("��"),BorderLayout.CENTER);
		this.add(new Button("��"),BorderLayout.EAST);
		this.add(new Button("��"),BorderLayout.NORTH);
		this.add(new Button("��"),BorderLayout.SOUTH);
		this.add(new Button("��"),BorderLayout.WEST);
		//this.add(new Button("��ͷ"),BorderLayout.PAGE_START);
		//this.add(new Button("��β"),BorderLayout.PAGE_END);
		//this.add(new Button("�н�β"),BorderLayout.LINE_END);
		//this.add(new Button("�п�ͷ"),BorderLayout.LINE_START);
		this.setVisible(true);
		
	}
}