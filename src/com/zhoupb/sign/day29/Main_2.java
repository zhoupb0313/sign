package com.zhoupb.sign.day29;

import java.util.*;

public class Main_2 {

	/**
	 * 任务二：查数功能关键算法
	 * 求n（2<=n<=10）个整数中倒数第二小的数。每一个整数都独立看成一个数，
	 * 比如，有三个数分别是1，1，3，那么，第二小的数就是1。（每个数均小于100）
	 * 说明：首先输入一个整数n，然后输入n个数。请输出第2小的数。
	 * 例如输入：
	 * 5
	 * -5 -10 10 50 80
	 * 程序输出第2小的数：-5
	 * 注意：使用循环实现。
	 */
	
	static Scanner in = new Scanner(System.in);
	static int a[];
	
	static int sort(int l, int r, int k)
	{
		if (l >= r) return a[l];
		int i = l - 1, j = r + 1, x = a[l + r >> 1];
		while (i < j)
		{
			while (a[++i] < x);
			while (a[--j] > x);
			if (i < j) {int t = a[i]; a[i] = a[j]; a[j] = t;}
		}
		int sl = j - l + 1;
		if (sl >= k) return sort(l, j, k);
		else return sort(j + 1, r, k - sl);
	}
	
	public static void main(String args[])
	{
		int n = in.nextInt();
		a = new int[n + 2];
		for (int i = 0; i < n; i++) a[i] = in.nextInt();
		int t = sort(0, n, 2);
		System.out.println(t);
	}
	
}
