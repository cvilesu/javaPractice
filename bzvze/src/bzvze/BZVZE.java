package bzvze;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BZVZE {

	public static void main(String[] args) {
		try {
		BufferedReader input = new BufferedReader(new FileReader("d:/test.txt"));
		String content;
		int brojac=1;
		while((content=input.readLine())!=null) {
			if(brojac>=3 && brojac<=8) System.out.println(content);
			if(brojac==8) break;
			brojac++;
		}
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
