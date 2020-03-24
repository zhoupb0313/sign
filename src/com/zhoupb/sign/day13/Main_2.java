package com.zhoupb.sign.day13;

import java.util.*;

public class Main_2 {

	/**
	 * 任务二：学生成绩运算关键算法
	 * 输入两个学生成绩m和n，输出其最大公约数和最小公倍数。
	 * 注意：综合使用分支、循环结构语句实现。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int m = in.nextInt(), n = in.nextInt();
		int ans = gcd(m, n);
		System.out.println("最大公约数:" + ans + ",最小共倍数：" + (((long)m * n) / ans));
	}
	
	static int gcd(int a, int b)
	{
		return a % b == 0 ? b : gcd(b, a % b);
	}
	
}
