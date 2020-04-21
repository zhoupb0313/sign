package com.zhoupb.sign.day36;

import java.util.*;

public class Main_1 {

	/**
	 * 输出数组第k大的数。
	 * 说明：首先输入一个整数n，代表数组的长度，随后输入n个数，代表数组的元素，最后输入一个整数k，你需要输出这n个数中第k大的数（0<k<=n）。
	 * 例如输入：
	 * 5
	 * 5 3 1 2 4
	 * 3
	 * 输出这5个数中第3大的数：
	 * 3注意：使用数组完成。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) a[i] = in.nextInt();
		int k = in.nextInt();
		Arrays.sort(a);
		int i = 0, j = 0;
		for (; i < n; i++)
			if (i == 0 || a[i] != a[i - 1])
				a[j++] = a[i];
		System.out.println(Arrays.toString(a));
		System.out.println(a[k - 1]);
	}
	
}
