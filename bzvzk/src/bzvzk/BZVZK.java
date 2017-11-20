package bzvzk;
import java.io.File;
public class BZVZK {

	public static void main(String[] args) {
		File[] particije = File.listRoots();
		for(int brojac=0;brojac<particije.length;brojac++) {
			System.out.println(particije[brojac].toString());
		}

	}

}
