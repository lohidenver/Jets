package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	public PassengerJet() {
		// TODO Auto-generated constructor stub
	}

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	
	public void passFly() {
		System.out.println("Passenger jet is flying" );
	}

}
