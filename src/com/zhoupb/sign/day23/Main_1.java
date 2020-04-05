package com.zhoupb.sign.day23;

import java.util.Scanner;

public class Main_1 {

	/**
	 * 任务一：年份判断功能关键算法
	 * 金字塔的建造是颇具意义的事情，一般开始建筑的时间都很特别，比如闰年，现在输入一个年度，判断是否是闰年。
	 * 例如，2000是闰年，1900不是闰年，1904是闰年。
	 * 要求：使用分支结构语句实现。
	 * 注意：以下两个条件，只要满足任意一个，即是闰年：
	 * ①能整除4且不能整除100 ；②能整除400。 
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt();
		System.out.println((n % 4 == 0 && n % 100 != 0) || n % 400 == 0 ? "Yes" : "No");
	}
	
}
