package com.empty.file;

public class FactorialDemo {

	public static void main(String[] args) {
		System.out.println(FactorialHelper.Factorial(5));
	}

}
//�׳˵Ĺ�ϵʽ  N!=n*n-1!
//����5�Ľ׳˾ͻ�����4�Ľ׳˽�����3�Ľ׳�����2�Ľ׳�����1�Ľ׳�
//������ֱ����һ��õ���һ��ķ���ֵ�������ڶ���ķ���ֵ�Դ�����

class FactorialHelper{
	public static int Factorial(int num){
		if(num==1){
			return 1;
		}else{
			int tmp=num*Factorial(num-1);
			return tmp;
		}
	}
}

