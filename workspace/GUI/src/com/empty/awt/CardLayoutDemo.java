package com.empty.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class CardLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame5 frame5 = new MyFrame5("Framework");
		frame5.init();

	}

}

class MyFrame5 extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyFrame5(String title){
		super(title);
	}
	public void init(){
		//设置窗体
		this.setSize(300,400);
		//this.setBackground(Color.blue);
		//设置布局
		CardLayout cardLayout = new CardLayout();
		FlowLayout flowLayout =  new FlowLayout();
		//设置面板
		Panel CardPanel =  new Panel();
		//CardPanel.setBackground(Color.GREEN);
		CardPanel.setLayout(cardLayout);
		
		Panel FlowPanel =  new Panel();
		//FlowPanel.setBackground(Color.RED);
		FlowPanel.setLayout(flowLayout);
		//设置按钮
		Button first = new Button("第一页");
		Button last = new Button("最后一页");
		Button next = new Button("下一页");
		Button prev = new Button("上一页");
		FlowPanel.add(first);
		FlowPanel.add(last);
		FlowPanel.add(next);
		FlowPanel.add(prev);
		//设置标签
		CardPanel.add(new Label("第一页内容",Label.CENTER));
		CardPanel.add(new Label("第二页内容",Label.CENTER));
		CardPanel.add(new Label("第三页内容",Label.CENTER));
		CardPanel.add(new Label("第四页内容",Label.CENTER));
		
		
		
		//把容器放到面板
		this.add(CardPanel,BorderLayout.CENTER);
		this.add(FlowPanel,BorderLayout.SOUTH);
		
		//显示面板
		this.setVisible(true);
		
		
	}

	
	
	
}
