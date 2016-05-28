/*线性比较法*/

public class ArrayCompar{
	public static void main(String [] args){
		int [] array = {10,34,25,45,6,23,44,2,48};
		int max=array[0];
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("最大值是"+max+"最小值是"+min);
	}
}