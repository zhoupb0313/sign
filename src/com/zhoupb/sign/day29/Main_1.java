package com.zhoupb.sign.day29;

import java.util.*;

public class Main_1 {
	
	/**
	 * 任务一：计算平均分功能关键算法
	 * 小明今天参加了“校园歌手大赛”，评委的打分规则是去掉一个最低分和一个最高分后算出剩下分数的平均分，
	 * 你能帮助小明快速的算出平均分吗？（评委数量必须大于2）
	 * 输入说明：首先输入一个整数n，代表评委人数，然后输入n个数。请按照题目的计算规则计算出平均分然后输出。
	 * 例如输入：
	 * 6
	 * 100 90 90 80 85 95
	 * 按照题目注意计算平均分并输出：
	 * 90.0注意：使用循环和数组实现。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt();
		double score[] = new double[n + 1], res = 0;
		for (int i = 0; i < n; i++) score[i] = in.nextDouble();
		Arrays.sort(score, 0, n);
		for (int i = 1; i < n - 1; i++) res += score[i];
		System.out.println(res / (n - 2));
	}
	
}
