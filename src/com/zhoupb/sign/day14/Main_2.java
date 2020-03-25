package com.zhoupb.sign.day14;

import java.util.*;

public class Main_2 {
	
	/**
	 * 任务二：字符判断功能关键算法
	 * 输入一行字符，输出其中的字母的个数。例如输入“Et2f5F218”，输出结果为4。
	 * 注意：综合使用分支、循环结构语句实现。
	 */
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		String str = in.nextLine();
		int ans = 0;
		for (int i = 0; i < str.length(); i++)
			if (Character.isLetter(str.charAt(i))) ans++;
		System.out.println(ans);
	}
}
