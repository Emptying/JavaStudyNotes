//����Ĵ�����ʹ��

public class cat{
	public double Weight;//è������
	public String Variety;//è��Ʒ��
	public String Color;//è����ɫ
	public String toString(){
		return "����һֻ��"+Weight+"ǧ��"+"��"+Color+Variety;
	}
	
	public static void main(String [] args){
		cat M = new cat();   //������һ��cat���͵Ķ���
		M.Weight = 3.5;
		M.Color = "��ɫ";
		M.Variety = "�ӷ�è";
		System.out.println(M.toString());
	}
}