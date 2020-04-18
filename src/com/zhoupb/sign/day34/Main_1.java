package com.zhoupb.sign.day34;

public class Main_1 {

	/**
	 * 中国古代的《算经》记载了这样一个问题：
	 * 公鸡5文钱1只，母鸡3文钱1只，小鸡1文钱3只，如果用100文钱买100只鸡，
	 * 那么公鸡、母鸡和小鸡各应该买多少只呢？
	 * 现在请你编程求出所有的解，每个解输出3个整数，打印在一行，用空格隔开，分别代表买的公鸡、母鸡、小鸡的数量。 
	 * 注意：100文钱要正好用完。请输出所有的解，每个解占一行。
	 */
	
	/*
	 * x + y + z = 100
	 * 5x + 3y + z / 3 = 100
	 */
	
	public static void main(String args[])
	{
		for (int x = 0; x <= 20; x++)
			for (int y = 0; y <= 34; y++)
				for (int z = 0; z <= 100; z++)
					if (x + y + z == 100 && 15 * x + 9 * y + z == 300)
						System.out.printf("公鸡:%d 母鸡:%d 小鸡:%d\n", x, y, z);
	}
	
}
