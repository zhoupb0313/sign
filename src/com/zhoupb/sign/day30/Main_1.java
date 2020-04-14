package com.zhoupb.sign.day30;

import java.util.Scanner;

public class Main_1 {
	
	/**
	 * 任务一：进制转换功能1关键算法
	 * 小明的老师给小明布置了一道进制转换的问题，将一个十进制的整数n(0<n<=10000)转换成二进制并输出，你能帮帮小明吗？
	 * 例如输入：10你要输出十进制10的二进制形式：1010
	 * 注意：用函数或方法实现。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt();
		StringBuilder res = new StringBuilder();
		for (; n != 0; n >>= 1) res.insert(0, n & 1);
		System.out.println(res);
	}

}
