package bzvzj;
import java.io.File;
public class BZVZJ {

	public static void main(String[] args) {
		File folder = new File("d:/vezba_folder");
		String[] folderelementi = folder.list();
		for(int brojac=0;brojac<folderelementi.length;brojac++) {
			//String imeelementa= folderelementi[brojac];
			System.out.println(folderelementi[brojac].toString());
		}

	}

}
