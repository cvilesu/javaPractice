import java.io.*;
public class citanjeRedovaClass {

	public static void main(String[] args) {


try {

		BufferedReader in= new BufferedReader(new FileReader("test.txt"));
		String tekst;
		int brojac=1;
		while((tekst=in.readLine())!=null){
			if(brojac>=3 && brojac<=5 ) System.out.println(tekst);
			if(brojac==5) break;	
			brojac++;
			}
	in.close();
	}catch(IOException ioe){ ioe.printStackTrace();
}

	}
}
