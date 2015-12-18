package com.ivtl.prepost;

public class PrePostTrial {
public static void main(String args[]){
	
	//RHS evaluated and assigned to LHS
int a=5;

System.out.println(++a + ++a + a++); // 6+7+7 and a=8
System.out.println(a);

a=5; // now a is assigned value 5

System.out.println(a);

a = ++a + ++a + a++;

System.out.println(a);
}
}

