package com.zhoupb.sign.day30;

import java.util.Scanner;

public class Main_2 {
	
	/**
	 * 任务二：进制转换功能1关键算法
	 * 给你两个十进制整数n和M（2 <= M <= 16），请你将n转换成M进制后输出。
	 * 如果M大于10，则对应的数字规则参考16进制（比如，10用A表示，等等）。
	 * 例如输入：12 16 你要输出12的16进制形式：C
	 * 注意：使用循环语句实现。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt(), radix = in.nextInt();
		StringBuilder res = new StringBuilder();
		for (; n != 0; n /= radix)
		{
			int t = n % radix;
			res.insert(0, t >= 10 ? String.valueOf((char) (t - 10 + 'A')) : t);
		}
		System.out.println(res);
	}

}
