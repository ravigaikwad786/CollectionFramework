package com.Practice.List;

import java.util.Stack;

public class CStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<String>();
		s.push("ravi");
		s.push("hi");
		s.push("ravi");
		s.push("hi");
		s.push("ravi");
		s.push("hi");
		s.push("JIra");
		s.push("jira");
		s.push("jira");
		s.push("jira");
		s.pop();
		System.out.println(s);
	}

}
