package com.zhoupb.sign.day24;

import java.util.*;

public class Main_2 {
	
	/**
	 * 任务二：等比数列求和功能关键算法
	 * 数列的定义如下：
	 * 数列的第一项为n，以后各项为前一项的平方根，输出数列的前m项的和。
	 * 要求：数列的各项均为正数。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		double n = in.nextInt();
		int m = in.nextInt();
		double ans = 0;
		while (m-- > 0)
		{
			ans += n;
			n = Math.sqrt(n);
		}
		System.out.println(ans);
	}
	
}
