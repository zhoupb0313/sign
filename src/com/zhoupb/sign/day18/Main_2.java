package com.zhoupb.sign.day18;

import java.util.Scanner;

public class Main_2 {
	
	/**
	 * 任务二：排序功能关键算法
	 * 编写程序实现： 
	 * ①定义一个大小为10的整型数组a；
	 * ②从键盘输入10个整数，放置到数组a中；
	 * ③将数组a中的元素从小到大排序；
	 * ④输出排序后数组a的所有元素值。
	 * 注意：使用数组、循环结构语句实现。
	 */
	
	static Scanner in = new Scanner(System.in);
	static int N = 15;
	static int a[] = new int[N];
	
	static void sort(int l, int r)
	{
		if (l >= r) return;
		int i = l - 1, j = r + 1, x = a[l + r >> 1];
		while (i < j)
		{
			while (a[++i] < x);
			while (a[--j] > x);
			if (i < j)
			{
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		sort(l, j);
		sort(j + 1, r);
	}
	
	public static void main(String args[])
	{
		int n = 10;
		for (int i = 0; i < n; i++) a[i] = in.nextInt();
		sort(0, n - 1);
		for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
	}
	
}
