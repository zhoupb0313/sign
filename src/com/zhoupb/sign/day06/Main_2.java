package com.zhoupb.sign.day06;

import java.util.*;

public class Main_2 {

	/**
	 * 任务二：规律数字计算关键算法
	 * 计算算式1+21+22+23+…+2n 的值。 
	 * 注意：n由键盘输入，且2 ≤ n ≤10。
	 */
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = in.nextInt();
		int ans = 1;
		int base = 2;
		for (int i = 1; i <= n; i++)
			ans += base * 10 + i;
		System.out.println("answer: " + ans);
	}
	
}
