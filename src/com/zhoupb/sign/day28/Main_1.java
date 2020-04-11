package com.zhoupb.sign.day28;

import java.util.Scanner;

public class Main_1 {
	
	/**
	 * 任务一：打印功能1关键算法
	 * 从键盘接收一个整数n，请打印一个由”*”号组成的长度和宽度均为n的空心矩形。
	 * 例如输入：4你要在屏幕打印如下图形：
	 * ****
	 * *  *
	 * *  *
	 * ****
	 * 注意：使用嵌套循环语句实现。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt();
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) System.out.print("*");
				else System.out.print(" ");
			System.out.println();
		}
	}
	
}
