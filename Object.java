package independentstud;
import java.util.Scanner;
public class Object {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first name?");
		String first = input.nextLine();
		System.out.println("What is the last name?");
		String last = input.nextLine();	
		System.out.println("what is your age?");
		int inputage = input.nextInt();
		Object.getName(first,last);
		Object.getBirthyear(inputage);
		input.close();
		}
	
	
	Object(){
		}
	public double getSquare(double x1) {
		System.out.println(x1+" Squared is "+ (x1*x1));
		return x1*x1;
	}
	public static double getSlope(double x2, double x1, double y1, double y2) {
		double x=x2-x1;
		double y=y2-y1;
		System.out.print(y/x);
		return y/x;
	}
	public static String getName(String firstnam, String lastnam) {
		System.out.println("Name:"+lastnam+","+firstnam);
		return firstnam;
	}
	public static int getBirthyear(int age) {
		int birthyear = 2119 - age;
		System.out.println("(close to)Year born:"+ birthyear);
		System.out.println("Age:"+ age);
		return birthyear;
	}
}
