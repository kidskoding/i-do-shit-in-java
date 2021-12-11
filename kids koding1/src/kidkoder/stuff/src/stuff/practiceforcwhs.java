package stuff;
//Julie wants to sum all the numbers from one to 1000. Write a program that does so iteratively and recursively
public class practiceforcwhs extends cwhs {
	public static void main(String[] args) {
		System.out.println(juliesRecursiveMethod(1000));
		System.out.println(juliesIterativeMethod(1000));
	}
	private static int juliesRecursiveMethod(int n) {
		if(n > 0) {
			return n + juliesRecursiveMethod(n - 1);
		}
		else {
			return 0;
		}
	}
}
class cwhs {
	public static int juliesIterativeMethod(int n) {
		for(int i = 0; i <= 1000; i++) {
			n = i * (i + 1) / 2; /*a shortcut to do it iteratively is to know a special formula. 
			You can multiply the number by the number plus 1 and divide by 2*/
		}
		return n;
	}
}