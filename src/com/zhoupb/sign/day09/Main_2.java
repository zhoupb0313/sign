package com.zhoupb.sign.day09;

import java.util.*;

public class Main_2 {
	
	/**
	 * 任务二：停电停多久问题关键算法
	 * Lee的老家住在工业区，日耗电量非常大。
	 * 今年7月，传来了不幸的消息，政府要在7、8月对该区进行拉闸限电。
	 * 政府决定从7月1日起停电，然后隔一天到7月3日再停电，再隔两天到7月6日停电，依次下去，每次都比上一次长一天。
	 * Lee想知道自己到家后到底要经历多少天倒霉的停电。请编写程序帮他算一算。
	 * 注意：从键盘输入放假日期、开学日期，日期限定在7、8月份，且开学日期大于放假日期，然后在屏幕上输出停电天数。
	 * 提示：可以用数组标记停电的日期。
	 */
	
	static final int N = 65;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int[] days = new int[N];
		int sm = in.nextInt(), sd = in.nextInt(), em = in.nextInt(), ed = in.nextInt();
		for (int i = 1, j = 1; i < N; j++, i += j)
			days[i] = 1;
		int s = (sm - 7) * 31 + sd;
		int e = (em - 7) * 31 + ed;
		int ans = 0;
		for (int i = s; i <= e; i++) ans += days[i];
		System.out.println(ans);
	}
	
}
