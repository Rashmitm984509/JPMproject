package com.tns.pratice;

public class hj implements bank{

	@Override
	public void print() {
		System.out.println("r");
		
	}

	@Override
	public void show() {
		System.out.println("d");
		
	}
	public static void main(String[] args) {
		hj h=new hj();
		h.print();
	}
	
}

