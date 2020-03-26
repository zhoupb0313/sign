package com.zhoupb.sign.day15;

import java.util.*;

public class Main_3 {
	
	/**
	 * 任务三：阶乘运算功能关键算法
	 * 阶乘指从1乘以2乘以3乘以4一直乘到所要求的数。
	 * 当n=5，求表达式为： 1/1！+1/2！+1/3！+…+1/n！的值，保留4位小数位。
	 * 其中n！表示n的阶乘，例如3！=3×2×1=6，5！=5×4×3×2×1=120。
	 * 注意：要求的是  1/1！+1/2！+1/3！+…+1/n！的值，看清楚题目。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt();
		double ans = 0;
		for (int i = 1; i <= n; i++)
			ans += 1.0 / f(i);
		System.out.printf("%.4f", ans);
	}
	
	public static long f(int n)
	{
		if (n == 1) return 1;
		return n * f(n - 1);
	}
	
}
