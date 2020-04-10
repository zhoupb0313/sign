package com.zhoupb.sign.day27;

import java.util.Scanner;

public class Main_2 {
	
	/**
	 * 任务二：图形计算功能2关键算法
	 * 输入三个数，分别是圆柱体底圆的周长d，高h，半径r，请你编程求出该圆柱的表面积。
	 * 注意：PI = 3.14，输出结果保留两位小数。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		double d = in.nextDouble(), h = in.nextDouble(), r = in.nextDouble();
		System.out.printf("ans = %.2f", 2 * 3.14 * r * r * + 3.14 * d * h);
	}
	
}
