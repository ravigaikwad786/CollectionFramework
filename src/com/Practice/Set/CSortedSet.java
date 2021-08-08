package com.Practice.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class CSortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<Integer> s=new TreeSet<Integer>();
		s.add(5);
		s.add(4);
		s.add(2);
		s.add(1);
		//System.out.println(s);
		
		Integer[] a= {1,2,3,4,5,67,5,3,2,1,43,45,55};
		
		for(Integer i:a) {
			s.add(i);
		}
		System.out.println(s);
	
		SortedSet<String> s1=new TreeSet<String>();
		s1.add("ravi");
		s1.add("ravi");
		s1.add("ajay");
		System.out.println(s1);
		
	}

}
