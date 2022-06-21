package com;

public class Ifstatement {

	static void withdraw()
	{
		System.out.println("Money is Withdraw");
	}

	public static void main(String[] args) {
		int balance = 600;
		if (balance>500)
			Ifstatement.withdraw();
		System.out.println("Simple if demonstration");
	
		
	}

}
