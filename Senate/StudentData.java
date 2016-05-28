import java.util.Scanner;
import java.util.InputMismatchException;
public class StudentData{
	public static void main(String [] args){
		Administrator admin = new Administrator();
		admin.logo();
	}

}



class Administrator{
	Scanner input = new Scanner(System.in);
	Student student = new Student();
	Admin admin = new Admin();
	Data data = new Data();
	Data.SaveData sdata = data.new SaveData();
	public void logo(){
		System.out.println("**************************************");
		System.out.println("*********��ӭʹ�ý����½ϵͳ*********");
		System.out.println("*********��ѡ���û���*****************");
		System.out.println("*********1.����Ա*********************");
		System.out.println("*********2.ѧ��***********************");
		System.out.println("*********3.�˳�***********************");
		System.out.println("**************************************");
		int num = 0;
		try{
			num = input.nextInt();
		}catch(InputMismatchException e){
			System.out.println("�������");
			System.out.println(e.getMessage());
		}
		switch(num){
			case 1: admin.Login();
			break;
			case 2: student.Login();
			break;
			case 3: System.exit(0);
		}
	}
	//����Ա�û�
	public class Admin{
		public void Login(){
			data.setAdmin();
			System.out.println("********����Ա��½����************");
			System.out.println("���������Ա�û���������");
			System.out.println("�û���:");
			String user = input.next();
			System.out.println("����:");
			String pwd = input.next();
			if(data.Passwd(user,pwd)!=null){
				System.out.println("��½�ɹ�");
				Features();
				
			}else {
				System.out.println("��½ʧ��");
				logo();
			}
			//Features();
		}
		
		public void Features(){
			System.out.println("������Ҫʹ�õı��");
			System.out.println("1 ���ѧ��");
			System.out.println("2 �鿴ѧ��");
			System.out.println("3 ���ص�½����");
			int num = input.nextInt();
			switch(num){
				case 1: data.setData();
						break;
				case 2: data.getData();
						break;
				case 3: logo();
						break;
			}
			Features();
			
		}
		
		
		
		
	}
	//ѧ���û�
	
	public class Student{
		//Scanner input = new Scanner(System.in);
		//Data fdata = new Data();
		//Data.SaveData data = fdata.new SaveData();
		//Admin admin = new Admin();
		public void Login(){
			System.out.println("�������û�������");
			System.out.print("�û���:");
			String user = input.next();
			System.out.println();
			System.out.print("����:");
			String pwd = input.next();
			if(data.Passwd(user,pwd)!=null){
				System.out.println("��½�ɹ�");
				sdata = data.Passwd(user,pwd);
				data.showData(sdata);
				Features();
				
			}else {
				System.out.println("��½ʧ��");
				logo();
			}
			
			
		}
		
		public void Features(){
			System.out.println("������Ҫʹ�õı��");
			System.out.println("1 ���ص�½����");
			int num = input.nextInt();
			switch(num){
				case 1: logo();
				break;
			}
			

		}
	}
}





class Data{
	
	Scanner input = new Scanner(System.in);
	private static SaveData [] D = new SaveData[100];
	//private int count = 0;
	//�������
	public void setData(){
		SaveData data = new SaveData();
		System.out.println("����������");
		data.setName(input.next());
		System.out.println("����������");
		data.setPwd(input.next());
		Save(data);
		System.out.println("������");
	}
		//��������
	public void Save(SaveData data){

		for(int i = 0;i<D.length;i++){
			if(D[i]==null){
				D[i]=data;
				break;
			}
			
		}
		//D[count++]=data;
	}
	
	//��������
	public void getData(){
		System.out.println("����Ҫ���ҵı��");
		int num = input.nextInt();
		System.out.println(D[num]);
	}
	//��ʾ��Ϣ
	public void showData(SaveData data){
		System.out.println(data);
	}
	
	//�����ж�
	public SaveData Passwd(String name,String pwd){
		SaveData tmp = null;
		for(int i = 0;i<D.length;i++){
			tmp=D[i];
			if(tmp!=null&&tmp.name.equals(name)&&tmp.pwd.equals(pwd)){
				tmp = D[i];
				break;
			}else if(tmp!=null&&tmp.name.equals(name)&&tmp.pwd.equals(pwd)==false){
				System.out.println("�����������");
				tmp=null;
				break;
			}else if(tmp!=null&&tmp.name.equals(name)==false&&i==D.length){
				System.out.println("�û�������");
				tmp=null;
				break;
			}else if(tmp==null&&i==D.length){
				System.out.println("�Ҳ����û���");
				break;
			}
			
			
			
		}
		return tmp;
	}
	//��ӹ���Ա�˺�
	public void setAdmin(){
		SaveData data = new SaveData();
		data.setName("admin");
		data.setPwd("admin");
		D[0]=data;
	}


	//��������
	public class SaveData{
		
		private String name;//����
		private String sex;//�Ա�
		private int age;//����
		private String College; //ѧԺ
		private String profession;//רҵ
		private int number;//ѧ��
		private int ID;//���
		private String pwd;//����
	
		public void setName(String name){
			this.name = name;
		}
		public void setSex(String sex){
			this.sex = sex;
		}
		public void setAge(int age){
			this.age = age;
		}
		public void setCollege(String college){
			this.College = college;
		}
		public void setProfession(String profession){
			this.profession = profession;
		}
		public void setNumber(int number){
			this.number = number;
		}
		public void setID(int ID){
			this.ID = ID;
		}
		public void setPwd(String pwd){
			this.pwd = pwd; 
		}
		
		public String toString(){
			return "����:"+name;
		}

	}

	
}

