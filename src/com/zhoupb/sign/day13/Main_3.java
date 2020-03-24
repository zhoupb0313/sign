package com.zhoupb.sign.day13;

public class Main_3 {

	/**
	 * 任务三：学生成绩排序关键算法
	 * 使用选择排序法对数组中的学生成绩按升序进行排序，如下所示：
	 * 原始数组：a[ ]={1,8,9,6,4,2,5,0,7,3}
	 * 排序后：  a[ ]={0,1,2,3,4,5,6,7,8,9}
	 * 注意：综合使用分支、循环结构语句实现，直接输出结果不计分。
	 */
	static int N = 15;
	static int a[] = {1, 8, 9, 6, 4, 2, 5, 0, 7, 3}, b[] = new int[N];
	
	static void sort(int l, int r)
	{
		if (l >= r) return;
		int mid = l + r >> 1;
		sort(l, mid); 
		sort(mid + 1, r);
		int i = l, j = mid + 1, k = 0;
		while (i <= mid && j <= r)
			if (a[i] <= a[j]) b[k++] = a[i++];
			else b[k++] = a[j++];
		while (i <= mid) b[k++] = a[i++];
		while (j <= r) b[k++] = a[j++];
		for (i = l, j = 0; i <= r; i++, j++) a[i] = b[j];
	}
	
	public static void main(String args[])
	{
		sort(0, a.length - 1);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
	
}
