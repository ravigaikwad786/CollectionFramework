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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Scanner s=new Scanner(System.in);
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		System.out.println("Enter Size If Link List");
		int i=s.nextInt();
		for(int j=0;j<=i;j++) {
		l.add(br.readLine());
		}
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
