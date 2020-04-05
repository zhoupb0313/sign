package com.zhoupb.sign.day17;

import java.util.Scanner;

public class Main_3 {
	
	/**
	 * 任务三：算数游戏功能关键算法
	 * 游戏主要是这样的，计算正整数n各位上的数字之积，
	 * 现在要求你为A公司编写一个请编写函数(或方法)fun，将结果放到c中。作为参考答案。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = in.nextInt();
		int c = fun(n);
		System.out.println(c);
	}
	
	static int fun(int n)
	{
		int ans = 0;
		while (n != 0)
		{
			ans += n % 10;
			n /= 10;
		}
		return ans;
	}
	
}
