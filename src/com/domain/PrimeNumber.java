package com.domain;

public class PrimeNumber 
{

	public static void main(String[] args)
	{
		 int num = 49;
		 boolean isPrime = true;
		 
		 for(int i=2; i<num; i++)
		 {
			 if(num%i==0)
			 {
				 isPrime = false;
				 break;
			 }
		 }
		 if(isPrime==true) 
		 {
			 System.out.println(num + " is Prime");
		 }
		 else 
		 {
			 System.out.println(num + " is not Prime");
		 }
		 
		 
	}

}
