package vezba_input_output;
import java.io.*;


public class Vio {

	public static void main(String[] args)  throws IOException {
		FileInputStream from = null;
		FileOutputStream to = null;
		
	try {
		from = new FileInputStream("d:/teskst1.txt");
		to = new FileOutputStream("d:/teskst2.txt");
		int karakter;
		int brojac=1;
		while((karakter=from.read())!=-1) {
			if(brojac>=4 && brojac<=7) to.write(karakter);
			if(brojac==7) break;
			brojac++;
		}
		}
	
	finally {
		if(from!=null) from.close();
		if(to!=null) to.close();
		}
	}

}
