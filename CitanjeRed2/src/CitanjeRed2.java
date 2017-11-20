import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CitanjeRed2 {

	public static void main(String[] args) {
try {
		BufferedReader in= new BufferedReader(new FileReader("test.txt"));
		String tekst;
		while((tekst=in.readLine())!=null){
			System.out.println(tekst);
				}
		in.close();
	}catch(IOException ioe){
		ioe.printStackTrace();
}
	}
	
}
