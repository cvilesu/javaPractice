package bzvz;

public class BZVZ {

	public static void main(String[] args) {
		System.out.println("brojevi po WHILE petlji su: ");
		int brojac=0;
		int zbir_clanova_niza=0;
		int [] clan_niza= {1,3,5,7,9,11,13,15,17,19};
		while(brojac<6) {
			System.out.print(clan_niza[brojac]+ ", ");
			zbir_clanova_niza+=clan_niza[brojac];
			brojac++;	
		}
		System.out.println("\nSuma clanova niza je: "+(zbir_clanova_niza));
		System.out.println("\nbrojevi po DO WHILE petlji su:");
	int brojac1=3;
	do {
		System.out.print(brojac1+", ");
		brojac1++;
		} while (brojac1<6);
	
	System.out.println("\nbrojevi po FOR petlji su: ");
	//int brojac2=3;
	for(int brojac2=3;brojac2<6;brojac2++) {
		System.out.print(brojac2+", ");
	}


	}
	
}
