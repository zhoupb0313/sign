package com.zhoupb.sign.day05;

public class Main_3 {

	/**
	 * 任务三：图形面积计算关键算法
	 * 编写程序实现：
	 * ①定义一个抽象类Shape，它有一个计算面积的抽象方法calArea。
	 * ②定义一个三角形类Triangle。
	 * 	它有两个属性n、m，分别表示三角形的底和高。另外，它必须继承于Shape类，并实现calArea方法来计算三角形的面积。
	 * ③定义一个矩形类Rectangle。
	 * 	它有两个属性n、m，分别表示矩形的长和宽。另外，它必须继承于Shape类，并实现calArea方法来计算矩形的面积。
	 * ④定义一个圆类Circle。它有一个属性n，表示圆形的半径。另外，它必须继承于Shape类，并实现calArea方法来计算圆形的面积。
	 * ⑤分别创建一个三角形对象、一个矩形对象、一个圆形对象，然后将它们存入到一个数组中，最后将数组中各类图形的面积输出到屏幕上。
	 */
	
	public static void main(String[] args) {
//		Shape[] ss = 
//		{
//			new Circle(2),
//			new Rectangle(3, 4),
//			new Triangle(2, 5)
//		};
//		for (Shape s : ss) System.out.println(s.calArea());
		System.out.println(Math.pow(1000, 3));
	}
}

class Circle extends Shape
{
	double n;
	public Circle(double n) {
		this.n = n;
	}
	@Override
	double calArea() {
		return Math.PI * n * n;
	}
}

class Rectangle extends Shape
{
	double n, m;
	public Rectangle(double n, double m) {
		this.n = n;
		this.m = m;
	}
	@Override
	double calArea() {
		return n * m;
	}
}

class Triangle extends Shape
{
	double n, m;
	public Triangle(double n, double m) {
		super();
		this.n = n;
		this.m = m;
	}
	@Override
	double calArea() {
		return n * m / 2;
	}
}

abstract class Shape
{
	abstract double calArea();
}