package com.tnsif.setdemo;

import java.util.TreeSet;

public class Treesetdemo {
public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet<Integer> ();
	t.add(3);
	t.add(8);
	t.add(8);
	t.add(2);
	t.add(0);
	System.out.println(t);
}
}
