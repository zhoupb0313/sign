package com.zhoupb.sign.day05;

import java.util.*;

public class Main_1 {
	
	/**
	 * 任务一：计算体积关键算法
	 * 根据输入的半径值，计算球的体积。
	 * 输入数据有多组，每组占一行，每行包括一个实数，表示球的半径。
	 * 输出对应的球的体积，对于每组输入数据，输出一行，计算结果保留三位小数。PI = 3.1415927;
	 * 例如：输入2 输出 33.510
	 * 注意：使用公式完成。
	 */
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		double r = in.nextDouble();
		double ans = 4.0 / 3.0 * 3.1415927 * r * r * r;
		System.out.printf("%.3f", ans);
	}
	
}
