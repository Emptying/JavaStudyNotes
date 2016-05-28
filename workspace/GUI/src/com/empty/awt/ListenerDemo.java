package com.empty.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListenerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame6("ListenerDemo");

	}

}

class MyFrame6 extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//��Ӱ�ť
	private Button first;
	private Button last;
	private Button next;
	private Button prev;
	//������
	private Panel CardPanel;
	private Panel FlowPanel;
	
	//��Ӳ���
	private CardLayout cardLayout;
	private FlowLayout flowLayout;
	
	private Label label1;
	private Label label2;
	private TextArea label3;
	private Label label4;
	
	//��ťע�����
	ButtonListener RegistorListener =new ButtonListener();
	
	
	public MyFrame6(String title){
		super(title);
		init();
	}
	public void init(){
		//���ô���
		this.setSize(300,400);
		//this.setBackground(Color.blue);
		//���ò���
		cardLayout = new CardLayout();
		flowLayout =  new FlowLayout();
		//�������
		CardPanel =  new Panel();
		CardPanel.setLayout(cardLayout);
		
		FlowPanel =  new Panel();
		FlowPanel.setLayout(flowLayout);
		//���ð�ť
		first = new Button("��һҳ");
		last = new Button("���һҳ");
		next = new Button("��һҳ");
		prev = new Button("��һҳ");
		FlowPanel.add(first);
		FlowPanel.add(last);
		FlowPanel.add(next);
		FlowPanel.add(prev);
		//���ñ�ǩ
		label1=new Label("��һҳ����",Label.CENTER);
		label2=new Label("�ڶ�ҳ����",Label.CENTER);
		label3=new TextArea();
		label4=new Label("����ҳ����",Label.CENTER);
		//������ǩ����Ƭ���
		CardPanel.add(label1);
		CardPanel.add(label2);
		CardPanel.add(label3);
		CardPanel.add(label4);
		
		//�����ŵ�����
		this.add(CardPanel,BorderLayout.CENTER);
		this.add(FlowPanel,BorderLayout.SOUTH);
		
		//ע�ᰴť����
		
		first.addActionListener(RegistorListener);
		last.addActionListener(RegistorListener);
		next.addActionListener(RegistorListener);
		prev.addActionListener(RegistorListener);
		
		//�����������¼�
		label1.addMouseMotionListener(new MouseAdapter() {
			
			public void mouseMoved(MouseEvent e){
				label1.setText(e.getX()+":"+e.getY());
			}

			
		});
		
		label2.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				label2.setText("��굥��");
			}
			public void mouseReleased(MouseEvent e) {
				label2.setText("��갴���϶�");
			}
			
			public void mouseEntered(MouseEvent e) {
				label2.setText("������");
			}
			
			public void mouseExited(MouseEvent e) {
				label2.setText("����뿪");
			}
			
		}); 
		
		//���Լ��̼����¼�
		
		label3.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e){
				
				System.out.println(e.getKeyChar());
			}
			
			
		});

		
		
		//��ʾ���
		this.setVisible(true);
		//���ڹرհ�ť�����¼�
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		

		
			
	}
	//��ť����
	//ʵ����Ϊ�����ӿ�

	class ButtonListener implements ActionListener{

		@Override
		//ִ�еĲ���
		public void actionPerformed(ActionEvent e) {
			//System.out.println(e.getActionCommand());//������˶�����ص������ַ���
			//System.out.println(e.getSource()); //����һ���¼�Դ
			Object object = e.getSource();
			if(object==first){
				cardLayout.first(CardPanel);
			}else if(object==last){
				cardLayout.last(CardPanel);
			}else if(object==next){
				cardLayout.next(CardPanel);
			}else if(object==prev){
				cardLayout.previous(CardPanel);
			}
		}
		
		
		
	}
	
}





