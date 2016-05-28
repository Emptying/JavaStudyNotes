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
	
	//添加按钮
	private Button first;
	private Button last;
	private Button next;
	private Button prev;
	//添加面板
	private Panel CardPanel;
	private Panel FlowPanel;
	
	//添加布局
	private CardLayout cardLayout;
	private FlowLayout flowLayout;
	
	private Label label1;
	private Label label2;
	private TextArea label3;
	private Label label4;
	
	//按钮注册监听
	ButtonListener RegistorListener =new ButtonListener();
	
	
	public MyFrame6(String title){
		super(title);
		init();
	}
	public void init(){
		//设置窗体
		this.setSize(300,400);
		//this.setBackground(Color.blue);
		//设置布局
		cardLayout = new CardLayout();
		flowLayout =  new FlowLayout();
		//设置面板
		CardPanel =  new Panel();
		CardPanel.setLayout(cardLayout);
		
		FlowPanel =  new Panel();
		FlowPanel.setLayout(flowLayout);
		//设置按钮
		first = new Button("第一页");
		last = new Button("最后一页");
		next = new Button("下一页");
		prev = new Button("上一页");
		FlowPanel.add(first);
		FlowPanel.add(last);
		FlowPanel.add(next);
		FlowPanel.add(prev);
		//设置标签
		label1=new Label("第一页内容",Label.CENTER);
		label2=new Label("第二页内容",Label.CENTER);
		label3=new TextArea();
		label4=new Label("第四页内容",Label.CENTER);
		//条件标签到卡片面板
		CardPanel.add(label1);
		CardPanel.add(label2);
		CardPanel.add(label3);
		CardPanel.add(label4);
		
		//把面板放到窗体
		this.add(CardPanel,BorderLayout.CENTER);
		this.add(FlowPanel,BorderLayout.SOUTH);
		
		//注册按钮监听
		
		first.addActionListener(RegistorListener);
		last.addActionListener(RegistorListener);
		next.addActionListener(RegistorListener);
		prev.addActionListener(RegistorListener);
		
		//测试鼠标监听事件
		label1.addMouseMotionListener(new MouseAdapter() {
			
			public void mouseMoved(MouseEvent e){
				label1.setText(e.getX()+":"+e.getY());
			}

			
		});
		
		label2.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				label2.setText("鼠标单击");
			}
			public void mouseReleased(MouseEvent e) {
				label2.setText("鼠标按下拖动");
			}
			
			public void mouseEntered(MouseEvent e) {
				label2.setText("鼠标进入");
			}
			
			public void mouseExited(MouseEvent e) {
				label2.setText("鼠标离开");
			}
			
		}); 
		
		//测试键盘监听事件
		
		label3.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e){
				
				System.out.println(e.getKeyChar());
			}
			
			
		});

		
		
		//显示面板
		this.setVisible(true);
		//窗口关闭按钮监听事件
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		

		
			
	}
	//按钮监听
	//实现行为监听接口

	class ButtonListener implements ActionListener{

		@Override
		//执行的操作
		public void actionPerformed(ActionEvent e) {
			//System.out.println(e.getActionCommand());//返回与此动作相关的命令字符串
			//System.out.println(e.getSource()); //返回一个事件源
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





