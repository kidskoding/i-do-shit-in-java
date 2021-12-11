package stuff;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TJ {
    public static void main(String[] args) {
        int birthMonth = 0;
        int birthYear;
        int skippedGrade;
        int graduationYear = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("What month were you born in. Repond with a single digit. January is 1, February is 2, etc.");
        try {
        	birthMonth = scan.nextInt();
        }
        catch(Exception e) {
        	throw new InputMismatchException("input value must be an integer from 1 to 12 inclusive since there are only 12 months in a year");
        }
        while(birthMonth >= 13 || birthMonth <= 0) {
            System.out.println("Try Again. Make sure you input a birthMonth from 1 to 12 since there are only 12 months in a year");
            birthMonth = scan.nextInt();
        }
        System.out.println("What year were you born in");
        try {
        	birthYear = scan.nextInt();
        }
        catch(InputMismatchException e) {
        	throw new InputMismatchException("input value must be an integer from between the year 2000 and 3000 exclusive");
        }
        while(!(birthYear > 2000 && birthYear < 3000)) {
            System.out.println("Try Again. Be sure you input a year thats in between the year 2000 and 3000 exclusive");
            birthYear = scan.nextInt();
        }
        System.out.println("Did you skip a grade? 1 if you skipped a grade. 0 if you did not skip a grade");
        try {
        	skippedGrade = scan.nextInt();
        }
        catch(InputMismatchException e) {
        	throw new InputMismatchException("value must be an integer either 1 or 0. 1 being if you skipped a grade. 0 if you did not skip a grade");
        }
        while(skippedGrade != 0 && skippedGrade != 1) {
            System.out.println("Try Again. Make sure you input a 0 if you did not skip a grade or a 1 if you did skip a grade");
            birthMonth = scan.nextInt();
        }
        if(skippedGrade == 1) {
            graduationYear = birthYear + 17;
            System.out.println("Your high school graduation year is" 
            + " " + graduationYear);
        }
        else if(skippedGrade == 0){
            graduationYear = birthYear + 18;
            System.out.println("Your high school graduation year is" 
            + " " + graduationYear);
        }
        if(birthMonth >= 9 && birthMonth <= 12) {
            graduationYear = birthYear + 19;
            System.out.println("Your high school graduation year is" 
            + " " + graduationYear);
        }
    }
}
