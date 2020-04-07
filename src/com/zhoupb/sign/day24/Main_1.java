package com.zhoupb.sign.day24;

import java.util.*;

public class Main_1 {
	
	/**
	 * 任务一：成绩等级划分功能关键算法
	 * 输入一个百分制的成绩t，将其转换成对应的等级然后输出，具体转换规则如下：
	 * 90~100为A
	 * 80~89为B
	 * 70~79为C
	 * 60~69为D
	 * 0~59为E
	 * 要求：如果输入数据不在0~100范围内，请输出一行：“Score is error!”。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int x = (int) in.nextDouble();
		String leves = "EEEEEEDCBAA";
		System.out.println(x < 0 || x > 100 ? "Score is error!" : leves.charAt(x / 10));
	}
	
}
