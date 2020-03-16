package com.zhoupb.sign.day06;

import java.util.*;

public class Main_3 {

	/**
	 * 任务三：个人交税计算功能关键算法
	 * 某国的个人所得税草案规定，个税的起征点为3000元，分成7级，税率情况见下表，从键盘上输入月工资，计算应交纳的个人所得税。
	 * 							表1.6.1 税率情况表
	 * 级数						全月应纳税所得额						税率 (%)
	 * 1						不超过1500元的（即3000-4500之间）		5
	 * 2						超过1500元至4500元的部分				10
	 * 3						超过4500元至9000元的部分				20
	 * 4						超过9000元至35000元的部分			25
	 * 5						超过35000元至55000元的部分			30
	 * 6						超过55000元至80000元的部分			35
	 * 7						超过80000元的部分					45
	 * 注意：超出部分按所在税的级数计算
	 * 如：一个人的月收入为6000，应交个人所得税为：1500*0.05 +((6000-3000)-1500)*0.1=225
	 * 请在键盘上输入一个人的月收入，编程实现计算该公民所要交的税。
	 * 例如：输入“6000”，则输出“你要交的税为：225”。
	 */
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double ans = 0;
		double income = in.nextDouble();
		int level = 0;
		int[] a = {1500, 4500, 9000, 35000, 55000, 80000};
		int[] tax = {5, 10, 20, 25, 30, 35, 35};
		income -= 3000;
		while (income > 0)
		{
			ans += (income - a[level] < 0 ? income : a[level]) * (tax[level] / 100.0);
			income -= a[level++];
		}
		System.out.println(ans);
	}
	
}
