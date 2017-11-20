package bzvzf;
import java.io.File;
import java.util.Date;
public class BZVZF {

	public static void main(String[] args) {
	File fajl = new File("d:/test.txt");
	long zpm = fajl.lastModified();
	Date datum = new Date(zpm);
	System.out.println(datum);

	}

}
