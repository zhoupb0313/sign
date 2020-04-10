package com.zhoupb.sign.day27;

import java.util.Scanner;

public class Main_3 {
	
	/**
	 * 任务三：图形计算功能3关键算法
	 * 输入三个数，分别是三角形的三条边a，b，c，请你编程求出该三角形表面积。
	 * 注意：题目的输入数据合法。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
		double s = (a + b + c) / 2;
		System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
	}

}
