package bzvza;
import java.util.Scanner;
public class BZVZA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ukucaj broj fibonacci brojeva: ");
		int bfb = input.nextInt();
		int brojac=0;
		int [] fb = new int[bfb];
		int sfb=0;
		fb[0]=0;
		fb[1]=1;
		for(brojac=2;brojac<bfb;brojac++) {
			fb[brojac]=fb[brojac-1]+fb[brojac-2];
		}
		for(brojac=0;brojac<bfb;brojac++) {
			System.out.print(fb[brojac]+", ");
			sfb+=fb[brojac];
		}
		System.out.println("\nSuma fibonacci brojeva je: "+sfb);
	input.close();
	}

}
