import java.util.Arrays;
//import java.lang.System;
public class ArrayUtilDemo{
	public static void main(String [] args){
		int [] array = {2,3,4,5,7,1,9,8};
		int [] array2 = {2,3,4,5,6,1,9,8};
		/*1.���鿽��
		int [] array2 = new int [15];
		System.arraycopy(array,0,array2,3,5); //��ԭ���飬��������ʼ�±�λ�ã����յ����飬д�����ʼ�±�λ�ã�д��ĸ�������
		for(int i = 0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
		*/
		
		/*2.��������and���ֲ��ҷ�
		Arrays.sort(array); //��������
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int index = Arrays.binarySearch(array,4);//���ֲ��ҷ�
		System.out.println(index);
		*/
		
		/*3.�������
		int [] array3 = new int [10];
		// Arrays.fill(array3,10);// ������� �����飬���ݣ���
		Arrays.fill(array3,3,6,10); //ָ���±귶Χ���
		for(int i = 0;i<array3.length;i++){
			System.out.print(array3[i]+" ");
		}
		*/
		
		/*4.����Ƚ� �淵��true �ٷ���false ����Arrays.equals(����1������2);
		boolean flag = Arrays.equals(array,array2);
		System.out.println(flag);
		*/
		
		/* 5.�������鷽�� ����Arrays.copyOf(ԭ���飬����);
		int [] array2 = Arrays.copyOf(array,10);
		for(int i=0;i<array.length;i++){
			System.out.print(array2[i]+" ");
		}
		*/
		
		/*6.ָ����Χ�������� ����Arrays.copyOfRange(ԭ���飬��ʼ�±꣬�����±�);
		int [] array2  = Arrays.copyOfRange(array,2,5);
		for(int i = 0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
		*/
	}
}