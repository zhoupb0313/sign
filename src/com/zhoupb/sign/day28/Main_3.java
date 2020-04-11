package com.zhoupb.sign.day28;

import java.util.Scanner;

public class Main_3 {
	
	/**
	 * 任务三：打印功能3关键算法
	 * 从键盘接受一个正整数，列出该数字的中文表示格式，例如：键盘输入123，打印出一二三；键盘输入3103，打印出三一零三。
	 * 注意：使用判断语句完成。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		char chs[] = {'零', '一', '二', '三', '四', '五', '六', '七', '八', '九'};
		long n = in.nextLong();
		String t = String.valueOf(n);
		for (int i = 0; i < t.length(); i++) System.out.print(chs[t.charAt(i) - '0']);
	}
	
}
