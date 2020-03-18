package com.zhoupb.sign.day08;

public class Main_1 {

	/**
	 * 任务一：合并数字检测关键算法
	 * 请编写函数(或方法)fun，其功能是：将两个两位数的正整数a、b合并形成一个整数放在c中。
	 * 合并的方式是：将a数的十位和个位数依次放在c数个位和十位上，b数的十位和个位数依次放在c数的百位和千位上。
	 * 例如，当a=16、b=35时，则c=5361。
	 * 注意：其中，a、b为函数(或方法)fun的输入参数，c为函数(或方法)fun的返回值。
	 */
	
	static int fun(int a, int b)
	{
		return f(b) * 100 + f(a);
	}
	
	static int f(int x)
	{
		int ans = 0;
		while (x != 0)
		{
			ans += x % 10;
			ans *= 10;
			x /= 10;
		}
		return ans / 10;
	}
	
	public static void main(String[] args)
	{
		System.out.println(fun(16, 35));
	}
	
}
