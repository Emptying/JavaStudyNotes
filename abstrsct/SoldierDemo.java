public class SoldierDemo{
	public static void main(String [] args){
		Officer officer = new Officer("����");
		officer.command("ȫ�����");
	}
}

abstract class Soldier{
	private String name;//ʿ������
	public Soldier(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	//ʿ������Ϊ
	public void start(){
		System.out.println("׼��������������");
	}
	
	public abstract void attack();
	
	public void end(){
		System.out.println("��������");
	}
	
	public void Action(){
		start();
		attack();
		end();
	}
	
}
//½��
class Army extends Soldier{
	public Army(String name){
		super(name);
	}
	
	public void attack(){
		System.out.println(getName()+"��ǹ����������");
	}
	
}
//����
class Navy extends Soldier{
	public Navy(String name){
		super(name);
	}
	public void attack(){
		System.out.println(getName()+"�������������");
	}
}

//����
class Officer extends Soldier{
	public Soldier [] soldier = new Soldier[2];
	
	public Officer(String name){
		super(name);
		soldier[0] = new Army("½��");
		soldier[1] = new Navy("����");
	}
	public void attack(){
		System.out.println(getName()+"��ǹ����������");
	}
	//ָ�ӹ���
	public void command(String name){
		if(name.equals("½��")){
			soldier[0].Action();
		}else if(name.equals("����")){
			soldier[1].Action();
		}else if(name.equals("����")){
			Action();
		}else if(name.equals("ȫ�����")){
			for(int i=0;i<soldier.length;i++){
				soldier[i].Action();
			}
			Action();
		}
		
	}
	
}
