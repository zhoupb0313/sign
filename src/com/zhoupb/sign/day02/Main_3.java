package com.zhoupb.sign.day02;

import java.util.*;

public class Main_3 {
	
	/**
	 * 任务三：趣味英语试题3关键算法
	 * 编写一个程序实现统计一串字符串中的英文小写字母个数！
	 * 例如：输入“axZvnNgOuyi”，得到的值应该是8；
	 */

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String str = in.next();
		int ans = 0;
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ans++;
//		System.out.printf("%s中小写英文字母有%d个\n", str, ans);
		System.out.print(ans + "\n");
	}
	
}
