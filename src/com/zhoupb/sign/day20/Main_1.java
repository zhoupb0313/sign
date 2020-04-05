package com.zhoupb.sign.day20;

public class Main_1 {

	/**
	 * 任务一：逆置序列功能关键算法
	 * 编写函数(或方法)实现：
	 * 数组A是函数(或方法)的输入参数，
	 * 将数组A中的数据元素序列逆置后存储到数组B中，然后将数组B做为函数(或方法)的返回值返回。
	 * 所谓逆置是把(a0, a1, …, an-1)变为(an-1, …, a1, a0)。
	 * 要求：使用函数(或方法)实现，原型为int[]  niZi(int[] A) 
	 */
	
	public static void main(String args[])
	{
		int ans[] = niZi(new int[] {1, 2, 3, 4});
		System.out.println(java.util.Arrays.toString(ans));
	}
	
	static int[] niZi(int[] A)
	{
		int B[] = new int[A.length];
		for (int i = 0, j = A.length - 1; i < A.length; i++, j--) B[j] = A[i];
		return B;
	}
}
