package com;

class bank
{
	float getRateOfIntrest ()
	{
		return 6.7f;
	}
}
	class SBI extends bank
	{
		float getrateofintrest ()
		{
	
			return 6.7f;
		}
	}
	class HDFC extends bank
	{
		float getrateofintrest ()
		{
			return 6.5f;
			
		}
	}
	class ICICI extends bank
	{
		float getrateofintrest ()
		{
			return 6.3f;
		}
	}	

public class Methodoverriding {

	public static void main(String[] args) {
			HDFC obj = new HDFC();
			System.out.println("The rate of intrest of HDFC = ");
			System.out.println(obj.getrateofintrest());
			
			}


	}

