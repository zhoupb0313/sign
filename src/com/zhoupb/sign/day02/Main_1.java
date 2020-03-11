package com.zhoupb.sign.day02;

public class Main_1 {

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
