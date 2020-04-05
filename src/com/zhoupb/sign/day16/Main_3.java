package com.zhoupb.sign.day16;

import java.util.*;

public class Main_3 {

	/**
	 * 任务三：循环结构3关键算法
	 * 输入一个不多于5位的正整数，
	 * 要求：
	 * 	1．输出它是几位数；
	 * 	2．逆序打印出各位数字。
	 * 	例如，输入256，则先输出3，再输出652。 
	 * 注意：使用分支或循环结构语句实现。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt();
		int cnt = 0;
		int tmp = 0;
		while (n != 0)
		{
			tmp = tmp * 10 + n % 10;
			n /= 10;
			cnt++;
		}
		System.out.println(cnt);
		System.out.println(tmp);
	}
	
}
