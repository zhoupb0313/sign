package com.zhoupb.sign.day26;

public class Main_3 {

	/**
	 * 任务三：合格电视机问题的关键算法
	 * 某电视机厂每天生产电视500台，在质量评比中，每生产一台合格电视机记5分，每生产一台不合格电视机扣18分。
	 * 如果四天得了9931分，编程计算这四天生产的合格电视机的台数，并输出。
	 * 注意：用循环语句实现。
	 */
	
	public static void main(String args[])
	{
		for (int x = 0; x <= 2000; x++)
			for (int y = 0; y <= 2000; y++)
				if (x + y == 2000 && x * 5 - y * 18 == 9931)
					System.out.println(x);
	}
		
}
