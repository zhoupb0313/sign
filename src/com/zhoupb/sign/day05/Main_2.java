package com.zhoupb.sign.day05;

import java.util.*;

public class Main_2 {

	/**
	 * 任务二：坐标求长度关键算法
	 * 输入两点坐标（X1,Y1）,（X2,Y2）,计算并输出两点间的距离。
	 * 输入数据有多组，每组占一行，由4个实数组成，分别表示x1,y1,x2,y2,数据之间用空格隔开。 
	 * 例如输入： 1 3 4 6 则输出：4.24
	 * 注意：对于每组输入数据，输出一行，结果保留两位小数。
	 */
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		double x1 = in.nextDouble(), y1 = in.nextDouble(), x2 = in.nextDouble(), y2 = in.nextDouble();
		double x = Math.abs(x1 - x2) * Math.abs(x1 - x2) + Math.abs(y1 - y2) * Math.abs(y1 - y2);
		double l = 0, r = x;
		while (r - l > 10e-5)
		{
			double mid = (l + r) / 2;
			if (mid * mid < x) l = mid;
			else r = mid;
		}
		System.out.printf("%.2f", l);
	}
	
}
