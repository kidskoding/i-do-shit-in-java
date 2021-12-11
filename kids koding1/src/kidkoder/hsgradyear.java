package kidkoder;
import java.util.Scanner;
import java.util.InputMismatchException;
public class hsgradyear {
	public static void main(String[] args) {
		int birthYear, birthMonth, skippedGrade;
		int gradYear = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("What month were you born. Respond with a single digit. 1 for January, 2 for Febuary, etc.");
		try {
			birthMonth = s.nextInt();
		}
		catch(InputMismatchException e) {
			throw new InputMismatchException("your response to your birth month should be an integer that is between 1 to 12 inclusive since there are 12 months in a year");
		}
		while(birthMonth >= 13 || birthMonth == 0) {
			System.out.println("Try again, Make sure you input a birth month from 1 to 12 inclusive since there are 12 months in a year");
			birthMonth = s.nextInt();
		}
		System.out.println("What year were you born");
		try {
			birthYear = s.nextInt();
		}
		catch(InputMismatchException e) {
			throw new InputMismatchException("your response should be a integer that is 2000 to 3000 exclusive");
		}
		while(!(birthYear > 2000 && birthYear < 3000)) {
			System.out.println("Try Again. Be sure to respond to your birthyear with an integer that is between 2000 and 3000 exclusive");
			birthYear = s.nextInt();
		}
		System.out.println("Did you skip a grade. 1 for yes you skipped a grade or 0 for you did not skip a grade");
		try {
			skippedGrade = s.nextInt();
		}
		catch(InputMismatchException e) {
			throw new InputMismatchException("your response should be an integer that is either 0 if you skipped a grade or 1 if you did not skip a grade.");
		}
		while(skippedGrade != 0 && skippedGrade != 1) {
			System.out.println("Try again. Make sure you input a 0 if you did not skip a grade or a 1 if you did skip a grade.");
			skippedGrade = s.nextInt();
		}
		if(skippedGrade == 1) {
			gradYear = birthYear + 17;
			System.out.println("You will graduate high school in:" + " " + gradYear);
		}
		else if(skippedGrade == 0) {
			gradYear = birthYear + 18;
			System.out.println("You will graduate high school in:" + " " + gradYear);
		}
		if(birthMonth >= 9 && birthMonth <= 12) {
			gradYear = birthYear + 19;
			System.out.println("You will graduate high school in:" + " " + gradYear);
		}
	}
}
