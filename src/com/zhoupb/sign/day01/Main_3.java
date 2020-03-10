package com.zhoupb.sign.day01;

import java.util.*;
//	判断一个整数是否为“水仙花数”。所谓“水仙花数”是指一个三位的整数，其各位数字立方和等于该数本身。例如：153是一个“水仙花数”，
public class Main_3 {
	
	static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		int x = in.nextInt();
		int x = 153;
		System.out.printf("%d%s水仙花数.\n", x, fun(x) ? "是" : "不是");
		x = 154;
		System.out.printf("%d%s水仙花数.\n", x, fun(x) ? "是" : "不是");
	}
	
	static boolean fun(int x)
	{
		int X = x, ans = 0, t = 0;
		while (x != 0)
		{
			t = x % 10;
			ans += t * t * t;
			x /= 10;
		}
		return ans == X;
	}

}
