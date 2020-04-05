package com.zhoupb.sign.day18;

public class Main_1 {
	
	/**
	 * 任务一：数字全排列功能关键算法
	 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？要求输出所有可能的三位数。
	 * 注意：使用循环结构语句实现。
	 */
	static int a[] = new int[5];
	static boolean st[] = new boolean[5];
	
	static void dfs(int u)
	{
		if (u == 3)
		{
			for (int i = 0; i < 3; i++) System.out.print(a[i] + " ");
			System.out.println();
			return;
		}
		for (int i = 1; i <= 4; i++)
		{
			if (!st[i])
			{
				st[i] = true;
				a[u] = i;
				dfs(u + 1);
				st[i] = false;
			}
		}
	}
	
	public static void main(String args[])
	{
		dfs(0);
	}

}
