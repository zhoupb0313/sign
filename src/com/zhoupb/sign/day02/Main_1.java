package com.zhoupb.sign.day02;

public class Main_1 {

	/**
	 * 任务一：趣味英语试题1关键算法
	 * 已知字符串数组A，包含初始数据：a1,a2,a3,a4,a5；字符串数组B，包含初始数据：b1,b2,b3,b4,b5。
	 * 编写程序将数组A、B的每一对应数据项相连接，然后存入字符串数组C，并输出数组C。输出结果为：a1b1,a2b2,a3b3,a4b4,a5b5。
	 */
	
	public static void main(String[] args)
	{
		String[] a = {"Hello ", "Hello ", "Hello ", "Hello ", "Hello "};
		String[] b = {"Jack" , "Tom" , "Lee" , "John" , "Alisa"};
		String[] c = new String[a.length];
		for (int i = 0; i < a.length; i++) c[i] = a[i] + b[i];
		System.out.print("{");
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print("“" + c[i] + "”");
			System.out.print(i == c.length - 1 ? "" : ", ");
		}
		System.out.print("}");
	}
	
}
