package com.skilldistillary.jets.app;

import java.util.Scanner;



import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {//Beginning Class
	Scanner uI = new Scanner(System.in);
	
	
	public static void main(String[] args) {//Beginning Main
		AirField airField = new AirField();
		JetsApplication run = new JetsApplication();
		run.launchJets();
		
	}//End Main

	private void launchJets() {//Beginning launchJets
		
		
		while (true) {
		System.out.println("                                 /\\\n"
				+ "1. List fleet                   |  |            J\n"
				+ "2. Fly all jets                 |  |            E\n"
				+ "3. View fastest jet            .'  '.           T\n"
				+ "4. View jet with longest range |    |           S\n"
				+ "5. Load all Cargo Jets         |    |\n"
				+ "6. Dogfight!                   | /\\ |           A\n"
				+ "7. Add a jet to Fleet        .' |__|'.          P\n"
				+ "8. Remove a jet from Fleet   |  |  |  |         P\n"
				+ "9. Quit                     .'  |  |  '.\n"
				+ "                       /\\   |   \\__/   |   /\\\n"
				+ "                      |  |  |   |  |   |  |  |\n"
				+ "                  /|  |  |,-\\   |  |   /-,|  |  |\\\n"
				+ "                  ||  |,-'   |  |  |  |   '-,|  ||\n"
				+ "                  ||-'       |  |  |  |       '-||\n"
				+ "       |\\     _,-'           |  |  |  |           '-,_     /|\n"
				+ "       ||  ,-'   _           |  |  |  |           _   '-,  ||\n"
				+ "       ||-'   SD30           |  |  |  |           SD30   '-||\n"
				+ "       ||                    |  \\  /  |                    ||\n"
				+ "       |\\________....--------\\   ||   /--------....________/|\n"
				+ "                             /|  ||  |\\\n"
				+ "                            / |  ||  | \\\n"
				+ "                           /  |  \\/  |  \\\n"
				+ "     Please Enter The     /   |      |   \\   \n"
				+ "     Number of Your      //   .|      |.   \\\\\n"
				+ "     Choice.           .' |_./ |      | \\._| '.\n"
				+ "                     /     _.-|||  |||-._     \\\n"
				+ "                     \\__.-'   \\||/\\||/   '-.__/ ");
		
		Scanner scanner = new Scanner(System.in);
		String uInput = scanner.nextLine();
		
		if(uInput.equals("1")) {
			System.out.println("Here are your current jets!");
		} else if ((uInput.equals("2"))) {
			System.out.println("Fly All Jets");
			//airField.flyAll();
		} else if ((uInput.equals("3"))) {
			System.out.println("View fastest jet ");
			//airField.fastestJet();
		} else if ((uInput.equals("4"))) {
			System.out.println("View jet with longest range");
			//airField.longestRange();
		} else if ((uInput.equals("5"))) {
			System.out.println("Load all Cargo Jets ");
			//airField.allCargo();
		} else if ((uInput.equals("6"))) {
			System.out.println("Dogfight!");
			//airField.dogFight();
		} else if ((uInput.equals("7"))) {
			System.out.println("Add a jet to Fleet");
			//airField.addJet
		} else if ((uInput.equals("8"))) {
			System.out.println("Remove a jet from Fleet");
			//airField.removeJet
		} else if ((uInput.equals("9"))) {
			System.out.println("You have chosen to exit.");
			System.exit(0);
		} 
	
		}//end while loop
		}//end launchJets
	
}//End Class
