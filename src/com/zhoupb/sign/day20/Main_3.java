package com.zhoupb.sign.day20;

import java.util.Scanner;

public class Main_3 {
	
	/**
	 * 任务三：循环比对功能关键算法
	 * 假如从键盘上输入M等于12，定义一个N让你猜数，N比它（M）大20，
	 * 并且M和N开始循环，每循环一次都加1（也就是说M从12开始一直加1，N从20+M开始一直加1）。
	 * 编写一个程序计算出N在几次循环后是M的2倍，那时M和N各多少？
	 * 要求：使用分支、循环结构语句实现，直接输出结果不计分。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int M = in.nextInt();
		int N = M + 20, cnt = 0;
		while (M * 2 != N)
		{
			M++; N++; cnt++;
		}
		System.out.printf("第%d次, M = %d, N = %d", cnt, M, N);
	}

}
