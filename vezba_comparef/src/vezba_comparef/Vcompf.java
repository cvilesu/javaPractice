package vezba_comparef;

import java.io.File;

public class Vcompf {

	public static void main(String[] args) {
		File datoteka1 = new File("d:/nova_datoteka1.txt");
		File datoteka2 = new File("d:/nova_datoteka1.txt");
		if(datoteka1.compareTo(datoteka2)==0) System.out.println("Adresa je ista");
		else System.out.println("Adresa je razlicita");

	}

}
