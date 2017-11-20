package vezba_kreiranje_fajla;
import java.io.File;
import java.io.IOException;
public class Vcf {

	public static void main(String[] args) {
	try{
		File datoteka = new File("d:/nova_datoteka.txt");
		if(datoteka.createNewFile()) {
			System.out.println("Datoteka uspesno kreirana !");
			} else {
			System.out.println("datoteka je vec prisutna");
			}
		}

	catch (Exception e) {
		e.printStackTrace();
	}
	}

}
