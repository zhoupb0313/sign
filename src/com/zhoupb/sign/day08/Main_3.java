package com.zhoupb.sign.day08;

import java.util.*;

public class Main_3 {
	
	/**
	 * 任务三：回文数检测关键算法
	 * 输入一个5位正整数，输出它是不是回文数。
	 * 回文数是这样一种数，它的逆序数和它本身相等。
	 * 例如，12321的逆序数是12321，和它本身相等，所以它是回文数。
	 * 又例如25128的逆序数是82152，所以它不是回文数。
	 * 注意：使用分支或循环结构语句实现。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = in.nextInt();
		int t = n;
		int ans = 0;
		while (t != 0)
		{
			ans += t % 10;
			ans *= 10;
			t /= 10;
		}
		System.out.println(n == ans / 10 ? "Yes" : "No");
	}

}
