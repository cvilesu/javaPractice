import java.util.Scanner;
public class X4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] brojeviunizu= new int[256];
		int brojbrojevaunizu;
		int brojac=0;
		int zbir=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi koliko brojeva zelis u nizu: "); 
		brojbrojevaunizu = input.nextInt();
		
		for (brojac=0;brojac<brojbrojevaunizu;brojac++) { 
			System.out.println(brojac+1+". element niza je: ");
			brojeviunizu[brojac] = input.nextInt();
			}
		System.out.println("\nBrojevi u nizu su: ");
		for (brojac=0;brojac<brojbrojevaunizu;brojac++) {
			System.out.println("broj "+brojeviunizu[brojac]);
			zbir = zbir+brojeviunizu[brojac];
		}
		System.out.println("\nSuma brojeva u nizu je: "+zbir);
	}
}