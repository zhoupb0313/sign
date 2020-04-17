package com.zhoupb.sign.day33;

public class Main_1 {

	/**
	 * 美国数学家维纳(N.Wiener)智力早熟，11岁就上了大学。他曾在1935~1936年应邀来中国清华大学讲学。
	 * 一次，他参加某个重要会议，年轻的脸孔引人注目。于是有人询问他的年龄，他回答说：
	 * “我年龄的立方是个4位数。我年龄的4次方是个6位数。
	 * 这10个数字正好包含了从0到9这10个数字，每个都恰好出现1次。”
	 * 请你编程计算，他当时到底有多年轻。
	 */
	
	public static void main(String args[])
	{
		int ans = 1;
		int a[] = new int[10], t = 0;
		boolean b = true;
		for (; ans <= 30; ans++)
		{
			b = true;
			for (int i = 0; i < a.length; i++) a[i] = 0;
			t = ans * ans * ans;
			for (; t != 0; t /= 10) a[t % 10]++;
			t = ans * ans * ans * ans;
			for (; t != 0; t /= 10) a[t % 10]++;
			for (int i = 0; i < a.length; i++) 
				if (a[i] != 1)
				{
					b = false;
					break;
				}
			if (b)
			{
				System.out.println(ans);
				break;
			}
		}
	}
	
}
