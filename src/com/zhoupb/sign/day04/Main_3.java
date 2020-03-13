package com.zhoupb.sign.day04;

public class Main_3 {

	/**
	 * 任务三：信息管理功能关键算法 创建5个学生对象，并赋给一个学生数组，每个学生有以下属性：学号、姓名、年龄，请按顺序实现以下任务：
	 * 子任务1：将学生按学号排序输出。 
	 * 子任务2：给所有学生年龄加1。
	 * 子任务3：在实现子任务2的基础上，统计大于20岁的学生人数。
	 */

	public static void main(String[] args) 
	{
		StudentTHIS[] ss = new StudentTHIS[] 
		{
			new StudentTHIS(1, 18, "zhoupb1"),
			new StudentTHIS(5, 15, "zhoupb5"),
			new StudentTHIS(3, 13, "zhoupb3"),
			new StudentTHIS(4, 14, "zhoupb4"),
			new StudentTHIS(2, 21, "zhoupb2"),
		};
//		sort(ss, 0, ss.length - 1);
		java.util.Arrays.sort(ss);
		for (int i = 0; i < ss.length; i++) System.out.println(ss[i]);
		int ans = 0;
		for (int i = 0; i < ss.length; i++) 
		{
			ss[i].age++;
			if (ss[i].age >= 20) ans++;
		}
		System.out.println(ans);
	}
	
//	static void sort(StudentTHIS[] a, int l, int r)
//	{
//		if (l >= r) return;
//		StudentTHIS x = a[l + r >> 1];
//		int i = l - 1, j = r + 1;
//		while (i < j)
//		{
//			while (a[++i].id < x.id);
//			while (a[--j].id > x.id);
//			if (i < j)
//			{
//				StudentTHIS t = a[i];
//				a[i] = a[j];
//				a[j] = t;
//			}
//		}
//		sort(a, l, j);
//		sort(a, j + 1, r);
//	}

}

class StudentTHIS implements Comparable<StudentTHIS>
{
	int id, age;
	String name;

	public StudentTHIS(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentTHIS [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(StudentTHIS o) {
		return id - o.id;
	}
	
}
