package com.zhoupb.sign.day02;

import java.util.*;

public class Main_2 {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String str = in.next();
		System.out.printf("%s%s对称字符串", str, fun(str) ? "是" : "不是");
	}

	static boolean fun(String str)
	{
		int l = -1, r = str.length();
		while (l <= r) 
			if (str.charAt(++l) != str.charAt(--r)) return false;
		return true;
	}
	
}
