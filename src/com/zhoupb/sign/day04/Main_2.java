package com.zhoupb.sign.day04;

import java.util.*;

public class Main_2 {
	
	/**
	 * 任务二： 成绩等级计算关键算法
	 * 输入一批学生成绩，以-1作为结束标记 。统计这批学生中，不及格（score<60）、及格（60<=score<70）、中等（70<=score<80）、良好（80<=score<90）、优秀（90<=score<=100）的人数。
	 * 注意：使用分支、循环结构语句实现。
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int[] level = new int[11];
		
		int s = 0;
		while ((s = in.nextInt()) != -1) level[s / 10 == 10 ? 9 : s / 10]++;
		int ans = 0;
		for (int i = 1; i < 6; i++) ans += level[i] ;
		System.out.println("不及格的人数:" + ans);
		System.out.println("及格的人数:" + level[6]);
		System.out.println("中等的人数:" + level[7]);
		System.out.println("良好的人数:" + level[8]);
		System.out.println("优秀的人数:" + level[9]);
	}
	
}
