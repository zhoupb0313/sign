package com.zhoupb.sign.day03;

import java.util.*;

public class Main_1 {
	
	/**
	 * 任务一：平均成绩计算功能关键算法
	 * 已知某个班有30个学生，学习5门课程，已知所有学生的各科成绩。请编写程序：分别计算每个学生的平均成绩，并输出。
	 * 注意：定义一个二维数组A，用于存放30个学生的5门成绩。定义一个一维数组B，用于存放每个学生的5门课程的平均成绩。
	 * ①使用二重循环，将每个学生的成绩输入到二维数组A中。
	 * ②使用二重循环，对已经存在于二维数组A中的值进行平均分计算，将结果保存到一维数组B中。
	 * ③使用循环输出一维数组B（即平均分）的值。
	 */
	static final int N = 3, M = 5;
	static double[][] s = new double[N][M];
	static double[] ans = new double[N];
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				s[i][j] = in.nextDouble();
		double t;
		for (int i = 0; i < N; i++)
		{
			t = 0;
			for (int j = 0; j < M; j++)
			{
				t += s[i][j];
			}
			ans[i] = t / M;
		}
		for (int i = 0; i < N; i++)
			System.out.println(ans[i]);
	}

}
