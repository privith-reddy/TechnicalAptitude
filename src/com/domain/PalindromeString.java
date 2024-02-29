package com.domain;

public class PalindromeString
{

	public static void main(String[] args) 
	{
		String name = "liril";
		String rev = "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev = rev + name.charAt(i);	
		}
		System.out.println(rev);
		if(rev.equals(name))
		{
			System.out.println(name + " is a palindrome String");
		}
		else 
		{
			System.out.println(name + " is not a palindrome String");
		}
	}
}
