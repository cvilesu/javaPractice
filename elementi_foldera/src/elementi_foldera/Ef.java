package elementi_foldera;
import java.io.File;

public class Ef {

	public static void main(String[] args) {
		File folder = new File("d:/vezba_folder");
		String [] elementifoldera = folder.list();
		System.out.println("Elementi foldera "+folder+"su :");
		if(elementifoldera==null) System.out.println("Folder je prazan ili ne postoji");
		else 
			for(int brojac=0;brojac<elementifoldera.length;brojac++) {
				String imeelementa = elementifoldera[brojac];
				System.out.println(imeelementa);
			
		}
		

	}

}
