package com.zhoupb.sign.day10;

public class Main_2 {
	
	/**
	 * 任务二：统计纸片对折关键算法
	 * 假设一张足够大的纸，纸张的厚度为0.5毫米。
	 * 请问对折多少次以后，可以达到珠穆朗玛峰的高度(最新数据：8844.43米)。
	 * 请编写程序输出对折次数。
	 * 注意：使用循环结构语句实现，直接输出结果不计分。
	 */
	
	public static void main(String[] args)
	{
		double init = 0.5;
		int ans = 0;
		while (init < 8844430)
		{
			init *= 2;
			ans++;
		}
		System.out.println(ans);
	}

}
