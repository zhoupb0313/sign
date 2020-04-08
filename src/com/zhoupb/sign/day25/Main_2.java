package com.zhoupb.sign.day25;

import java.util.Scanner;

public class Main_2 {
	
	/**
	 * 任务二：趣味动物问题关键算法
	 * 动物园里新来了两只骆驼，那么你可以计算出它们年龄的最小公倍数么？
	 * 从键盘输入两个整数，输出两个整数的最小公倍数。
	 * 要求： 用循环语句实现
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int a = in.nextInt(), b = in.nextInt();
		int ta = a, tb = b;
		while (tb != 0)
		{
			int t = ta;
			ta = tb;
			tb = t % tb;
		}
		System.out.println(a / ta * b);
	}
	
}
