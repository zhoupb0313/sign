package com.zhoupb.sign.day19;

public class Main_2 {
	
	/**
	 * 任务二：销售量分析功能关键算法
	 * KJ学院为全校同学设计一套校服，
	 * A公司有意招标为A学校设计服装，
	 * 职员小C在A校排队时偷偷的看了一眼发现A学校学生，5人一行余2人，7人一行余3人，3人一行余1人，编写一个程序求该校的学生人数。
	 * 注意：使用分支、循环结构语句实现，直接输出结果不计分。
	 */
	
	public static void main(String args[])
	{
		for (int i = 1; i < Integer.MAX_VALUE; i++)
			if (i % 5 == 2 && i % 7 == 3 && i % 3 == 1)
			{
				System.out.println(i);
				break;
			}
	}
	
}
