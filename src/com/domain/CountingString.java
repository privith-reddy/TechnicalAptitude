package com.domain;

public class CountingString {

	public static void main(String[] args) 
	{
		String s = "palle technologies java j2ee training";
		int count = 1;
		// let us remove starting and ending spaces
		//s = s.trim();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)== ' ' && s.charAt(i-1)!= ' ')
			{
				count++;
			}
		}
		System.out.println("total words are " + count);
		
//		String[] arr = s.split(" "); 
//		System.out.println("total words are " +arr.length);


	}

}
