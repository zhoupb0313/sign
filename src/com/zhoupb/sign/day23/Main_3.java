package com.zhoupb.sign.day23;

import java.util.Scanner;

public class Main_3 {

	/** 
	 * 任务三：咒文识别功能关键算法
	 * 编程实现判断一段咒文是否是“回文串”。
	 * 所谓“回文串”是指一层砖块数的第一位与最后一位相同，第二位与倒数第二位相同。
	 * 例如：“159951”、“19891”是回文串，而“2011”不是。
	 * 要求：用带有一个输入参数的函数(或方法)实现，返回值类型为布尔类型。 
	 */
	
	static Scanner in = new Scanner(System.in);
	
	static boolean f(String str)
	{
		int i = 0, j = str.length() - 1;
		while (i <= j)
			if (str.charAt(i++) != str.charAt(j--)) return false;
		return true;
	}
	
	public static void main(String args[])
	{
		String str = in.next();
		System.out.println(f(str) ? "Yes" : "No");
	}
	
}
