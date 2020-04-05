package com.zhoupb.sign.day18;

public class Main_3 {

	/**
	 * 任务三：关系序功能关键算法
	 * 编写函数(或方法)实现：根据指定的n，返回相应的斐波纳契数列。
	 * 说明：斐波纳契数列如下所示：0，1，1，2，3，5，8，13，21… 
	 * 即从0和1开始，其后的任何一个斐波纳契数都是它前面两个数之和。例如n=6，则返回数列0，1，1，2，3，5 。
	 * 注意：使用函数(或方法)实现，原型为int[] getFibonacciSeries(int n)
	 */
	
	static int[] getFibonacciSeries(int n)
	{
		if (n == 0) return new int[0];
		if (n == 1) return new int[] {0};
		int ans[] = new int[n];
		ans[0] = 0;
		ans[1] = 1;
		for (int i = 2; i < n; i++)
			ans[i] = ans[i - 1] + ans[i - 2];
		return ans;
	}
	
	public static void main(String args[])
	{
		int[] ans = getFibonacciSeries(9);
		System.out.println(java.util.Arrays.toString(ans));
	}
	
}
