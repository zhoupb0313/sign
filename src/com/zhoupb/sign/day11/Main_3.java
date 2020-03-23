package com.zhoupb.sign.day11;

import java.util.*;

public class Main_3 {

	/**
	 * 任务三：其他功能关键算法
	 * 寻找最大数经常在计算机应用程序中使用。
	 * 例如：确定销售竞赛优胜者的程序要输入每个销售员的销售量，销量最大的员工为销售竞赛的优胜者，
	 * 请你帮忙找到最大的数并且打印这个数。
	 * 例如输入：1,8,9,10,12,45,6 输出45
	 */
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		System.out.println("how many?");
		int n = in.nextInt();
		int max = -0x3f3f3f3f;
		for (int x = 0; n-- > 0;)
		{
			x = in.nextInt();
			if (x > max) max = x;
		}
		System.out.println(max);
	}
	
}
