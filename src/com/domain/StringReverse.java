package com.domain;

public class StringReverse 
{

	public static void main(String[] args) 
	{
		
//		String s = "palle tech";
//		for(int i=s.length()-1; i>=0; i--)
//		{
//			  //System.out.println(s.charAt(i));
//		      System.out.print(s.charAt(i));
//		
//		}
		String s = "palle tech";
		String rev = " ";
		for(int i = s.length()-1; i>=0; i--) 
		{
			rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);

	}

}
