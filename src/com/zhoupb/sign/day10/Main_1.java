package com.zhoupb.sign.day10;

import java.util.*;

public class Main_1 {
	
	/**
	 * 任务一：统计今天是该年的第几天关键算法
	 * 从键盘上输入一个年份值和一个月份值，输出该月的天数。
	 * (说明：一年有12个月，大月的天数是31，小月的天数是30。
	 * 2月的天数比较特殊，遇到闰年是29天，否则为28天。例如，输入2011、3，则输出31天。)
	 * 注意：使用分支结构语句实现。
	 */
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int y = in.nextInt();
		int n = in.nextInt();
		int[] ms = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (n == 2 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)) ms[1]++;
		System.out.println(ms[n - 1]);
	}
	
}
