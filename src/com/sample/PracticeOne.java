package com.sample;

//import java.util.Arrays;

//import java.util.HashMap;

//import java.util.ArrayList;
//import java.util.HashSet;

//5.import java.util.NavigableSet;
//import java.util.TreeMap;

//import java.util.Iterator;
//2.import java.util.Set;
//import java.util.TreeSet;

public class PracticeOne 
{

	public static void main(String[] args) 
	{
		/* 1.int i = 0;
		int j = 9;
		do {
			i++;
			if(j-- < i++) {
				break;
			}
		}
		while(i<5); 
		{
			System.out.println(i + " " + j);
		}*/ //66
		
		//TreeSet will print in ascending order 
		/* 2.Set values = new TreeSet<>();
		values.add(42);
		values.add(37);
		values.add(51);
		Iterator iterator = values.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(", ");
		}*/    // 37, 42, 51
		
		/* 3.int j = 0;
		do {
			for(int i = 0; i++<1; )
				System.out.print(i);
		}
		while(j++ < 2);*/  // 111
		
		/* 4.int a = 1;
		int b = 12;
		System.out.println(a = b); */ // 12
		
		/* 5.TreeMap <Integer, String> tm = new TreeMap <Integer, String>();
		tm.put(2, "two");
		tm.put(9, "nine");
		tm.put(7, "seven");
		NavigableSet s1 = tm.descendingKeySet();
		System.out.println(s1);*/  //[9,7,2]
		
		/* 6.ArrayList al = new ArrayList();
		al.add("Pasta");
		al.add("Pancakes");
		
		HashSet hs = new HashSet();
		hs.add("Apple pie");
		
		Iterator i = hs.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next() + " ");
			
		}*/ // apple pie
		
		/* 7.double a, b;
		a = 3.0;
		b = 4.0;
		double d = Math.sqrt(a * a + b * b);
		System.out.println(d);*/ //5.0
		
		/* 8.HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(11, "Alpha");
		hm.put(12, "Beta");
		hm.put(13, "Delta");
		hm.put(14, "Gamma");
		hm.put(15, "Magna");
		hm.put(16, "Neon");
		hm.put(17, "Pyro");
		hm.remove(12);
		hm.remove(14, "Gamma");
		hm.remove("Magna");
		System.out.println(hm);*/ //{16=Neon, 17=Pyro, 11=Alpha, 13=Delta, 15=Magna}
	
       /* 9. int a = 1;
        int b = 2;
        int c = 3;
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        System.out.println(a + " " + b + " " + c); */ // 3 1 6
		
		
		/* 10.int[] arr1 = {2,3,4};
		int[] arr2 = {1,2,3};
		System.out.println(Arrays.equals(arr1, arr2));
		int[] arr3 = {2,3,4};
		System.out.println(Arrays.equals(arr1, arr3));*/ // false,true
		
		// print 1 to 100 numbers with out 10
		for(int i = 1;i<=100;i++)
		{
			if(i!=10)
			{
				System.out.println(i);
			}
		}

    }
}
