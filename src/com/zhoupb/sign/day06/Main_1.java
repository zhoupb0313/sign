package com.zhoupb.sign.day06;

public class Main_1 {
	
	/**
	 * 任务一：评分计算功能关键算法
	 * 编写一个应用程序,计算并输出一维数组（9.8,12,45,67,23,1.98,2.55,45）中的最大值、最小值和平均值。
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		double[] a = {9.8, 12, 45, 67, 23, 1.98, 2.55, 45};
		double min = a[0], max = a[0], sum = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] < min) min = a[i];
			if (a[i] > max) max = a[i];
			sum += a[i];
		}
		System.out.println("max: " + max);
		System.out.println("mix: " + min);
		System.out.println("average: " + sum / a.length); 
	}

}
