package RandomNumbers;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
	public static void main (String[] args) {
		int answer ,guess;
		final int MAX=100;
		Scanner keyboard= new Scanner(System.in);
		Random rand = new Random ();
		
		answer = keyboard.nextInt(MAX) + 1;
		System.out.print("Guess a number btn 1 and 100:");
		guess =keyboard.nextInt();
		if(guess==answer) {
			System.out.println("Good job,the number was"+ answer);
		}
		else {
			System.out.println("Sorry,but the number was "+ answer);
		}
		
		
		
	}

}