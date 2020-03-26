package com.zhoupb.sign.day15;

import java.util.Scanner;

public class Main_2 {

	/**
	 * 任务二：字符判断功能关键算法
	 * 输入一行字符，输出其中的数字的个数。例如输入“fwEt2f44F2k8”，输出结果为5。
	 * 注意：综合使用分支、循环结构语句实现。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		String str = in.nextLine();
		int ans = 0;
		for (int i = 0; i < str.length(); i++)
			if (Character.isDigit(str.charAt(i))) ans++;
		System.out.println(ans);
	}
	
}
