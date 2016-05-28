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
		new Myjframe("���±�");

	}

}

class Myjframe extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//��ӹ������
	JScrollPane scrollPane;
	
	//��Ӳ˵���
	private JMenuBar jMenuBar;
	//��Ӳ˵�
	private JMenu file;
	private JMenu help;
	
	//��Ӳ˵���
	private JMenuItem create;
	private JMenuItem open;
	private JMenuItem exit;
	private JMenuItem about;
	//��Ӷ��б༭��
	private JTextArea textArea;
	
	
	public Myjframe (String title){
		super(title);
		init();
		regsiterlistener();
	}
	//��ʼ��
	public void init(){
		this.setSize(500, 400);//���ô����С
		//�½����б༭��
		textArea = new JTextArea();
		
		//�½��������
		scrollPane = new JScrollPane(textArea);
		//�½��˵���
		jMenuBar = new JMenuBar();
		//�½��˵�
		file = new JMenu("�ļ�");
		help = new JMenu("����");
		//�½��˵���
		create = new JMenuItem("�½�");
		open = new JMenuItem("��");
		exit = new JMenuItem("�˳�");
		about = new JMenuItem("����");
		
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//��ȡ��ǰĬ�ϵ��������
		Container cpane = this.getContentPane();
		
		//�ڵ�ǰ�����ӹ������
		cpane.add(scrollPane, BorderLayout.CENTER);	
		
		//�ڲ˵�����Ӳ˵���
		file.add(create);
		file.add(open);
		file.add(exit);
		help.add(about);
		
		
		//�ڴ�����Ӳ˵���
		this.setJMenuBar(jMenuBar);
		//�ڲ˵�����Ӳ˵�
		jMenuBar.add(file);
		jMenuBar.add(help);
		
		//���ô���λ��
		Helper.windowcenter(this);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//�رմ���ʱ�˳�Ӧ�ó���
		
		this.setVisible(true);//���ô�����ʾ
		
		
		
		
	}

	//ע�����
	
	private void regsiterlistener(){
		//�½�ѡ������¼�
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
		
		//�˳��˵������
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
	//�½�����
	private int create(){
		int res=0;
		if(!textArea.getText().isEmpty()){
			res=JOptionPane.showConfirmDialog(this, "�Ƿ񱣴�");
			System.out.println(res);
			if(res==0){
				FileDialog newfile =  new FileDialog(this, "����", FileDialog.SAVE);
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
	
	//�򿪶���
	
	private void open(){
		FileDialog  openfile = new FileDialog(Myjframe.this, "��", FileDialog.LOAD);
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
	//�˳�
	
	private void exit(){
		int res=create();
		if(res!=2){
			System.exit(1);
		}
		
	}
	
	
	//����
	private void about(){
		new AboutDialog(this, "����-���±�", true);

	}
		
	
}
//�½��Ի���
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
		Toolkit toolkit = frame.getToolkit();//��ȡһ��kit����
		Dimension dimension = toolkit.getScreenSize();//��ȡ��Ļ�ߴ�
		double screenWidth = dimension.getWidth();//��ȡ��Ļ���
		double screenHeight = dimension.getHeight();//��ȡ��Ļ�߶�
		double windowWidth = frame.getWidth();//��ȡ������
		double windowHeigth =  frame.getHeight();//��ȡ����߶�
		
		//���ô�����ʾλ��
		frame.setLocation((int)(screenWidth-windowWidth)/2,(int)(screenHeight-windowHeigth)/2);
	}
	

}