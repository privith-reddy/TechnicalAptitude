package com.domain;

public class SearchingElement 
{
	public static void main (String[] args)
    {
	 int[] arr = {10, 8, 9, 11, 12};
	 int element = 12;
	 int pos = -1;
	 for(int i= 0;i< arr.length;i++) 
	 {
		 if(arr[i] == element) 
		 {
			 pos = i;
			 break;
		 }
	 }
	 if(pos == -1) 
	 {
		 System.out.println(element + " not found ");	
	 }
	 else 
	 {
		 System.out.println(element + " found at position " + pos);
	 }
    }

}
