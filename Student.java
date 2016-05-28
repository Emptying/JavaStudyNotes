public class Student {
	public int sid;// 编号
	public String sno;// 学号
	public String sname;// 姓名
	public String sex;// 性别
	public String sdate;// 出生日期
	public String stel;// 电话
	public String sadd;// 地址

	public static void main(String[] args) {
		//创建Student对象
		/*在这里填写代码*/
		Student student = new Student();
	
		student.sid = 1;
		student.sno = "HT142101";
		student.sname = "黄桃";
		student.sex = "女";
		student.sdate = "1986-11-28";
		student.stel = "182-****-6836";
		student.sadd = "上海市徐汇区漕东支路95号";
		student.introduction();
		//调用自我介绍的方法
		/*在这里填写代码*/
	
	}
	
	public void introduction() {
		System.out.println("Student [sid=" + sid + ", sno=" + sno + ", sname="
				+ sname + ", sex=" + sex + ", sdate=" + sdate + ", stel="
				+ stel + ", sadd=" + sadd + "]");
	}

}