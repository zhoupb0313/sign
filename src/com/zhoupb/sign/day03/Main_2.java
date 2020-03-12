package com.zhoupb.sign.day03;

public class Main_2 {
	
	/**
	 * 任务二：阶乘计算功能关键算法
	 * 利用递归方法求5!
	 * 用递归方式求出阶乘的值。递归的方式为：
	 * 5!=4!*5
	 * 4!=3!*4
	 * 3!=2!*3
	 * 2!=1!*2
	 * 1!=1
	 * 即要求出5!，先求出4!；要求出4!，先求出3! … 以此类推。 
	 * 注意：定义一个函数(或方法)，用于求阶乘的值。
	 * 在主函数(或主方法)中调用该递归函数(或方法)，求出5的阶乘，并输出结果。
	 */
	
	public static void main(String[] args)
	{
		System.out.println(f(5));
	}
	
	public static int f(int n)
	{
		if (n == 1) 
		{
			System.out.println("1!=1");
			return 1;
		}
//		System.out.printf("%d!=%d!*%d\n", n, n - 1, n);
		System.out.println(n + "!=" + (n - 1) + "*" + n);
		return n * f(n - 1);
	}

}
