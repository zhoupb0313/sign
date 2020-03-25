package com.zhoupb.sign.day14;

import java.util.*;

public class Main_3 {

	/**
	 * 任务三：综合运算功能关键算法
	 * 输入整数a和n，输出结果s，其中s与a、n的关系是：s=a+aa+aaa+aaaa+aa...a，最后为n个a。例如a=2、n=3时，s=2+22+222=246。
	 * 注意：①使用循环结构语句实现。②a由键盘输入，且2 ≤ a ≤9。③n由键盘输入，且2 ≤ n ≤9。
	 */
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int a = in.nextInt(), n = in.nextInt(), tmp = 0;
		int s = 0;
		while (n-- > 0)
		{
			tmp = tmp * 10 + a;
			s += tmp;
		}
		System.out.println(s);
	}
	
}
