package independentstudy2;
import java.util.Scanner;
public class Randomnum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number (1-9):");
		int guessnum = input.nextInt();
		//The math.random()*10 makes it a single digit number(1-9)
		int realnum = (int)(Math.random()*10);
		if(guessnum == realnum) {
			System.out.print("You Win!!");
		}
		else {
			System.out.println("You were close, you said "+ guessnum +". The real number was "+ realnum);
		}
	}

}
