package com.zhoupb.sign.day25;

public class Main_1 {
	
	/**
	 * 任务一：饲养功能关键算法
	 * 动物园饲养的食肉动物分大型动物和小型动物两类
	 * 规定老虎、狮子一类的大动物每次喂肉每头三斤
	 * 狐狸、山猫一类小动物每三头喂一斤．
	 * 该动物园共有这两类动物100头，每次需喂肉100斤，编程输出大、小动物的数量。
	 * 要求：用循环语句实现
	 */

	public static void main(String args[])
	{
		// x * 3 + 1 / 3 * y = 100
		// x + y = 200
		for (int x = 0; x <= 100; x++)
			for (int y = 0; y <= 100; y++)
				if (x * 9 + y == 300 && x + y == 100)
					System.out.printf("大型:%d, 小型:%d\n", x, y);
	}
	
}
