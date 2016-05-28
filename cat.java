//对象的创建和使用

public class cat{
	public double Weight;//猫的体重
	public String Variety;//猫的品种
	public String Color;//猫的颜色
	public String toString(){
		return "这是一只重"+Weight+"千克"+"的"+Color+Variety;
	}
	
	public static void main(String [] args){
		cat M = new cat();   //构造了一个cat类型的对象
		M.Weight = 3.5;
		M.Color = "棕色";
		M.Variety = "加菲猫";
		System.out.println(M.toString());
	}
}