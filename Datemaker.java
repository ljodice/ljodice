package independentstud;
import java.util.Scanner;
public class Datemaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
int[] dayofmonth = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
String[] month = {"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
System.out.println("what is the year?");
int year = input.nextInt();
System.out.println("what is the month?(1-12)");
int monthin = input.nextInt();
System.out.println("what is the day?");
int day = input.nextInt();
System.out.println(month[monthin-1]+" "+ dayofmonth[day-1]+","+year);


input.close();

	}

}
