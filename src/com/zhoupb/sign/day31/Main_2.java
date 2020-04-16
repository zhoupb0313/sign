package com.zhoupb.sign.day31;

public class Main_2 {
	
	/**
	 * 任务二：IQ测试题2关键算法
	 * 小明发现了一个奇妙的数字。它的平方和立方正好把0~9的10个数字每个用且只用了一次。
	 * 你能猜出这个数字是多少吗？
	 */
	
	public static void main(String args[])
	{
		int N = 100000;
		for (int i = 1; i < N; i++)
			if (fun(i))
			{
				System.out.println(i);
				break;
			}
	}
	
	static boolean fun(int n)
	{
		int a[] = new int[10];
		int t = n * n;
		for (; t != 0; t /= 10) a[t % 10]++;
		t = n * n * n;
		for (; t != 0; t /= 10) a[t % 10]++;
		for (int i = 0; i < 10; i++)
			if (a[i] != 1) return false;
		return true;
	}

}
