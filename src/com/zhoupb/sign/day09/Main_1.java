package com.zhoupb.sign.day09;

public class Main_1 {
	
	/**
	 * 任务一：小球反弹问题关键算法
	 * 一个球从100米高度自由落下，每次落地后反弹回原高度的一半，再落下，再反弹。
	 * 求它在第十次落地时，共经过多少米?第十次反弹多高?
	 * 注意：使用循环结构语句实现。
	 */
	public static void main(String[] args) {
		double sum = 100;
		double ans = 100;
		for (int i = 0; i < 10; i++)
		{
			ans /= 2;
			sum += ans * 2;
		}
		System.out.println((sum - (ans * 2)) + " " + ans);
	}
	
}
