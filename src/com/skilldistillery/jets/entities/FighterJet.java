package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements Dogfight{

	public FighterJet() {
		// TODO Auto-generated constructor stub
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	
	public void fight() {
		System.out.println("      __|__\n"
				+ "*---o--(_)--o---*\n" + getModel() + " is under attack!");
	}

}
