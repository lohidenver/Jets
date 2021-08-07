package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {//Begin AirField
	
	private List <Jet> jets = new ArrayList<>();
	
	public AirField () {
		initialAirField();
		System.out.println(jets.size());
	};
	
	public List<Jet> getJets() {
		
		return jets;//
	};//end getJets
	
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
	};//end initialAirField
	
	public void flyAll() {
		for (Jet jet : jets) {
			jet.fly();
		}
	};//end flyAll
	
	public Jet fastestJet() {
		Jet fastestJet = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getSpeed()>fastestJet.getSpeed()) {
				fastestJet = jet;
			}
		}
		
		return fastestJet;
	};//end fastestJet
	
	public Jet longestRange () {
		Jet longestRange = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getRange()>longestRange.getRange()) {
				longestRange = jet;
			}
		}
		return longestRange;
	};//end longestRange
	
	public void allCargo() {
		
	};//end allCargo
	
	public void dogFight () {
		
	};//end dogFight
	
	public void addJet () {
		
	};//end addJet
	
	public void removeJet () {
		
	};//end removeJet
	
	public void listJets () {
		System.out.println(jets.size());
		for (Jet jet : jets) {
			System.out.println(jet);
		}
	}
}//End AirField

