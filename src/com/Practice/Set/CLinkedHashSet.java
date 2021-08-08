package com.Practice.Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CLinkedHashSet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		Scanner s=new Scanner(System.in);
		//LinkedHashSet<String> l=new LinkedHashSet<String>();
		//System.out.println("Enter Size If Link List");
//		int i=s.nextInt();
//		for(int j=0;j<=i;j++) {
//		l.add(br.readLine());
//		}
//		Iterator<String> itr=l.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		l.add("ravi");
//		l.add("ravi");
//		l.add(null);
//		l.add(null);
//		System.out.println(l);
//		
		String s="ravi";
		System.out.println(linkedSet(s));
		
		
	}

	private static LinkedHashSet<String> linkedSet(String s) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> g =new LinkedHashSet<String>();
		g.add(s);
		return g;
	}

}
