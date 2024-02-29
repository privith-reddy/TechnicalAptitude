package com.domain;

public class BubbleSortingArray 
{

	public static void main(String[] args) 
	{
		int[] arr = {10,8,-9,11,12};
		int len = arr.length;
		for(int i=0;i<len-1;i++) 
		{
			for(int j=0;j<len-1-i;j++)
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;	
				}
			}
		}
		for(int i1= 0;i1<len;i1++) 
		{
			System.out.print(arr[i1]+" ");
		}
	}

}
