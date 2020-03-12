package com.zhoupb.sign.day03;

public class Main_3 {

	/**
	 * 任务三：前项列和计算功能关键算法
	 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13 … 求出这个数列的前20项之和。
	 * 要求：利用循环计算该数列的和。注意分子分母的变化规律。
	 * 注意：
	 * a1=2,      b1=1,     c1=a1/b1;
	 * a2=a1+b1,  b2=a1,    c2=a2/b2;
	 * a3=a2+b2,  b3=a2,    c3=a3/b3;
	 * …
	 * s = c1+c2+…+c20;
	 * s即为分数序列：2/1，3/2，5/3，8/5，13/8，21/13 … 的前20项之和。
	 */
	
	static final int N = 20;
	
	public static void main(String[] args)
	{
		double ans = 0;
		double t1 = 1, t2 = 2, t3;
		for (int i = 0; i < N; i++)
		{
			ans += t2 / t1;
			t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
		}
		System.out.println(ans);
	}
	
}
