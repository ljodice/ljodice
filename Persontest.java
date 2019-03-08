package independentstud;

import java.util.Scanner;

public class Persontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first name?");
		String first = input.nextLine();
		System.out.println("What is the last name?");
		String last = input.nextLine();	
		System.out.println("what is your age?");
		int inputage = input.nextInt();
		person.getName(first,last);
		person.getBirthyear(inputage);
		input.close();
	}

}
