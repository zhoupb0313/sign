package com.zhoupb.sign.day24;

import java.util.*;

public class Main_3 {

	/**
	 * 任务三：求前n项之和功能关键算法
	 * 多项式的描述如下：1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + ...，现在要求出该多项式的前n项的和。
	 * 要求：结果保留两位小数。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt();
		int k = 1, t = 1;
		double ans = 0;
		for (int i = 0; i < n; t *= -1, i++)
			ans += 1.0 / k++ * t;
		System.out.printf("%.2f\n", ans);
	}
	
}
