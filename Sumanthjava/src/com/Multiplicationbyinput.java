package com;

import java.util.Scanner;

public class Multiplicationbyinput {

	public static void main(String[] args) {
		int c;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the first number =");
		int a = sc1.nextInt();
		System.out.println("Enter the second number =");
		int b = sc2.nextInt();
		
		c=a*b;
		System.out.println("result="+c);

	}

}
