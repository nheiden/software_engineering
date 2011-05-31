package softwareEngineering;

import java.io.File;
import java.util.Scanner;

public class Core {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File inputFile;
		String inputFileName;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the NHEIDEN and JFISCHER Line of Code Counter\n");
		System.out.print("Enter a File for Input: ");
		inputFileName = input.next();
		inputFile = new File(inputFileName);
		
		if(inputFile.exists()){
			System.out.println("Location Exists...");
			
			if(inputFile.isFile()){
				System.out.println("Location is a File");
				
				if(inputFile.canRead()){
					System.out.println("File is readable");
				}
				else{
					System.out.print("File is Not Readable, Press Enter to Exit");
					input.next();
					System.exit(-1);
				}
				
			}
			else{
				System.out.print("Location is not a File, Press Enter to Exit");
				input.next();
				System.exit(-1);
			}
			
		}
		else{
			System.out.print("Location Does not Exist, Press Enter to Exit");
			input.next();
			System.exit(-1);
		}
		
	}

}
