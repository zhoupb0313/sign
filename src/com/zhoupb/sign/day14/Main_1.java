package com.zhoupb.sign.day14;

import java.util.*;

public class Main_1 {
	
	/**
	 * 任务一：数字判断功能关键算法
	 * 输入三个整数x、y、z，请把这三个数由小到大输出。 
	 * 注意：使用分支结构语句实现。
	 */
	static Scanner in = new Scanner(System.in);

	public static void main(String args[])
	{
		int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
		if (x < y)
		{
			if (y < z) System.out.printf("%d %d %d", x, y, z);
			else if (z < x) System.out.printf("%d %d %d", z, x, y);
			else System.out.printf("%d %d %d", x, z, y);
		}
		else
		{
			if (x < z) System.out.printf("%d %d %d", y, x, z);
			else if (z < y) System.out.printf("%d %d %d", z, y, x);
			else System.out.printf("%d %d %d", y, z, x);
		}
	}
	
}
