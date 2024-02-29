package com.domain;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int num  = 153;
		int temp = num;
		int res = 0;
		while(num > 0) 
		{
			int last = num%10;
			num = num/10;
			res = res+(last*last*last);
		}
		if(temp == res)
		{
			System.out.println(temp + " is armstrong number");
		}
		else 
		{
			System.out.println(temp + " is not armstrong number");
			
		}

	}

}
