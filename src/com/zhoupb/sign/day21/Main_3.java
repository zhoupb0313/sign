package com.zhoupb.sign.day21;

public class Main_3 {

	/**
	 * 任务三：图形界面关键算法
	 * 分析下列数据的规律，编写程序完成如下所示的输出。
	 * 1                                
	 * 1   1                            
	 * 1   2   1                        
	 * 1   3   3   1                    
	 * 1   4   6   4   1               
	 * 1   5   10  10  5  1             
	 * 要求：使用递归函数(或方法)实现，递归函数(或方法)有两个输入参数，返回值类型为整型。
	 * 如果确实不了解递归的同学，就用其他方法实现吧。
	 */
	
	public static void main(String args[])
	{
		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.printf("%-5d", f(i, j));
			System.out.println();
		}
	}
	
	static int f(int r, int c)
	{
		if (r == c) return 1;
		if (c == 1 || r == 1) return 1;
		return f(r - 1, c) + f(r - 1, c - 1);
	}
	
}
