package com.zhoupb.sign.day07;

import java.util.*;

public class Main_1 {

	/**
	 *	任务一：最大出现次数统计的关键算法
	 *	编写一个程序，对用户输入的任意一组字符如{3，1，4，7，2，1，1，2，2}，输出其中出现次数最多的字符，并显示其出现次数。
	 *	如果有多个字符出现次数均为最大且相等，则输出最先出现的那个字符和它出现的次数。
	 *	例如，上面输入的字符集合中，“1”和“2”都出现了3次，均为最大出现次数，因为“1”先出现，则输出字符“1”和它出现的次数3次。
	 *	注意：使用分支、循环结构语句实现。 
	 */
	
	static Scanner in = new Scanner(System.in);
	static final int N = (int)1e5 + 3;
	static int[] h = new int[N], e = new int[N], ne = new int[N], counts = new int[N];
	static int idx = 1;
	public static void main(String[] args) {
		int[] a = {3, 1, 4, 7, 2, 1, 1, 2, 2};
		int[] k = new int[a.length];
		int[] v = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) 
		{
			int t = getIndex(k, a[i]);
			if (t != -1) v[t]++;
			else k[index++] = a[i];
		}
		int max = -1, value = 0;
		for (int i = 0; i < index; i++)
		{
			if (v[i] > max)
			{
				max = v[i];
				value = k[i];
			}
		}
		System.out.println(value + " 出现了" + (max + 1));
//		for (int i = 0; i < a.length; i++) insert(a[i]);
//		int max = -1, value = 0, count = 0;
//		for (int i = 0; i < a.length; i++)
//		{
//			count = counts[find(a[i])];
//			if (count > max)
//			{
//				max = count;
//				value = a[i];
//			}
//		}
//		System.out.println(value);
	}
	
	static int getIndex(int[] a, int k)
	{
		for (int i = 0; i < a.length; i++)
			if (a[i] == k) return i;
		return -1;
	}
	
	static void insert(int x)
	{
		int k = (x % N + N) % N;
		int i = find(x);
		if (i != -1)
		{
			counts[i]++;
			return;
		}
		e[idx] = x;
		ne[idx] = h[k];
		h[k] = idx++;
	}
	
	static int find(int x)
	{
		int k = (x % N + N) % N;
		int p = h[k];
		while (p != 0)
		{
			if (e[p] == x) return p;
			p = ne[p];
		}
		return -1;
	}
}
