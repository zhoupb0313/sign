package com.zhoupb.sign.day31;

import java.util.Scanner;

public class Main_3 {
	
	/**
	 * 任务三：IQ测试题3关键算法
	 * 从键盘接收一个整数N，请观察示例输入与输出，查找规律，并打印打印N对应的图形。
	 * 输入有多组数据，每个数据占一行，每行一个整数N（1<N<100）。打印的图形每个占一行。
	 * 比如输入：
	 * 2
	 * 3
	 * 5
	 * 则输出：
	 * -->----<--
	 * --->------<---
	 * ----->----------<-----
	 * 注意：使用循环完成。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		while (in.hasNext())
		{
			int n = in.nextInt();
			StringBuilder res = new StringBuilder();
			for (int i = 0; i < n * 2; i++)
				res.append("-");
			System.out.print(res.insert(n, ">").toString());
			res.setCharAt(n, '<');
			System.out.println(res);
		}
	}
	
}
