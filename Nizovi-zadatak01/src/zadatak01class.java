
//PROGRAM TREBA DA UCITA BROJEVE U NIZ, DA ISPISUJE ELEMENTE I DA IZRACUNA ZBIR ELEMENATA
//PRVO TREBA TRAZITI KOLICINU BROJEVA
import java.util.Scanner;
public class zadatak01class {

	public static void main(String[] args) {
		int[] niz=new int[256];
		int ukupan_broj,n;
		int zbir=0;
		System.out.println("Koliko brojeva zelite uneti u niz?");
		Scanner in = new Scanner(System.in);
	    ukupan_broj = in.nextInt();//unos kolicine brojeva u nizu
		
	    for(n=0;n<ukupan_broj;n++)//petlja za unosenje elemenata niza
		{
		System.out.println("Unesite "+(n+1)+". element niza:");
		niz[n] = in.nextInt();
		}
		
	    for(n=0;n<ukupan_broj;n++)//petlja za ispis elemenata i izracunavanje zbira
		{
		System.out.println(n+1+". element niza je:"+niz[n]);
		zbir+=niz[n];
		}
		
	    System.out.println("Zbir elemenata niza je:"+zbir); //ispis rezultata

	}

}
