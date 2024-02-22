package com.tnsif.interfacedemo;

public class Warrior implements Character,Weapon{

	@Override
	public void use() {
		System.out.println("attack");
		
	}

	@Override
	public void attack() {
		System.out.println("use");
		
	}

}
