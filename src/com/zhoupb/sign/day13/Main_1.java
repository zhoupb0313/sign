package com.zhoupb.sign.day13;

import java.util.*;

public class Main_1 {
	
	/**
	 * 任务一：学生成绩分类关键算法
	 * 根据输入的成绩分数，输出相应的等级。“学习成绩>=90分”的同学用A表示，“60<=学习成绩<90”的同学用B表示，60分以下的用C表示。 
	 * 注意：使用分支结构语句实现。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		double x = in.nextDouble();
		if (x >= 90) System.out.println("A");
		else if (x >= 60) System.out.println("B");
		else System.out.println("C");
	}

}
