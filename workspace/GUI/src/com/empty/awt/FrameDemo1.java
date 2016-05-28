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
	 * serialVersionUID���������л�ʱ���ְ汾�ļ����ԣ����ڰ汾����ʱ�����л��Ա��ֶ����Ψһ�ԡ�
	 */
	private static final long serialVersionUID = 1L;

	//ʹ�ø���Ĺ�����
	public MyFrame(String title){
		super(title);
	}
	
	public void init(){
		//this.setSize(300, 300);//���ô��ڴ�С //Ĭ�������Ͻ�
		this.setBounds(300, 300, 300, 300);//x��λ��,y��λ��,��ȣ��߶�
		this.setBackground(Color.RED);
		this.setVisible(true);//���ô��ڿɼ�
	}
}
