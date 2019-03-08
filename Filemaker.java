package independentstud;

public class Filemaker {
	public static void main(String[] args) {
		Createfile f= new Createfile();
		f.openFile();
		f.addRecords();
		f.closeFile();
		
	}
}
