package com.zhoupb.sign.day22;

import java.util.Scanner;

public class Main_2 {
	
	/**
	 * 任务三：信息服务功能关键算法
	 * 验证18位身份证号码并判断身份证主人的性别，身份证号码的规则为：
	 * ①前17位全部由数字组成，最后一位为数字或者字符’X’，一个字符ch为数字的条件为：ch>=’0’ && ch<=’9’；
	 * ②第17位数为奇数表示性别为男，偶数表示性别为女。
	 * 输入：从键盘输入一个18位的身份证号码保存到字符数组Card中。
	 * 输出：主人性别。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		boolean b = true;
		char card[] = in.next().toCharArray();
		if (card.length > 18) b = false;
		for (int i = 0; b && i < card.length - 1; i++) if (!Character.isDigit(card[i])) b = false;
		if (b && !Character.isDigit(card[card.length - 1]) && card[card.length - 1] != 'X') b = false;
		System.out.printf("身份证%s合法,性别:%s", b ? "" : "不", (card[16] - '0' & 1) == 1 ? "男" : "女");
	}
	
}
