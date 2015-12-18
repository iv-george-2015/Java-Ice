package com.ivtl.lambda;

import java.io.File;

public class LambdaEvaluator {
public static void main(String args[]){
	try {
		int s = Integer.parseInt("100sd");
		File f = new File("sdsa");
		File f2 = new File("sdsa");
		f.renameTo(f2);
	} catch ( NullPointerException | ArithmeticException e) {
		e.printStackTrace();
	}
	Calculatable adder = (a,b)-> a+b;
	Calculatable subtraction = (a,b)-> 
	{
		int c = a*b;
		return c;
	};
	System.out.println(doOperation((a,b)->{return a+b+a;},2 , 3));

System.out.println(adder.calculate(4,5));
System.out.println(subtraction.calculate(5, 6));

}

public static int doOperation(Calculatable c,int a,int b){
	return c.calculate(a, b);
}
	
}

interface Calculatable{
	int calculate(int a,int b);
}

