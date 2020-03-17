package com.zhoupb.sign.day07;

import java.util.*;

public class Main_3 {

	/**
	 * 任务三：求两数之间关系的关键算法
	 * 输入整数a，输出结果s，其中s与a的关系是：s=a+aa+aaa+aaaa+aa...a，最后为a个a。
	 * 例如a=2时，s=2+22=24。
	 * 注意：①使用循环结构语句实现。②a由键盘输入，且2 ≤ a ≤9。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = in.nextInt();
		int ans = 0;
		int t = 0;
		for (int i = 0; i < n; i++)
		{
			t = t * 10 + n;
			ans += t;
		}
		System.out.println(ans);
	}
	
}
