package independentstud;
import java.io.*;
import java.lang.*;
import java.util.*;
public class Createfile {

private Formatter x;

public void openFile() {
	try {
		x = new Formatter("worked.txt");
	}
	catch(Exception e){
		System.out.println("An Error Has Occurerd");
	}
}
public void addRecords() {
	x.format("%s%s%s", "Jodice ", "Luke ", "J ");
}
public void closeFile() {
	x.close();
}
}
