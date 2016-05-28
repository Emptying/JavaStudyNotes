package com.empty.file;

public class FactorialDemo {

	public static void main(String[] args) {
		System.out.println(FactorialHelper.Factorial(5));
	}

}
//阶乘的关系式  N!=n*n-1!
//如求5的阶乘就会先求4的阶乘接着求3的阶乘再求2的阶乘再求1的阶乘
//逐层进入直到第一层得到第一层的返回值后计算出第二层的返回值以此类推

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

