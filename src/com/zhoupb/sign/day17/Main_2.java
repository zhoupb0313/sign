package com.zhoupb.sign.day17;

import java.util.Scanner;

public class Main_2 {
	
	/**
	 * 任务二：抓娃娃游戏功能关键算法
	 * 请你娃娃机里放十个娃娃，并且在屏幕上显示最大的那个，
	 * 现在要求你在输出最大的那个娃娃的编号在屏幕上，你可以这样做：
	 * 1）定义一个大小为10的整形数组a；
	 * 2）从键盘输入10个整数，放置到数组a中；
	 * 3）输出数组a中的最大值。 
	 * 注意：使用数组、循环结构语句实现。
	 */
	static int N = 10;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a[] = new int[N];
		int max = -0x3f3f3f3f;
		for (int i = 0; i < N; i++)
		{
			a[i] = in.nextInt();
			max = a[i] > max ? a[i] : max;
		}
		System.out.println(max);
	}

}
