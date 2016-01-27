package com.ivtl.passByValye;

public class PassByValue {

	public static void main(String args[]){
		  Point pnt1 = new Point(5,5);
		  Point pnt2 = new Point(6,6);
		  System.out.println("pnt1-X: " + pnt1.x + " pnt1-Y: " +pnt1.y); 
		  System.out.println("pnt2-X: " + pnt2.x + " pnt2-Y: " +pnt2.y);
		  System.out.println(" ");
		  trickySwap(pnt1,pnt2);
		  System.out.println("pnt1-X: " + pnt1.x + " pnt1-Y:" + pnt1.y); 
		  System.out.println("pnt2-X: " + pnt2.x + " pnt2-Y: " +pnt2.y);  
	}
	
	public static void trickySwap(Point pnt1arg, Point pnt2arg)
	{
		
//	  Point temp = pnt1arg;
//	  pnt1arg = pnt2arg;
//	  pnt2arg = temp;
		
	Point temp = new Point(0,0);
	temp.x = pnt1arg.x;
	temp.y = pnt1arg.y;
	
	pnt1arg.x=pnt2arg.x;
	pnt1arg.y=pnt2arg.y;
	
	pnt2arg.x=temp.x;
	pnt2arg.y = temp.y;
	
	}
	
}

class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}	
	
}