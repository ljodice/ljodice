package independentstudy2;
import java.util.Scanner;
public class Realworldappofinput {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		//initialized strings
		String name;
		int age;
	    String sex;
	    //UI aspect
		System.out.println("what is your name?");
		System.out.println("how old are you?");
		System.out.println("what is your gender?");
		//picks up what the info is
		name=input.nextLine();
		age=input.nextInt();
		sex=input.nextLine();
		//print out the info
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Sex:"+sex);

	}
}
