package stuff;
import java.util.Scanner;
import java.util.InputMismatchException;
public class paige {
	public static void main(String[] args) {
		int birthYear, birthMonth;
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("What month were you born in?");
			birthMonth = s.nextInt();
		}
		catch(InputMismatchException e) {
			throw new InputMismatchException("value must be an integer");
		}
		while(birthMonth >= 13 || birthMonth <= 0) {
			System.out.println("Try Again. Make sure you input a birthMonth from 1 to 12 since there are only 12 months in a year");
		}
		System.out.println("What year were you born in");
		birthYear = s.nextInt();
		while(!(birthYear > 2000 && birthYear < 10000)) {
			System.out.println("Try Again. Be sure you input a year thats in between the year 2000 and 10000");
			birthYear = s.nextInt();
		}
		if(birthMonth >= 9 && birthMonth <= 12) {
			int graduationYear = birthYear + 19;
			System.out.println("Your high school graduation year is" 
			+ " " + graduationYear);
		}
		else {
			int graduationYear = birthYear + 18;
			System.out.println("Your high school graduation year is" 
			+ " " + graduationYear);
		}
	}
}
