package com.zhoupb.sign.day21;

import java.util.*;

public class Main_1 {

	/**
	 * 任务一：打折功能关键算法
	 * 编写程序计算购买图书的总价格：
	 * 用户输入图书的定价和购买图书的数量，并分别保存到一个float和一个int类型的变量中，
	 * 然后根据用户输入的定价和购买图书的数量，计算合计购书金额并输出。
	 * 其中，图书销售策略为：正常情况下按9折出售，购书数量超过10本打85折，超过100本打8折。
	 * 要求：使用分支结构实现上述程序功能。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		float price = in.nextFloat(), discount;
		int cnt = in.nextInt();
		discount = cnt > 10 ? cnt > 100 ? 0.8f : 0.85f : 0.9f;
		System.out.printf("%.2f", cnt * price * discount);
	}
}
