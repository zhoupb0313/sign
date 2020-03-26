package com.zhoupb.sign.day15;

public class Main_1 {

	/**
	 * 任务一：素数判断功能关键算法
	 * 素数是这样的整数，它除了能表示为它自己和１的乘积以外，不能表示为任何其它两个整数的乘积。 
	 * 素数在正整数中的出现没有什么规律。
	 * 可是总体地看，素数的个数竟然有规可循。现要求输出100~999之间的所有素数。
	 * 注意：综合使用分支、循环结构语句实现。
	 */
	static int N = 1100;
	static int primes[] = new int[N];
	static boolean st[] = new boolean[N];
	static int cnt = 0;
	
	public static void main(String args[])
	{
		int n = 1000;
//		//	线性筛法，效率应该是最高的
//		for (int i = 2; i <= n; i++)
//		{
//			if (!st[i]) primes[cnt++] = i;
//			for (int j = 0; primes[j] <= n / i; j++)
//			{
//				st[primes[j] * i] = true;
//				if (i % primes[j] == 0) break;
//			}
//		}
		for (int i = 0, k = 100; k <= 999; k++)
		{
			for (i = 2; i <= n / i; i++)
				if (k % i == 0)
					break;
			if (k % i != 0)
				System.out.print(k + " ");
		}
		System.out.println();
//		for (int i = 100; i <= 999; i++)
//		{
//			if (!st[i]) System.out.print(i + " ");
//		}
	}
	
}
