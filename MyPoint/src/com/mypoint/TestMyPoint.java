package com.mypoint;
class MyPoint
{
	int x,y;
	MyPoint()
	{
		System.out.println("Default constructor called ");
		this.x=0;
		this.y=0;
	}
	MyPoint(int x,int y)
	{
		System.out.println("Parameterised constructor called ");
		this.x=x;
		this.y=y;
	}
	//This is a copy constructor
	MyPoint(MyPoint another)
	{
		System.out.println("Copy constructor called ");
		this.x=another.x;
		this.y=another.y;
	}
	public double calcDistance()
	{
		int xdiff=x-0;
		int ydiff=y-0;
		return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
	}
	public double calcDistance(int x,int y)
	{
		int xdiff=this.x-x;
		int ydiff=this.y-y;
		return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
	}
	public double calcDistance(MyPoint another)
	{
		int xdiff =this.x-another.x;
		int ydiff= this.y-another.y;
		return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
	}
}
public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint point1 =new MyPoint(3,4);
		MyPoint point2 =new MyPoint(5,6);
		MyPoint point3 =new MyPoint(point2);//Using constructor
		
		double d1=point1.calcDistance();
		double d2=point1.calcDistance(9,12);
		double d3=point1.calcDistance(point2);
		
		double d4=point1.calcDistance(9,12);
		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d2);
		System.out.println("d3 : "+d3);
		//d2 and d4 will get same answer because of same object and same parameter in method call
		System.out.println("d4 : "+d4);
	}

}
