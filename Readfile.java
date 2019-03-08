package independentstud;

public class Readfile {

	public static void main(String[] args) {
	
		Read r = new Read();
		r.openFile();
		r.readFile();
		r.closeFile();
	}

}
