package bzvzi;
import java.io.File;
public class BZVZI {

	public static void main(String[] args) {
		File fajl1 = new File("d:/novii");
		File fajl2 = new File("d:/novii");
		if(fajl1.compareTo(fajl2)==0) {
			System.out.println("Fajlovi su isti");
		}
		else {
			System.out.println("Fajlovi su razliciti");
		}
	}

}
