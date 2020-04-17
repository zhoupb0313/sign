package com.zhoupb.sign.day32;

import java.util.Scanner;

public class Main_1 {

	/**
	 * 任务一：生成“X”图形关键算
	 * 小明希望用星号打印出一个大X，他要求能够控制笔画的宽度和整个字的高度。为了便于比对空格，所有的空白位置都以句点符来代替。
	 * 要求输入两个整数m n，表示笔画的宽度，X的高度。用空格分开(0<m<n, 3<n<1000, 保证n是奇数)。
	 * 例如输入：
	 * 3 9
	 * 程序应该输出：
	 * ***.....***
	 * .***...***.
	 * ..***.***..
	 * ...*****...
	 * ....***....
	 * ...*****...
	 * ..***.***..
	 * .***...***.
	 * ***.....***
	 * 注意：使用循环嵌套完成
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int m = in.nextInt(), n = in.nextInt();
		int M = m + n - 1;
		char ans[][] = new char[n][M];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < M; j++) ans[i][j] = '.';
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				ans[i][i + j] = '*';
				ans[i][M - i - j - 1] = '*';
			}
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < M; j++)
				System.out.print(ans[i][j]);
			System.out.println();
		}
	}

}
