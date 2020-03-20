package com.zhoupb.sign.day10;

public class Main_3 {
	
	/**
	 * 任务三：统计同构数关键算法
	 * 编写程序输出2~99之间的同构数。
	 * 同构数是指这个数为该数平方的尾数，
	 * 例如5的平方为25，6的平方为36，25的平方为625，则5、6、25都为同构数。
	 * 注意：调用带有一个输入参数的函数(或方法)实现，
	 * 此函数(或方法)用于判断某个整数是否为同构数，输入参数为一个整型参数，返回值为布尔型（是否为同构数）。
	 */

	public static void main(String args[])
	{
		for (int i = 2; i <= 99; i++)
			if (f(i)) System.out.print(i + " ");
	}
	
	static boolean f(int n)
	{
		return String.valueOf(n * n).lastIndexOf(String.valueOf(n)) >= 0;
	}
	
}
