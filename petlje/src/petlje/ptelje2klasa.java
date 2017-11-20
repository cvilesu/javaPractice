package petlje;
import java.util.Scanner;

public class ptelje2klasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nFor petlja\n");
		System.out.println("\nOd kojeg broja zelite ispisati brojeve?");
		Scanner in = new Scanner(System.in);
	    int num=0;
	    int brojac;
		brojac = in.nextInt();
		System.out.println("\nDo kojeg broja zelite ispisati brojeve?");
		num= in.nextInt();
		int zbir=0;
		System.out.println("\n");
		for(brojac=brojac;brojac<=num;brojac++){
			System.out.println(+brojac);
			zbir=zbir+brojac;
		}
		System.out.println("\nI njihov zbir je> "+zbir);
	}

}
