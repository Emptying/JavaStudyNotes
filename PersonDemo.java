public class PersonDemo{
	public static void main(String [] args){
		Student student = new Student("����",9,60);
		student.ShowName();
		student.ShowAge();
		student.Eat();
		student.Run();
		student.toSchool();
		student.Learing();
		student.ShowScore();
	}
}

class Person{
	private String Name;
	private int Age;
	public Person(String Name,int Age){
		this.Name=Name;
		this.Age=Age;
	}
	public void Eat(){
		System.out.println("�Է�");
	}
	
	public void Run(){
		System.out.println("��·");
	}
	public void ShowName(){
		System.out.println("�ҽ�"+Name);
	}
	public void ShowAge(){
		System.out.println("����"+Age+"��");
	}
}

class Student extends Person{

	public Student(String Name,int Age,int Score){
		super(Name,Age);
		this.Score=Score;
	}
	private int Score;
	
	public void ShowScore(){
		System.out.println("�ɼ�"+Score+"��");
	}
	
	public void toSchool(){
		System.out.println("ȥѧУ");
	}
	
	public void Learing(){
		System.out.println("ѧϰ");
	}
}