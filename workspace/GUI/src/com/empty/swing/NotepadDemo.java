package com.empty.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotepadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Myjframe("记事本");

	}

}

class Myjframe extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//添加滚动面板
	JScrollPane scrollPane;
	
	//添加菜单栏
	private JMenuBar jMenuBar;
	//添加菜单
	private JMenu file;
	private JMenu help;
	
	//添加菜单项
	private JMenuItem create;
	private JMenuItem open;
	private JMenuItem exit;
	private JMenuItem about;
	//添加多行编辑框
	private JTextArea textArea;
	
	
	public Myjframe (String title){
		super(title);
		init();
		regsiterlistener();
	}
	//初始化
	public void init(){
		this.setSize(500, 400);//设置窗体大小
		//新建多行编辑框
		textArea = new JTextArea();
		
		//新建滚动面板
		scrollPane = new JScrollPane(textArea);
		//新建菜单栏
		jMenuBar = new JMenuBar();
		//新建菜单
		file = new JMenu("文件");
		help = new JMenu("帮助");
		//新建菜单项
		create = new JMenuItem("新建");
		open = new JMenuItem("打开");
		exit = new JMenuItem("退出");
		about = new JMenuItem("关于");
		
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//获取当前默认的容器面板
		Container cpane = this.getContentPane();
		
		//在当前面板添加滚动面板
		cpane.add(scrollPane, BorderLayout.CENTER);	
		
		//在菜单下添加菜单项
		file.add(create);
		file.add(open);
		file.add(exit);
		help.add(about);
		
		
		//在窗体添加菜单栏
		this.setJMenuBar(jMenuBar);
		//在菜单栏添加菜单
		jMenuBar.add(file);
		jMenuBar.add(help);
		
		//设置窗体位置
		Helper.windowcenter(this);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//关闭窗口时退出应用程序
		
		this.setVisible(true);//设置窗体显示
		
		
		
		
	}

	//注册监听
	
	private void regsiterlistener(){
		//新建选项监听事件
		create.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				create();
				
			}
		});
		
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				open();
				
			}
		});
		
		//退出菜单项监听
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				exit();
			}
		});
		
		about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				about();
				
			}
		});
		
	}
	//新建功能
	private int create(){
		int res=0;
		if(!textArea.getText().isEmpty()){
			res=JOptionPane.showConfirmDialog(this, "是否保存");
			System.out.println(res);
			if(res==0){
				FileDialog newfile =  new FileDialog(this, "保存", FileDialog.SAVE);
				newfile.setVisible(true);
				String newname = newfile.getDirectory()+newfile.getFile();
				try {
					FileWriter fw = new FileWriter(newname);
					fw.write(textArea.getText());
					fw.flush();
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
			}else if(res==1){
				textArea.setText("");
			}
		}
		return res;
	}
	
	//打开动能
	
	private void open(){
		FileDialog  openfile = new FileDialog(Myjframe.this, "打开", FileDialog.LOAD);
		openfile.setVisible(true);
		
		String pathname = openfile.getDirectory()+openfile.getFile();
		
		try {
			FileInputStream fis = new FileInputStream(pathname);
			byte[] bytes = new byte[fis.available()];
			fis.read(bytes);
			fis.close();
			
			textArea.setText(new String(bytes));
			//line = bf.readLine();
			//;
			//System.out.println(line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	//退出
	
	private void exit(){
		int res=create();
		if(res!=2){
			System.exit(1);
		}
		
	}
	
	
	//关于
	private void about(){
		new AboutDialog(this, "关于-记事本", true);

	}
		
	
}
//新建对话框
class AboutDialog extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton button;
	private JLabel label;
	private JPanel panel;
	
	public AboutDialog(Frame frame,String titel,boolean model){
		super(frame,titel,model);
		init();
	}
	private void init(){
		button = new JButton("ok");
		label = new JLabel();
		panel = new JPanel();
		this.setSize(300,300);
		label.setText("<html>this is My a first new NotePad</html>");
		panel.add(button);
		this.add(label);
		this.add(panel,BorderLayout.SOUTH);
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				AboutDialog.this.dispose();
			}
		});
		Helper.windowcenter(this);
		this.setVisible(true);
	}
	
	
}


class  Helper{
	public static void windowcenter(Component frame){
		Toolkit toolkit = frame.getToolkit();//获取一个kit工具
		Dimension dimension = toolkit.getScreenSize();//获取屏幕尺寸
		double screenWidth = dimension.getWidth();//获取屏幕宽度
		double screenHeight = dimension.getHeight();//获取屏幕高度
		double windowWidth = frame.getWidth();//获取窗体宽度
		double windowHeigth =  frame.getHeight();//获取窗体高度
		
		//设置窗体显示位置
		frame.setLocation((int)(screenWidth-windowWidth)/2,(int)(screenHeight-windowHeigth)/2);
	}
	

}