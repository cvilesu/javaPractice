package vezba_piramida2;
import java.util.Scanner;

public class VP2 {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("Ukucaj broj redova: ");
		int brojredova = input.nextInt();
		System.out.println("Ukucaj korak: ");
		int korak = input.nextInt();
		System.out.println("Ukucaj pocetni broj: ");
		int broj = input.nextInt();
		for(int brojac=0;brojac<brojredova;brojac++) {
			int a;
			for(a=1;a<=(brojredova-brojac-1);a++) {
				System.out.print(" ");
			}
			for(int b=0;b<=(brojredova+brojac-a);b++) {
				broj+=korak;
				System.out.print(broj+",");
			}
			System.out.print("\n");
		}

	}

}
