package com.ivtl.prepost;

public class PrePostTrial {
public static void main(String args[]){
	
	//RHS evaluated and assigned to LHS
int a=5;

System.out.println(++a + ++a + a++ + ++a + ++a); // 6+7+7+9+10 and a=8
System.out.println(a);

//reassign 'a' value
a=5;
System.out.println(++a + a++ + a++ + a++ + a++); // 6+6+7+8+9 and a=8
System.out.println(a);

//reassign 'a' value
a=5; 
System.out.println(a);

a = ++a + ++a + a++;

System.out.println(a);
}
}

