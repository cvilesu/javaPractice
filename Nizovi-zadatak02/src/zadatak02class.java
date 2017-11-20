
//PROGRAM TREBA DA UCITA BROJEVE U NIZ, DA ISPISUJE ELEMENTE I DA IZRACUNA ZBIR ELEMENATA
//PRVO TREBA TRAZITI KOLICINU BROJEVA
import java.util.Scanner;
public class zadatak02class {

	public static void main(String[] args) {
		int[] brojunizu=new int[256];
		int broj_brojeva_u_nizu;
		int brojac=0;
		int zbir=0;
		System.out.println("Koliko brojeva zelite uneti u niz?");
		Scanner in = new Scanner(System.in);
		broj_brojeva_u_nizu = in.nextInt();//unos kolicine brojeva u nizu
		
	    for(brojac=0;brojac<broj_brojeva_u_nizu;brojac++)//petlja za unosenje elemenata niza
		{
	    	System.out.println("Unesite "+(brojac+1)+". element niza:");//brojac+1 jer je pocetni brojac=0
	    	brojunizu[brojac] = in.nextInt();
		}
		
	    for(brojac=0;brojac<broj_brojeva_u_nizu;brojac++)//petlja za ispis elemenata i izracunavanje zbira
		{
		System.out.println(brojac+1+". element niza je:"+brojunizu[brojac]);
		System.out.println("Zbir elemenata niza je: "+(zbir+=brojunizu[brojac])); //ako hocu zbir posle svake stavke
		}
		
	    //System.out.println("Zbir elemenata niza je:"+zbir); //ispis rezultata sabiranja ako necu zbir posle svake stavke

	}

}
