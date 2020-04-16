package com.zhoupb.sign.day31;

public class Main_1 {
	
	/**
	 * 任务一：IQ测试题1关键算法
	 * 有些数字的立方的末尾正好是该数字本身。
	 * 比如：1,4,5,6,9,24,25,....请你计算一下，在10000以内的数字中（指该数字，并非它立方后的数值），
	 * 符合这个特征的正整数一共有多少个。
	 * 注意：编程求解，仅输出符合条件的数字有多少个即可。
	 */
	
	public static void main(String args[])
	{
		int ans = 0;
		for (int i = 1; i <= 10000; i++)
			if (i * i * i % fun(i) == i)
				ans++;
		System.out.println(ans);
	}
	
	static int fun(int n)
	{
		int res = 1;
		for (; n != 0; n /= 10) res *= 10;
		return res;
	}

}
