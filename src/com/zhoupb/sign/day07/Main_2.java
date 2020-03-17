package com.zhoupb.sign.day07;

import java.util.*;

public class Main_2 {

	/**
	 * 任务二：求平方根关键算法
	 * 求n以内（不包括n）同时能被3和7整除的所有自然数之和的平方根s，然后将结果s输出。
	 * 例如若n为1000时，则s=153.909064。
	 * 注意：使用循环语句结构实现。 ②n由键盘输入，且100 ≤ n ≤10000。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = in.nextInt();
		int x = 0;
		for (int i = 1; i < n; i++) 
			if (i % 3 == 0 && i % 7 == 0) x += i;
		double l = 0, r = x;
		while (r - l > 1e-8)
		{
			double mid = (r + l) / 2;
			if (mid * mid >= x) r = mid;
			else l = mid;
		}
		System.out.printf("%.6f", l);
	}
	
}
