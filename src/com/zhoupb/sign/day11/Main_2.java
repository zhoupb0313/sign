package com.zhoupb.sign.day11;

public class Main_2 {
	
	/**
	 * 任务二：财务报表恢复功能关键算法
	 * 在经过财务几天的加班统计A公司的年度财务报表终于计算出来了，
	 * 职员小Z在将报表送给CEO N老总查阅的时候，手一抖把座子上的墨水洒到了收入总金额上，
	 * 一想起N老总的怒火，小Z不禁瑟瑟发抖，
	 * 他只记得结果除2余1，除3余2，除5余4每请你帮忙找到这个数据然后让小Z逃过这次劫难吧。
	 * 注意：用循环语句实现，直接打印出结果不给分。
	 */

	public static void main(String args[])
	{
		int x = 1;
		while (!(x % 2 == 1 && x % 3 == 2 && x % 5 == 4)) x++;
		System.out.println(x);
	}
	
}
