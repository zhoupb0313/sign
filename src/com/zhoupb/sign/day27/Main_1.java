package com.zhoupb.sign.day27;

public class Main_1 {
	
	/**
	 * 任务一：定义盒子Box类，要求具有以下成员：长、宽、高分别为x,y,z，
	 * 可设置盒子形状；可计算盒子体积；可计算盒子的表面积。
	 * 注意：盒子的体积和表面积的计算定义为类的成员函数。
	 */
	
	public static void main(String args[])
	{
		Box b = new Box();
		b.x = 1; b.y = 2; b.z = 3;
		b.setShape("立方体");
		b.getVolume();
		b.getArea();
	}
	
	
	private static class Box
	{
		double x, y, z;
		
		void setShape(String shape)
		{
			System.out.println("成功设置成:" + shape + "形状");
		}
		
		void getVolume()
		{
			System.out.printf("盒子的体积为:%.8f\n", x * y * z);
		}
		
		void getArea()
		{
			System.out.printf("盒子的面积为:%.8f\n", 2 * (x * y + x * z + y * z));
		}
		
	}

}
