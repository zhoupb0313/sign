package com.zhoupb.sign.day09;

import java.util.*;

public class Main_3 {
	
	/**
	 * 任务三：筛选奇数问题关键算法
	 * 编写程序实现：从键盘输入正整数s，从低位开始取出s中的奇数位上的数，
	 * 依次构成一个新数t，高位仍放在高位，低位仍放在低位，最后在屏幕上输出t。
	 * 例如，当s中的数为7654321时，t中的数为7531。
	 * 注意：使用循环结构语句实现。
	 */
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int n = in.nextInt();
		int ans = 0;
		int p = 1;
		while (n != 0)
		{
			ans = ans + (n % 10) * p;
			n /= 100;
			p *= 10;
		}
		System.out.println(ans);
	}
}
