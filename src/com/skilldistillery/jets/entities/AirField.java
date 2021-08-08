package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {//Begin AirField
	
	private List <Jet> jets = new ArrayList<>();
	
	public AirField () {
		initialAirField();
		System.out.println(jets.size());
	}
	
	public List<Jet> getJets() {
		
		return jets;//
	}//end getJets
	
	public void initialAirField () {
		File fileJets = new File("Jets.txt");

		try {
			FileReader fileReader = new FileReader(fileJets);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] planes = line.split(", ");
				String type = planes[0];
				String model = planes[1];
				double speed = Double.parseDouble(planes[2]);
				int range = Integer.parseInt(planes[3]);
				long price = Long.parseLong(planes[4]);

				if (type.equals("fighter")) {
					jets.add(new FighterJet(model, speed, range, price));
				} else if (type.equals("cargo")) {
					jets.add(new CargoPlane(model, speed, range, price));
				} else {
					jets.add(new PassengerJet(model, speed, range, price));
				}

			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.err.println("Invalid filename: " + e.getMessage());

		} catch (IOException e) {
			System.err.println("Problem while reading " + fileJets + ": " + e.getMessage());

		}
		
		//
	}//end initialAirField
	
	public void flyAll() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}//end flyAll
	
	public Jet fastestJet() {
		Jet fastestJet = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getSpeed()>fastestJet.getSpeed()) {
				fastestJet = jet;
			}
		}
		System.out.println(fastestJet);
		return fastestJet;
	}//end fastestJet
	
	public Jet longestRange () {
		Jet longestRange = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getRange()>longestRange.getRange()) {
				longestRange = jet;
			}
		}
		System.out.println(longestRange);
		return longestRange;
	}//end longestRange
	
	public void allCargo() {
		for (Jet jet : jets) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).cargoLoad();
			}
		}

		
	}//end allCargo
	
	public void dogFight () {
		for (Jet jet : jets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
			}
		}
	}//end dogFight
	
	public void addJet () {
		String type;
		String model;
		double speed;
		int range;
		long price;
		
		Scanner uI = new Scanner(System.in);
		
		//uI.nextLine();
		
		System.out.println("What kind of jet do you have? Cargo, Fighter, Passenger  ");
		type = uI.nextLine();
		System.out.println("What model of jet do you have?  ");
		model= uI.nextLine();
		System.out.println("What is the speed of the jet?  ");
		speed = uI.nextDouble();
		System.out.println("What is the range of you jet?  ");
		range = uI.nextInt();
		System.out.println("What is the price(USD) of your jet?  ");
		price = uI.nextLong();
		
		Jet userJet = null;
		
	
		if (type.equalsIgnoreCase("cargo")) {
			userJet = new CargoPlane(model, speed, range, price);
		} else if (type.equalsIgnoreCase("fighter")) {
			userJet = new FighterJet(model, speed, range, price);
		} else {
			userJet = new PassengerJet(model, speed, range, price);
		}
		
		jets.add(userJet);
		
		System.out.println("Added " + userJet.getModel() + " to the fleet.");
		
		
		
	}//end addJet
	
	public void removeJet () {
		Scanner uI = new Scanner(System.in);
		//uI.hasNextLine();
		int i = 1;
		int removeJet;
		
		for (Jet jet : jets) {
			System.out.println(i++ + " => " + jet);
		}
		System.out.println("What plane do you want to remove? ");
		removeJet = uI.nextInt();
		removeJet = removeJet  -1;
		jets.remove(removeJet);
		
	}//end removeJet
	
	public void listJets () {
		System.out.println(jets.size());
		for (Jet jet : jets) {
			System.out.println(jet);
		}
	}
}//End AirField

