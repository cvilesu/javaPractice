import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class X7 {
	public static void main(String[] args) throws Exception {
		BufferedReader tastatura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ukucaj broj redova: "); 
		int brojredova=Integer.parseInt(tastatura.readLine());
		System.out.println("ukucaj korak: ");
		int korak=Integer.parseInt(tastatura.readLine());
		int baznibroj=0;
		System.out.println("Rezultat je:");
		for (int brojacredova=0;brojacredova<=brojredova;brojacredova++) {
			for (int brojackolona=1;brojackolona<=brojacredova;brojackolona++) {				
				System.out.print(baznibroj + ",\t");
				baznibroj=baznibroj+korak;
			}
			System.out.print("\n");
		}
		
		
	}

}
