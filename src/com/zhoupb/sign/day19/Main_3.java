package com.zhoupb.sign.day19;

public class Main_3 {
	
	
	/**
	 * 任务三：市场调查数据的恢复功能关键算法
	 * 职员小A今天犯了一个致命的错误，他一不小心丢失了X项目的市场调查结果只记得一个公式 xyz+yzz=532，
	 * 其中x、y、z均为一位数，现在请你帮忙编写一个程序求出x、y、z分别代表什么数。
	 * 注意：用带有一个输入参数的函数(或方法)实现，返回值类型为布尔类型。 
	 */

	static boolean fun(int n)
	{
		for (int x = 0; x < 10; x++)
			for (int y = 0; y < 10; y++)
				for (int z = 0; z < 10; z++)
					if ((x * 100 + y * 10 + z) + (y * 100 + z * 10 + z) == n)
						System.out.printf("%d %d %d", x, y, z);
		return true;
	}
	
	public static void main(String args[])
	{
		fun(532);
	}
	
}
