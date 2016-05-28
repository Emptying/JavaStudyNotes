public class PersonDemo{
	public static void main(String [] args){
		Student student = new Student("张三",9,60);
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
		System.out.println("吃饭");
	}
	
	public void Run(){
		System.out.println("走路");
	}
	public void ShowName(){
		System.out.println("我叫"+Name);
	}
	public void ShowAge(){
		System.out.println("今年"+Age+"岁");
	}
}

class Student extends Person{

	public Student(String Name,int Age,int Score){
		super(Name,Age);
		this.Score=Score;
	}
	private int Score;
	
	public void ShowScore(){
		System.out.println("成绩"+Score+"分");
	}
	
	public void toSchool(){
		System.out.println("去学校");
	}
	
	public void Learing(){
		System.out.println("学习");
	}
}