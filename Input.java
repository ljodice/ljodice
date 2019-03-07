package independentstudy2;
//Importing Scanner
import java.util.Scanner;
public class Input {
//Main method
//in almost every java statement
public static void main(String[] args) {
//initializing variables
double area;
Scanner input = new Scanner(System.in);
double radius = input.nextDouble();
area = radius * radius * 3.14159;
//printing statements
System.out.println("What is the radius?");
System.out.print(area);
}
}