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
		System.out.println("*********欢迎使用教务登陆系统*********");
		System.out.println("*********请选择用户组*****************");
		System.out.println("*********1.管理员*********************");
		System.out.println("*********2.学生***********************");
		System.out.println("*********3.退出***********************");
		System.out.println("**************************************");
		int num = 0;
		try{
			num = input.nextInt();
		}catch(InputMismatchException e){
			System.out.println("输入错误");
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
	//管理员用户
	public class Admin{
		public void Login(){
			data.setAdmin();
			System.out.println("********管理员登陆界面************");
			System.out.println("请输入管理员用户名和密码");
			System.out.println("用户名:");
			String user = input.next();
			System.out.println("密码:");
			String pwd = input.next();
			if(data.Passwd(user,pwd)!=null){
				System.out.println("登陆成功");
				Features();
				
			}else {
				System.out.println("登陆失败");
				logo();
			}
			//Features();
		}
		
		public void Features(){
			System.out.println("请输入要使用的编号");
			System.out.println("1 添加学生");
			System.out.println("2 查看学生");
			System.out.println("3 返回登陆界面");
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
	//学生用户
	
	public class Student{
		//Scanner input = new Scanner(System.in);
		//Data fdata = new Data();
		//Data.SaveData data = fdata.new SaveData();
		//Admin admin = new Admin();
		public void Login(){
			System.out.println("请输入用户名密码");
			System.out.print("用户名:");
			String user = input.next();
			System.out.println();
			System.out.print("密码:");
			String pwd = input.next();
			if(data.Passwd(user,pwd)!=null){
				System.out.println("登陆成功");
				sdata = data.Passwd(user,pwd);
				data.showData(sdata);
				Features();
				
			}else {
				System.out.println("登陆失败");
				logo();
			}
			
			
		}
		
		public void Features(){
			System.out.println("请输入要使用的编号");
			System.out.println("1 返回登陆界面");
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
	//添加数据
	public void setData(){
		SaveData data = new SaveData();
		System.out.println("请输入姓名");
		data.setName(input.next());
		System.out.println("请设置密码");
		data.setPwd(input.next());
		Save(data);
		System.out.println("添加完成");
	}
		//保存数据
	public void Save(SaveData data){

		for(int i = 0;i<D.length;i++){
			if(D[i]==null){
				D[i]=data;
				break;
			}
			
		}
		//D[count++]=data;
	}
	
	//查找数据
	public void getData(){
		System.out.println("输入要查找的编号");
		int num = input.nextInt();
		System.out.println(D[num]);
	}
	//显示信息
	public void showData(SaveData data){
		System.out.println(data);
	}
	
	//密码判断
	public SaveData Passwd(String name,String pwd){
		SaveData tmp = null;
		for(int i = 0;i<D.length;i++){
			tmp=D[i];
			if(tmp!=null&&tmp.name.equals(name)&&tmp.pwd.equals(pwd)){
				tmp = D[i];
				break;
			}else if(tmp!=null&&tmp.name.equals(name)&&tmp.pwd.equals(pwd)==false){
				System.out.println("密码输入错误");
				tmp=null;
				break;
			}else if(tmp!=null&&tmp.name.equals(name)==false&&i==D.length){
				System.out.println("用户名错误");
				tmp=null;
				break;
			}else if(tmp==null&&i==D.length){
				System.out.println("找不到用户名");
				break;
			}
			
			
			
		}
		return tmp;
	}
	//添加管理员账号
	public void setAdmin(){
		SaveData data = new SaveData();
		data.setName("admin");
		data.setPwd("admin");
		D[0]=data;
	}


	//数据属性
	public class SaveData{
		
		private String name;//姓名
		private String sex;//性别
		private int age;//年龄
		private String College; //学院
		private String profession;//专业
		private int number;//学号
		private int ID;//编号
		private String pwd;//密码
	
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
			return "姓名:"+name;
		}

	}

	
}

