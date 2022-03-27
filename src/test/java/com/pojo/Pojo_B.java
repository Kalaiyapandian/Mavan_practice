package com.pojo;

public class Pojo_B {

	public static void main(String[] args) {
		
		
		Pojo_A a = new Pojo_A();
		
		int age = a.getAge();
		
		
		
		System.out.println("age : "+age);
		
		a.setAge(20);
		System.out.println("After setters ");
		
		int age2 = a.getAge();
		System.out.println("age   :  "+age2);
		
		
	}
	
	
	
	
	
	
	
	
	
}
