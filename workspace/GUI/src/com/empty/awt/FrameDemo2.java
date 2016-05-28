package com.empty.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame1 myFrame = new MyFrame1("����");
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
		//��������
		this.setBounds(300, 300, 330, 300);//���ô����С
		this.setBackground(Color.GREEN);
		this.setLayout(null);//ȥ������Ĳ��ֹ�����
		
		//�������
		Panel panel  = new Panel();//����һ��Panel�������
		panel.setBounds(0, 0, 250, 250);//��������С
		panel.setBackground(Color.BLUE);
		panel.setLayout(null);//ȥ��Panel����Ĭ�ϲ��ֹ�����
		
		//������ť
		Button btn1 = new Button("��ť1");
		btn1.setBounds(50, 50, 100, 100);//���ð�ťλ�ã���С
		btn1.setBackground(Color.RED);
		//�Ѱ�ť�ŵ����
		panel.add(btn1);
		
		//�����ŵ�����
		this.add(panel);
		//��ʾ����
		this.setVisible(true);
	}
}