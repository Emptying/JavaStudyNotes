public class SoldierDemo{
	public static void main(String [] args){
		Officer officer = new Officer("军官");
		officer.command("全体进攻");
	}
}

abstract class Soldier{
	private String name;//士兵名字
	public Soldier(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	//士兵的行为
	public void start(){
		System.out.println("准备攻击。。。。");
	}
	
	public abstract void attack();
	
	public void end(){
		System.out.println("攻击结束");
	}
	
	public void Action(){
		start();
		attack();
		end();
	}
	
}
//陆军
class Army extends Soldier{
	public Army(String name){
		super(name);
	}
	
	public void attack(){
		System.out.println(getName()+"步枪攻击。。。");
	}
	
}
//海军
class Navy extends Soldier{
	public Navy(String name){
		super(name);
	}
	public void attack(){
		System.out.println(getName()+"鱼雷射击。。。");
	}
}

//军官
class Officer extends Soldier{
	public Soldier [] soldier = new Soldier[2];
	
	public Officer(String name){
		super(name);
		soldier[0] = new Army("陆军");
		soldier[1] = new Navy("海军");
	}
	public void attack(){
		System.out.println(getName()+"手枪攻击。。。");
	}
	//指挥攻击
	public void command(String name){
		if(name.equals("陆军")){
			soldier[0].Action();
		}else if(name.equals("海军")){
			soldier[1].Action();
		}else if(name.equals("军官")){
			Action();
		}else if(name.equals("全体进攻")){
			for(int i=0;i<soldier.length;i++){
				soldier[i].Action();
			}
			Action();
		}
		
	}
	
}
