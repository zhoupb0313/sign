package com.zhoupb.sign.day01;

import java.util.*;
//	通过键盘输入某年某月某日，计算并输出这一天是这一年的第几天。例如，2001年3月5日是这一年的第64天。
public class Main_1 
{
	static final int N = 360;
	static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(2020, 0, 1);
//		for (int i = 0; i < N; i++) 
//		{
//			fun(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
//			System.out.printf("\t标准答案 => %d\n", calendar.get(Calendar.DAY_OF_YEAR));
//			calendar.add(Calendar.DAY_OF_MONTH, 1);
//		}
		System.out.printf("input year-month-day, use '-' cut up\n");
		String[] date = in.next().split("-");
		fun(Integer.parseInt(date[0]), Integer.parseInt(date[1]) - 1, Integer.parseInt(date[2]));
	}
	
	static void fun(int y, int m, int d)
	{
		int t = 0, i = m;
		while (i > 0) t += isExist(i--) ? 1 : 0;
		if (m >= 1) t += (y % 4 == 0 && y % 100 != 0) || y % 400 == 0 ? 1 : 2;
		int ans = m * 31 + d - t;
		System.out.printf("%d年%d月%d日是这一年的第%d天。", y, m + 1, d, ans);
	}
	
	static boolean isExist(int x)
	{
		int[] a = new int []{2, 4, 6, 9, 11};
		int l = 0, r = a.length - 1;
		while (l < r)
		{
			int mid = l + r + 1 >> 1;
			if (a[mid] <= x) l = mid;
			else r = mid - 1;
		}
		return a[l] == x;
	}
	
}
