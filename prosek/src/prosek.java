import java.util.Scanner;
public class prosek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] brojeviunizu = new int[512];
		double brojbrojevaunizu;
		int brojac=0;
		int zbir=0;
		System.out.println("\nUnesite koliko brojeva zelite da bude u nizu: ");
		brojbrojevaunizu = input.nextInt();
		System.out.print("\n");
		for(brojac=0;brojac<brojbrojevaunizu;brojac++) {
			System.out.println(+(brojac+1)+". element niza je: ");
			brojeviunizu[brojac] = input.nextInt();
		}
		System.out.println("\nElementi niza su: \n"); 
		for(brojac=0;brojac<brojbrojevaunizu;brojac++) 
		{
		System.out.println((brojac+1)+". broj u nizu je: " +brojeviunizu[brojac]);
		zbir=zbir+brojeviunizu[brojac];
		}
		System.out.println("Ukupan zbir clanova niza je: "+zbir);
		System.out.println("Prosek clanova niza je: "+(zbir/brojbrojevaunizu));
		input.close(); 
	}

}
