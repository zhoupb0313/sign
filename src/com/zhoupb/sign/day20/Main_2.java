package com.zhoupb.sign.day20;

public class Main_2 {

	/**
	 * 任务二：中奖数字功能关键算法
	 * 编写一个程序求出200~300之间的数，且满足条件：它们的三位数每位数数字之积为42， 和为12。
	 * 要求：使用分支、循环结构语句实现，直接输出结果不计分。 
	 */
	
	public static void main(String args[])
	{
		for (int i = 200; i < 300; i++)
		{
			int sum = 0, multiply = 1;
			int t = i;
			while (t != 0)
			{
				sum += t % 10;
				multiply *= t % 10;
				t /= 10;
			}
			if (sum == 12 && multiply == 42) System.out.println(i);
		}
	}
	
}
