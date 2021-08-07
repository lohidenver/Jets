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
		int uInput = 0;
		do {
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
				+ "                          /   |      |   \\   \n"
				+ "                        //   .|      |.   \\\\\n"
				+ "                      .' |_./ |      | \\._| '.\n"
				+ "                     /     _.-|||  |||-._     \\\n"
				+ "                     \\__.-'   \\||/\\||/   '-.__/ ");
		uInput = uI.nextInt();
		if(uInput == 1) {
			System.out.println("Here are your current jets!");
		} else if (uInput == 2) {
			System.out.println("Fly All Jets");
		} else if (uInput == 3) {
			System.out.println("View fastest jet ");
		} else if (uInput == 4) {
			System.out.println("View jet with longest range");
		} else if (uInput == 5) {
			System.out.println("Load all Cargo Jets ");
		} else if (uInput == 6) {
			System.out.println("Dogfight!");
		} else if (uInput == 7) {
			System.out.println("Add a jet to Fleet");
		} else if (uInput == 8) {
			System.out.println("Remove a jet from Fleet");
		} else if (uInput == 9) {
			System.out.println("You have chosen to exit.");
			System.exit(0);
		} 
		}//end Do loop
		while (uInput != 9);
		}//end launchJets
		
}//End Class
