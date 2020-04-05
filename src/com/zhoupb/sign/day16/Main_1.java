package com.zhoupb.sign.day16;

public class Main_1 {

	/**
	 * 任务一：循环结构1关键算法
	 * 使用循环语句打印出如下图案。
	 * *
	 * ***
	 * ***** 
	 * *******
	 * 注意：使用循环结构语句实现。
	 */
	
	public static void main(String args[])
	{
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j <= i * 2; j++) System.out.print("*");
			System.out.println();
		}
	}
	
}
