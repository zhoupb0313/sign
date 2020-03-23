package com.zhoupb.sign.day12;

import java.util.*;

public class Main_2 {
	
	/**
	 * 任务二：副结长度关键算法（30分）
	 * 公司设计的中国节还需要副结(主结周围的结)，于是打算设计副结的长度满足是素数这个条件。
	 * 现在公司需要统计出某个范围内哪些数是素数。
	 * 从键盘上输入一个整数N，输出1~N之间的素数。
	 * 注意：用带有一个输入参数的函数(或方法)实现，返回值类型为布尔类型。
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n = in.nextInt();
		boolean primes[] = new boolean[n + 1];
		for (int i = 2; i < n; i++)
			for (int j = 2; j * i <= n; j++)
				primes[i * j] = true;
		
		for (int i = 2; i < n; i++)
			if (!primes[i]) System.out.print(i + " ");
	}
	
	static boolean isPrime(int n)
	{
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0) return false;
		return true;
	}

}
