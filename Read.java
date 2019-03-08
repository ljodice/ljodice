package independentstud;
import java.io.*;
import java.util.*;

public class Read {
private Scanner x;
public void openFile() {
	try {
		x = new Scanner(new File("worked.txt"));
	}
	catch(Exception e) {
		System.out.println("could not find file");
	}
}
public void readFile() {
	while(x.hasNext()) {
		String lastname = x.next();
		String firstname = x.next();
		String middleinitial = x.next();
		System.out.println("The last name is:"+lastname);
		System.out.println("the first name is: "+firstname);
		System.out.println("the middle initial is: "+middleinitial);
	}}
	
public void closeFile() {
		x.close();
	}
}
