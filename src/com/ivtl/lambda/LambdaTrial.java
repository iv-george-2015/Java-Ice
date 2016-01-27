package com.ivtl.lambda;

public class LambdaTrial {
	   public static void main(String args[]){
	      LambdaTrial tester = new LambdaTrial();
			
	      //with type declaration
	      MathOperation addition = (int a, int b) -> {
	    	  for(int i=0;i<100;i++){
	    		  if(i%5 == 0){
	    			  a = a+5;
	    		  }
	    	  }
	    	  return a + b;
	    			  };
			
	      //with out type declaration
	      MathOperation subtraction = (a, b) -> a - b;
			
	      //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> a * b ;
			
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
			
	      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
			
	      //with parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //without parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Mahesh");
	      greetService2.sayMessage("Suresh");
	   }
		
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	   }
	}
