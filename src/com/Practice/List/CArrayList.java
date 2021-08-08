package com.Practice.List;

import java.util.ArrayList;

public class CArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("ravee");
		l.add("ravee");
		l.add("bik");
		l.add("jira");
		
		String arr[]=new String[l.size()];
		l.toArray(arr);
		
	    	for(int i=0;i<=arr.length-1;i++) {
	    		System.out.println(arr[i]);
	    	}
		
	
	

	}

}
