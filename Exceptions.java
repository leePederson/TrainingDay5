package Day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions{
	

	public static void main(String[] args) {
		
		try {
			int a = 30, b = 0;
			int c = a/b; // dividing by zero
			System.out.println("Result = " + c);
		}
		catch(ArithmeticException e) {//unchecked exception
			System.out.println("Can't divide by zero.");
		}
		try {
			checkException();
		} catch (FileNotFoundException e) {//checked
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private static void checkException() throws FileNotFoundException{
		File file = new File("Filedoesn'texist.txt");
		FileInputStream stream = new FileInputStream(file);
	}
}