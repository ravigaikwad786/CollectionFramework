package com.Practice.List;

import java.util.Vector;

public class CVectore {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v= new Vector<String>();
		v.add("ravi");
		System.out.println(v);
		Object copyv=v.clone();
		System.out.println(copyv);
		
		
	}

}
