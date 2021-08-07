package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet {

	
	
	public CargoPlane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public void cargoLoad () {
		System.out.println("      __|__\n"
				+ "*---o--(_)--o---*\n" + this.getModel() + " has cargo.\n");
	}

}
