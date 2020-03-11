package com.zhoupb.sign.day02;

import java.util.*;

public class Main_3 {

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
