package com.zhoupb.sign.day08;

import java.util.*;

public class Main_2 {
	
	/**
	 * 任务二：猴子吃桃试题检测关键算法
	 * 孙悟空在大闹蟠桃园的时候，
	 * 第一天吃掉了所有桃子总数一半多一个，第二天又将剩下的桃子吃掉一半多一个，
	 * 以后每天吃掉前一天剩下的一半多一个，到第n天准备吃的时候只剩下一个桃子。
	 * 这下可把神仙们心疼坏了，请帮忙计算一下，第一天开始吃的时候桃园一共有多少个桃子。
	 * 注意：
	 * ①使用循环结构语句实现。
	 * ②整数N由键盘输入，且2 ≤ N ≤10。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = in.nextInt();
		int ans = 1;
		for (int i = 0; i < n - 1; i++)
			ans = (ans + 1) * 2;
		System.out.println(ans);
	}
	
}
