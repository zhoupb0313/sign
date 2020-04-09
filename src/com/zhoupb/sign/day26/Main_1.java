package com.zhoupb.sign.day26;

public class Main_1 {

	/**
	 * 任务一：汽车与摩托问题的关键算法
	 * 任务一：在一个停车场内，汽车、摩托车共停了48辆，其中每辆汽车有4个轮子，每辆摩托车有3个轮子，这些车共有172个轮子，
	 * 编程输出停车场内有汽车和摩托车的数量。
	 * 注意：用循环语句实现。
	 */
	
	public static void main(String args[])
	{
		for (int q = 0; q <= 48; q++)
			for (int m = 0; m <= 48; m++)
				if (q * 4 + m * 3 == 172  && q + m == 48)
					System.out.printf("汽车:%d, 摩托车:%d", q, m);
	}
	
	
}
