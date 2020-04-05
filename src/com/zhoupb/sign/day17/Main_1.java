package com.zhoupb.sign.day17;

public class Main_1 {
	
	/**
	 * 任务一：堆积木游戏功能关键算法
	 * 堆积木是小孩子最爱玩的游戏，
	 * 但是因为小孩子的好奇心（比如误食积木等）
	 * 导致家长们越不愿意让孩子去玩积木，
	 * 为了解决这个问题TX公司开发了一套VR积木游戏
	 * 你要做的是将用户堆好的积木在屏幕中显示出来。
	 * *******
	 * *****
	 * ***
	 * *
	 * 注意：使用循环结构语句实现。
	 */
	
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 7 - i * 2; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
