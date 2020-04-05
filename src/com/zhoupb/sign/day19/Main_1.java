package com.zhoupb.sign.day19;

import java.util.*;

public class Main_1 {
	
	/**
	 * 任务一：销售分析功能关键算法
	 * A商店准备在今年夏天开始出售西瓜西瓜的售价如下，
	 * 20斤以上的每斤0.85元；
	 * 重于15斤轻于等于20斤的，每斤0.90元；
	 * 重于10斤轻于等于15斤的，每斤0.95元；
	 * 重于5斤轻于等于10斤的，每斤1.00元；
	 * 轻于或等于5斤的，每斤1.05元。 
	 * 现在为了知道商店是否会盈利要求A公司帮忙设计一个输入西瓜的重量和顾客所付钱数，输出应付货款和应找钱数的程序。
	 * 注意：使用分支结构语句实现。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		
		int prices[] = {20, 15, 10, 5, 0};
		double discount[] = {0.85, 0.9, 0.95, 1, 1.05};
		double n = in.nextDouble();
		double pay = in.nextDouble();
		int idx = 0;
		double ans = 0;
		while (idx < prices.length)
		{
			if (n > prices[idx])
			{
				ans += (n - prices[idx]) * discount[idx];
				n = prices[idx];
			}
			idx++;
		}
		System.out.printf("应付: %.2f\n", ans);
		System.out.printf("找零: %.2f\n", pay - ans);
	}
	
}
