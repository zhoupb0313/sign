package com.zhoupb.sign.day06;

import java.awt.Image;
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
//		double salary = income;
		int level = 0;
		long[] a = {0, 1500, 4500, 9000, 35000, 55000, 80000, Long.MAX_VALUE};
		int[] taxs = {5, 10, 20, 25, 30, 35, 45};
		income -= 3000;
		while (income > a[level])
		{
			ans += (income > a[level + 1] ? a[level + 1] - a[level] : income - a[level]) * taxs[level] / 100.0;
			level++;
		}
		System.out.println(ans);
		
//		double money = 0;// 税额
//        double taxes = 0;
//        if (salary < 0) {
//            System.out.println("你工资哪去了？？？");
//        } else {
//            money = salary - 3000;
//            if (money <= 0) {
//                System.out.println("个税的起征点为 3000元");
//            } else if (money <= 1500) {
//                taxes = money * 0.05;
//            } else if (money <= 4500) {
//                taxes = 1500 * 0.05 + (money - 1500) * 0.1; //
//            } else if (money <= 9000) {
//                taxes = 1500 * 0.05 + 3000 * 0.1 + (money - 4500) * 0.2;
//            } else if (money <= 35000) {
//                taxes = 1500 * 0.05 + 3000 * 0.1 + 4500 * 0.2 + (money - 9000) * 0.25;
//            } else if (money <= 55000) {
//                taxes = 1500 * 0.05 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + (money - 35000) * 0.3;
//            } else if (money <= 80000) {
//                taxes = 1500 * 0.05 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + (money - 55000) * 0.35;
//            } else {
//                taxes = 1500 * 0.05 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (money - 80000) * 0.45;
//            }
//            System.out.println("你要交的税为：" + taxes + "元");
//        }
		
	}
	
}
