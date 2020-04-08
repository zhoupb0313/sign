package com.zhoupb.sign.day25;

import java.util.*;

public class Main_3 {
	
	/**
	 * 任务三：人工湖关键算法
	 * 现在，动物园想在新建一个三角形的人工湖，一是为了养鱼美观，二是可以循环水资源。
	 * 从键盘输入三条边A，B，C的边长，请编程判断能否组成一个三角形。
	 * 要求：  A,B,C <1000，如果三条边长A,B,C能组成三角形的话，输出YES，否则NO。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
		System.out.println(a + b >= c && b + c >= a && a + c >= b ? "YES" : "NO");
	}
	
}
