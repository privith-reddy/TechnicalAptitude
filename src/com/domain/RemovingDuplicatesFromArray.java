package com.domain;

public class RemovingDuplicatesFromArray 
{

	public static void main(String[] args)
	{
		int[] arr = {10,8,10,8,12};
		int len = arr.length;
		
		for(int i=0; i<len-1;i++)
		{
			for(int j=i+1; j<=len-1;j++)
			{
				if(arr[i] == arr[j] && arr[i]!= -1) 
				{
					arr[j] = -1;
				}
				
			}
			
		}
		for(int i=0; i<len;i++) 
		{
			if(arr[i]!= -1) 
			{
				System.out.println(arr[i]);
			}
		}

	}

}
