package com.zhoupb.sign.day23;

public class Main_2 {

	/**
	 * 任务二：金字塔形状展示功能关键算法
	 * 输出金字塔的形状，如下图所示：
	 * *
	 * ***
	 * *****
	 * *******
	 * *********
	 * ***********
	 * *************
	 * 要求：使用循环结构语句实现，直接输出结果不计分。 
	 */
	
	public static void main(String args[])
	{
		int N = 7;
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j <= i * 2; j++) System.out.print("*");
			System.out.println();
		}
	}
	
}
