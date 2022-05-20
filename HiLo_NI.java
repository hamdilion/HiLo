//Written by Naail Iqbal 12/29/2021
import java.util.Scanner;
import java.util.Random;

public class HiLo_NI {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		int num = 6;

		System.out.print("I'm thinking of an integer between 1 and 100 (inclusive) ...");
		System.out.print("\n\n");

		int randInt = r.nextInt(100) + 1;
		int count = 0;

		while (true) {
			System.out.print("Your guess? ");
			int guess = scan.nextInt();
			count ++;
			if (guess < randInt) {
				System.out.print("Too low! ");
			} else if (guess > randInt) {
				System.out.print("Too high! ");
			} else {
				System.out.print("You got it! My number was " + randInt + ". It took you " + count + " guesses.");
			break;
			}
		}
		System.out.print("poop");
		String poop = scan.next();
	}
}