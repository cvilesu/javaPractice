import java.io.File;
public class Vrf {

	public static void main(String[] args) {
		File datoteka1 = new File("d:/nova_datoteka.txt");
		File datoteka2 = new File("d:/nova_datoteka1.txt");
		if(datoteka1.renameTo(datoteka2)) System.out.println("Datoteka uspesno preimenovana");
		else System.out.println("Ta je datoteka vec prisutna");

	}

}
