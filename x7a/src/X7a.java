import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class X7a {
	public static void main(String[] args) throws Exception {
		BufferedReader tastatura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ukucaj broj redova: "); 
		int brojredova=Integer.parseInt(tastatura.readLine());





		System.out.println("Rezultat je:");
		for (int brojacredova=0;brojacredova<brojredova;brojacredova++) {
			for (int brojackolona=0;brojackolona<(brojacredova+1);brojackolona++) {				
				System.out.print("*" +"\t");

			}
			System.out.print("\n");
		}
		
		
	}

}