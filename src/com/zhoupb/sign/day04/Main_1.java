package com.zhoupb.sign.day04;

public class Main_1 {

	/**
	 * 任务一：学生类关键算法
	 * 请完成以下编程工作：
	 * ①定义学生类，其包含2个属性：学号，姓名。
	 * ②定义大学生类，该类继承于学生类，并新增一个属性：专业。
	 * ③为大学生类实例化一个对象，并给这个大学生对象的所有属性赋值。
	 * 注意：
	 * ①所有属性的数据类型均为字符串类型。
	 * ②大学生类应该继承于学生类。
	 * ③在主函数(或主方法)中实例化大学生对象，并给该对象的每个属性赋值。
	 */
	
	public static void main(String[] args)
	{
		CollegeStudent collegeStudent = new CollegeStudent();
		collegeStudent.id = "00001";
		collegeStudent.name = "zhoupb";
		collegeStudent.profession = "software";
	}
	
}

class Student 
{
	String id;
	String name;
}

class CollegeStudent extends Student
{
	String profession;
}