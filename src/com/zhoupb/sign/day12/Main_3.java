package com.zhoupb.sign.day12;

import java.util.*;

public class Main_3 {
	
	/**
	 * 任务三：打印中国结图案关键算法（30分）
	 * 由于中国结的形状是菱形图案，所以现在公司需要设计一个打印菱形的方法。
	 * 从键盘输入一个整数N，打印出有N*2-1行的菱形。
	 * 例如输入整数4，则屏幕输出如下菱形。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt() * 2 - 1;
		int mid = n >> 1;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
				if (Math.abs(mid - i) + Math.abs(mid - j) <= mid) System.out.print("*");
				else System.out.print(" ");
			System.out.println();
		}
	}

}
