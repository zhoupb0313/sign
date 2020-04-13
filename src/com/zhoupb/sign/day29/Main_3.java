package com.zhoupb.sign.day29;

import java.util.*;

public class Main_3 {
	
	/**
	 * 任务三：分数排序功能关键算法
	 * 小明的老师今天教了冒泡排序，但是小明在网上找到一种更加方便的排序，但是小明不会使用，你能帮帮他吗？
	 * 定义一个数组，里面存放一堆乱序的数，注意使用sort方法排序并输出。
	 * 注意：按照题目描述完成程序，使用sort方法实现。
	 */

	static int a[] = new int[] {20, 23, 33, 27, 77, 40, 42, 21, 83, 9};
	static int b[] = new int[a.length];
	
	static void sort(int l, int r)
	{
		if (l >= r) return;
		int mid = l + r >> 1;
		sort(l, mid); sort(mid + 1, r);
		int i = l, j = mid + 1, idx = 0;
		while (i <= mid && j <= r)
			if (a[i] <= a[j]) b[idx++] = a[i++];
			else b[idx++] = a[j++];
		while (i <= mid) b[idx++] = a[i++];
		while (j <= r) b[idx++] = a[j++];
		for (j = 0, i = l; i <= r; i++, j++)
			a[i] = b[j];
	}
	
	public static void main(String args[])
	{
		sort(0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
	
}
