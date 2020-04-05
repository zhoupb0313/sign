package com.zhoupb.sign.day22;

import java.util.*;

public class Main_1 {

	/**
	 * 任务一：销售服务功能关键算法
	 * 根据如下要求计算机票优惠率，并输出。
	 * 输入：用户依次输入月份和需要订购机票的数量，分别保存到整数变量month和sum中。
	 * 计算规则如下：
	 * 航空公司规定在旅游的旺季7～9月份，如果订票数超过20张，票价优惠15%，20张以下，优惠5%；
	 * 在旅游的淡季1～5月份、10月份、11月份，如果订票数超过20张，票价优惠30%，20张以下，优惠20%；
	 * 其他情况一律优惠10%。
	 * 输出：根据输入月份和需要订购机票的数量，输出优惠率。
	 * 要求：使用分支结构实现上述程序功能。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int month = in.nextInt(), sum = in.nextInt();
		double discount = 0;
		discount = 
				month >= 7 && month <= 9 ? 
						sum > 20 ? 
								0.15 : 0.05 
				: month >= 1 && month <= 5 && month == 10 && month == 11 ? 
						sum > 20 ? 
								0.3 : 0.2 
				: 0.1;
		System.out.printf("在%d月购买%d张票，优惠%.0f%%", month, sum, discount * 100);
	}
	
}
