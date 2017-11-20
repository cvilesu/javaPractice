package root_listing;
import java.io.File;
public class Rl {

	public static void main(String[] args) {
		System.out.println("Particije su:");
		File[] particije = File.listRoots();
		for(int brojac=0;brojac<particije.length;brojac++) {
			System.out.println(particije[brojac].toString());
		}
		

	}

}
