package com.xworkz.chaining.boot;


import com.xworkz.chaining.app3.Thread;

public class RopeRunner {

	public static void main(String[] args) {
		System.out.println("invocking in main RopeRunner");
		
		Thread thread=new Thread();
		System.out.println(thread.material);
		System.out.println(thread.price);
		System.out.println(thread.quantity);
		System.out.println(thread.using);
			
			
		Thread thread1=new Thread("cotton",6700,40,false);
		System.out.println(thread1.material);
		System.out.println(thread1.price);
		System.out.println(thread1.quantity);
		System.out.println(thread1.using);
	}
}

