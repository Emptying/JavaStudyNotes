public class Student {
	public int sid;// ���
	public String sno;// ѧ��
	public String sname;// ����
	public String sex;// �Ա�
	public String sdate;// ��������
	public String stel;// �绰
	public String sadd;// ��ַ

	public static void main(String[] args) {
		//����Student����
		/*��������д����*/
		Student student = new Student();
	
		student.sid = 1;
		student.sno = "HT142101";
		student.sname = "����";
		student.sex = "Ů";
		student.sdate = "1986-11-28";
		student.stel = "182-****-6836";
		student.sadd = "�Ϻ���������֧·95��";
		student.introduction();
		//�������ҽ��ܵķ���
		/*��������д����*/
	
	}
	
	public void introduction() {
		System.out.println("Student [sid=" + sid + ", sno=" + sno + ", sname="
				+ sname + ", sex=" + sex + ", sdate=" + sdate + ", stel="
				+ stel + ", sadd=" + sadd + "]");
	}

}