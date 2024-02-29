package com.domain;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		//Generate fibonacci series numbers up to 100
//		int fno = 0;
//		int sno = 1;
//		int res = fno + sno;
//		System.out.println(fno);
//		System.out.println(sno);
//		
//		while(res<=100) 
//		{
//			System.out.println(res);
//			fno = sno;
//			sno = res;
//			res = fno + sno;
//		}
		printFibonacciNumber(100);
	}	
	
	// Generate "100" fibonacci series numbers
	static void printFibonacciNumber(int n) 
	{
		int f1 = 0;
		int f2 = 1;
		int i;
		
		if(n<1)
		{ 
			return;
		}
		System.out.println(f1 + " ");
		
		for(i=1;i<n;i++) 
		{
			System.out.println(f2 + " ");
			int res = f1 + f2;
			f1 = f2;
			f2 = res;
		}	
	}
}

