package bzvzh;
import java.io.File;
public class BZVZH {

	public static void main(String[] args) {
	File stari_fajl = new File("d:/novi.txt");
	File novi_fajl = new File("d:/novii.txt");
	if(stari_fajl.renameTo(novi_fajl)) {
		System.out.println("Fajl uspesno preimenovan");
	}
	else {
		System.out.println("Fajl vec postoji");
	}
	}

}
