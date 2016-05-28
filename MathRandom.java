import java.util.Random;
public class MathRandom{
	public static void main(String[]args){
		System.out.println(Math.floor(11.58));
		System.out.println(Math.ceil(-11.38));
		System.out.println(Math.round(11.58));//四舍五入
		System.out.println(Math.pow(8,4));//返回第一个参数的第二个参数次幂的值。也就是8的4次方
		
		Random random = new Random();

        for(int i=0;i<10;i++){

            int tmp = random.nextInt(10);
            System.out.println(tmp);
        }
	}
}