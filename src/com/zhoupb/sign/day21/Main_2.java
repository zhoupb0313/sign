package com.zhoupb.sign.day21;

public class Main_2 {

	/**
	 * 任务二：查询功能关键算法
	 * 所谓回文数是从左至右与从右至左读起来都是一样的数字，
	 * 如：121是一个回文数。编写程序，求出100—200的范围内所有回文数的和。
	 * 要求：使用循环结构语句实现，直接输出结果不计分。
	 */
	
	public static void main(String args[])
	{
		int sum = 0;
		for (int i = 100; i <= 200; i++)
		{
			int t = i, tsum = 0;
			while (t != 0)
			{
				tsum = tsum * 10 + (t % 10);
				t /= 10;
			}
			if (tsum == i) sum += i;
		}
		System.out.println(sum);
	}
	
}
