package com.domain;

public class PalindromeNumber 
{

	public static void main(String[] args) 
	{
		int num  = 159;
		int temp = num;
		int rev = 0;
		while(num > 0) 
		{
			int last = num%10;
			num = num/10;
			rev = (rev*10)+last;
		}
		//System.out.println(rev);	
		
		if(rev == temp)
		{
			System.out.println(temp + " is Palindrome number");
		}
		else 
		{
			System.out.println(temp + " is not Palindrome number");
			
		}

	}

}
