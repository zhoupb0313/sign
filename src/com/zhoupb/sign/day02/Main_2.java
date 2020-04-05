package com.zhoupb.sign.day02;

import java.util.*;

public class Main_2 {
	 
	/**
	 * 务二：趣味英语试题2关键算法
	 * 判断一个字符串是否是对称字符串，例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串。是的话输出”Yes”，否则输出”No”。
	 * 注意：使用循环和判断语句实现。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String str = in.next();
		System.out.printf("%s", fun(str) ? "Yes" : "No");
	}

	static boolean fun(String str)
	{
		int l = -1, r = str.length();
		while (l <= r) 
			if (str.charAt(++l) != str.charAt(--r)) return false;
		return true;
	}
	
}
