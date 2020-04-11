package com.zhoupb.sign.day28;

import java.util.Scanner;

public class Main_2 {
	
	/**
	 * 任务二：打印功能2关键算法
	 * 注意输出指定空心正方形。输入第一个数字为边长，第二个字符为组成边的字符。
	 * 例如：输入
	 * 4 a
	 * 输出
	 * aaaa
	 * a  a
	 * a  a
	 * aaaa
	 * 注意：使用嵌套循环实现
	 */
	
	static Scanner in = new Scanner(System.in);

	public static void main(String args[]) {
		int n = in.nextInt(), c = in.next().charAt(0);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) System.out.print((char)c);
				else System.out.print(" ");
			System.out.println();
		}
	}
}
