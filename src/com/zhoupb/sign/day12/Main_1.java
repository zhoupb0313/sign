package com.zhoupb.sign.day12;

import java.util.*;

public class Main_1 {
	
	/**
	 * 任务一：主结长度关键算法（30分）
	 * 公司现在需要打印中国结的主结(位于中间，最大的那一个结)，
	 * 为了打印出漂亮新颖的主结，于是设计打印主结的长度满足可以被7整除这个条件。
	 * 现在公司需要统计某个范围内能被7整除的整数的个数，以及这些能被7整除的数的和。
	 * 从键盘上输入一个整数N，输出1~N之间能被7整除的整数的个数，以及这些能被7整除的数的和。
	 */
	static int BASE = 7;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt();
		int cnt = 1, sum = 0, x = 0;
		while (x < n - BASE)
		{
			x = BASE * cnt++;
			sum += x;
		}
		System.out.println(cnt - 1 + " " + sum);
	}
	

}
