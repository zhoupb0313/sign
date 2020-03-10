package com.zhoupb.sign.day01;
//	乘法口诀助记功能关键算法
public class Main_2 {
	
	static final int N = 9;
	
	public static void main(String[] args)
	{
		for (int i = 1; i <= N; i++)
		{
			for (int j = 1; j <= i; j++) System.out.printf("%d * %d = %d\t", j, i, i * j);
			System.out.printf("\n");
		}
	}
	
}
