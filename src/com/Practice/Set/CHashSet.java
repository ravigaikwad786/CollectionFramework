package com.Practice.Set;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;



public class CHashSet {
	
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		set.add("rai");
		set.add("gaikwad");
		set.add("gita");
		set.add("hip");
		set.add("bita");
		set.add("gita");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		if(set.contains("rai")) {
			System.out.println("Set Contain ravi");
		}
		
		set.remove("hip");
		System.out.println("After removing hip");
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Adding Set into arr
		int i=0;
		String arr[]=new String[set.size()];
		for(String ele:set) {
			arr[i++]=ele;
		}
		System.out.println("Printing Array");
		
			System.out.println(arr[4]);
		
	    //Converting Set into Array
			String s2[] = new String[set.size()];
			set.toArray(s2);
			for(String g:s2) {
				System.out.println(g);
			}
	
	}
		
	
		
			
		}

	
	
	

