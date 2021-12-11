package stuff;
import java.util.Scanner;
public class rylee {
	public static void main(String[] args) {
		int birthYear;
		Scanner s = new Scanner(System.in);
		System.out.println("What year were you born in");
		birthYear = s.nextInt();
		while(!(birthYear > 2000 && birthYear < 10000)) {
			System.out.println("Try Again. Be sure you input a year thats in between the year 2000 and 10000");
			birthYear = s.nextInt();
		}
		int graduationYear = birthYear + 18;
		System.out.println("Your high school graduation year is" 
        + " " + graduationYear);
	}
}
