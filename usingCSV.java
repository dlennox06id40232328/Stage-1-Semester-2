package part03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class usingCSV {

	public static void main(String[] args) {
		
		String myDir = "D:/JavaCode/Semester2/week_7_NewAttempt/employment-nics.csv";
	
		try {
			
			File myFile = new File(myDir);
			Scanner myScan = new Scanner(myFile);
			
			// Remove header
			myScan.nextLine();
			
			double noOfMale = 0;
			double noOfFemale = 0;
			
			while(myScan.hasNextLine()) {
				String myStr = myScan.nextLine();
				String[] parts = myStr.split(",");
				noOfMale += Integer.parseInt(parts[1].trim());
				noOfFemale += Integer.parseInt(parts[2].trim());
			}
			
			myScan.close();
			System.out.printf("Males: %.1f\n", (noOfMale / (noOfMale + noOfFemale))*100);
			System.out.printf("Females: %.1f\n", (noOfFemale / (noOfMale + noOfFemale))*100);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
