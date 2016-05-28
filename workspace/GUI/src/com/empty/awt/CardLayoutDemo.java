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
		//���ô���
		this.setSize(300,400);
		//this.setBackground(Color.blue);
		//���ò���
		CardLayout cardLayout = new CardLayout();
		FlowLayout flowLayout =  new FlowLayout();
		//�������
		Panel CardPanel =  new Panel();
		//CardPanel.setBackground(Color.GREEN);
		CardPanel.setLayout(cardLayout);
		
		Panel FlowPanel =  new Panel();
		//FlowPanel.setBackground(Color.RED);
		FlowPanel.setLayout(flowLayout);
		//���ð�ť
		Button first = new Button("��һҳ");
		Button last = new Button("���һҳ");
		Button next = new Button("��һҳ");
		Button prev = new Button("��һҳ");
		FlowPanel.add(first);
		FlowPanel.add(last);
		FlowPanel.add(next);
		FlowPanel.add(prev);
		//���ñ�ǩ
		CardPanel.add(new Label("��һҳ����",Label.CENTER));
		CardPanel.add(new Label("�ڶ�ҳ����",Label.CENTER));
		CardPanel.add(new Label("����ҳ����",Label.CENTER));
		CardPanel.add(new Label("����ҳ����",Label.CENTER));
		
		
		
		//�������ŵ����
		this.add(CardPanel,BorderLayout.CENTER);
		this.add(FlowPanel,BorderLayout.SOUTH);
		
		//��ʾ���
		this.setVisible(true);
		
		
	}

	
	
	
}
