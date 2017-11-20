import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Vrl {

	public static void main(String[] args) {
		
	try {
		BufferedReader tekst = new BufferedReader(new FileReader("d:/test.txt"));
		String redovi;
		int brojac=1;
		while((redovi=tekst.readLine())!=null) {
			if(brojac>=5 && brojac<=8) System.out.println(redovi);
			if(brojac==8) break;
			brojac++;
		}
	}

	catch (Exception e) {
		
	}
	}

}
