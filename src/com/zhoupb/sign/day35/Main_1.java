package com.zhoupb.sign.day35;

public class Main_1 {

	/**
	 * 中国古代文献中，曾记载过“大衍数列”, 主要用于解释中国传统文化中的太极衍生原理。它的前几项是：0、2、4、8、12、18、24、32、40、50 ...
	 * 其规律是：对偶数项，是序号平方再除2，奇数项，是序号平方减1再除2。
	 * 投资人决定，节庆活动抽奖活动的中奖序列按照“大衍数列”的前100项。
	 * 请你打印出“大衍数列”的前100项。
	 * 注意：输出占一行，两个数之间用空格隔开，
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++)
		{
			if ((i & 1) == 0)
				System.out.print(i * i / 2 + " ");
			else
				System.out.print((i * i - 1) / 2 + " ");
		}
	}
	
}
