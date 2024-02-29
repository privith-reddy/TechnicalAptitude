package com.domain;

public class RightAnglePattern 
{
	public static void main(String[] args) 
	{
		int x = 1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i;j++) 
			{
				System.out.print(x);
				x++;
				//System.out.print("*");
				//System.out.print(i);
				//System.out.print(j);
			}
			System.out.println();
		}
		
		
		/*char[] s = {'a','b','c','d'};
		
		for(int i=0; i<=s.length-1; i++)
		{
			for(int j=0; j<=i;j++) 
			{
				//System.out.print(s[i]);
				System.out.print(s[j]);
				
			}
			System.out.println();
		}*/
		
       /* char[] s = {'p','a','l','l','e'};
		
		for(int i=0; i<=s.length-1; i++)
		{
			for(int j=0; j<=i;j++) 
			{
				//System.out.print(s[i]);
				System.out.print(s[j]);
				
			}
			System.out.println();
		}*/
		
        char s = 'a';
    
      
		for(int i=1; i<=4; i++)
		{
			
			for(int j=1; j<=i ;j++) 
			{
				
				System.out.print(s + " ");
				s++;
			    
			}
			System.out.println();
		}
		
		int[] c = {1,2,4,7,11,16,22,29,37};
		for(int i =1;i<=c.length-1;i++)
		{
			
			for(int j=0;j<i;j++)
			{
				System.out.print(c[j] + " ");
				
			}
			System.out.println();
		}
		
	}



}
