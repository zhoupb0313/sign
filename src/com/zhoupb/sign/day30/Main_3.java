package com.zhoupb.sign.day30;

import java.util.Scanner;

public class Main_3 {
	
	/**
	 * 任务三：统数功能关键算法
	 * 从键盘接收一个正整数，请计算该整数的二进制形式中1的个数。例如2的二进制为10，则输出1。
	 * 注意：使用循环语句实现。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt(), x, ans = 0;
		for (; n != 0; n -= x)
		{
			x = n & (~n + 1);
			//x = n & -n;
			ans++;
		}
		System.out.println(ans);
	}
	
}
