import java.util.Arrays;
//import java.lang.System;
public class ArrayUtilDemo{
	public static void main(String [] args){
		int [] array = {2,3,4,5,7,1,9,8};
		int [] array2 = {2,3,4,5,6,1,9,8};
		/*1.数组拷贝
		int [] array2 = new int [15];
		System.arraycopy(array,0,array2,3,5); //（原数组，拷贝的起始下标位置，接收的数组，写入的起始下标位置，写入的个数）；
		for(int i = 0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
		*/
		
		/*2.数组排序and二分查找法
		Arrays.sort(array); //快速排序
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int index = Arrays.binarySearch(array,4);//二分查找法
		System.out.println(index);
		*/
		
		/*3.数组填充
		int [] array3 = new int [10];
		// Arrays.fill(array3,10);// 数组填充 （数组，内容）；
		Arrays.fill(array3,3,6,10); //指定下标范围填充
		for(int i = 0;i<array3.length;i++){
			System.out.print(array3[i]+" ");
		}
		*/
		
		/*4.数组比较 真返回true 假返回false 调用Arrays.equals(数组1，数组2);
		boolean flag = Arrays.equals(array,array2);
		System.out.println(flag);
		*/
		
		/* 5.拷贝数组方法 调用Arrays.copyOf(原数组，长度);
		int [] array2 = Arrays.copyOf(array,10);
		for(int i=0;i<array.length;i++){
			System.out.print(array2[i]+" ");
		}
		*/
		
		/*6.指定范围拷贝数组 调用Arrays.copyOfRange(原数组，起始下标，结束下标);
		int [] array2  = Arrays.copyOfRange(array,2,5);
		for(int i = 0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
		*/
	}
}