package com.Practice.List;

import java.util.Iterator;
import java.util.LinkedList;

public class ClinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("ravi");
		l.add("hit");
		l.addFirst("mr");
		l.addLast("bye");
		l.add(2, "hype");
		l.add("buo");
		l.add("ravi");
		
		System.out.println(l);
		l.remove("bye");
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		String s;
		s=l.toString();
		System.out.println(s);
		StringBuilder b=new StringBuilder();
		StringBuilder r=b.reverse();
		r.append(s);
		System.out.println(r);
		
//		Iterator<String> itr=l.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next());
//		}

	}

}
