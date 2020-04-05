package com.zhoupb.sign.day16;

public class Main_2 {

	/**
	 * 任务二：循环结构2关键算法 
	 * 输出1+2!+3!+...+10!的结果。其中n!表示n的阶乘，例如3!=3×2×1=6，5!=5×4×3×2×1=120。
	 * 注意：使用循环结构语句实现。
	 */
	
	public static void main(String args[])
	{
		int n = 10;
		long ans = 1;
		for (int j = 2; j <= n; j++)
		{
			long t = 1;
			for (int i = 2; i <= j; i++) t *= i;
			ans += t;
		}
		System.out.println(ans);
	}
	
}
