import java.io.File;
import java.util.Date;
public class Vlm {

	public static void main(String[] args) {
		System.out.println("Fajl je poslednji put modifikovan:");
		File datoteka = new File("d:/nova_datoteka.txt");
		long poslednjamodifikacija = datoteka.lastModified();
		Date datum = new Date(poslednjamodifikacija);
		System.out.println(datum);
	}

}
