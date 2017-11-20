package piramida;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pj {

	public static void main(String[] args) throws IOException {
		BufferedReader trougao = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ukucaj broj redova: ");
		int brojredova = Integer.parseInt(trougao.readLine());
		for(int brojac=0;brojac<brojredova;brojac++) {
			int a;
			for(a=1;a<=(brojredova-brojac-1);a++) {
				System.out.print(" ");
			}
			for(int b=0;b<=(brojredova+brojac-a);b++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
