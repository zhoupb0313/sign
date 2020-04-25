package com.zhoupb.sign.day37;

import java.math.BigDecimal;
import java.util.*;

public class Main_1 {

	/**
	 * 任务：客户余额排名关键算法
	 * 创建五个用户对象，对用户的余额进行降序排列，输出对应的姓名。 
	 * 例如五个对象的属性值分别为（姓名 密码 余额）。
	 * 张三   2131     89.9
	 * 李四   1231     1002
	 * 王五   wd2131   75.12
	 * 赵六   2131     10902
	 * 孙七   1254w2   123
	 * 那么输出结果为
	 * 赵六 李四 孙七 张三 王五	
	 */
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		User us[] = new User[5];
		for (int i = 0; i < 5; i++)
			us[i] = new User(in.next(), in.next(), in.nextBigDecimal());
		Arrays.sort(us, (o1, o2) -> o2.balance.compareTo(o1.balance));
		for (int i = 0; i < 5; i++) System.out.print(us[i].name + " ");
	}
	
	private static class User
	{
		@SuppressWarnings("unused")
		String name, pw;
		BigDecimal balance;
		public User(String name, String pw, BigDecimal balance) {this.name = name; this.pw = pw; this.balance = balance;}
	}
	
}
