//Ispiis i savucanje prvih 20 Fibonacijevih brojeva u nizu
package fibonacijevi_brojevi;

public class fibonacciClassi {

	public static void main(String[] args) {
		int n=0;
		int fibonaccibrojbrojevaunizu=20; //to je limit
		long[] fibonaccibrojeviunizu=new long[fibonaccibrojbrojevaunizu];//deklaracija niza tipa long (dvostruki int), koji ce imati 20 elemenata
		fibonaccibrojeviunizu[0]=0;//prva dva broja niza kod fibonacijevih brojeva moraju ibiti rucno definisana
		fibonaccibrojeviunizu[1]=1;
		//Prvo ide FOR petlja za ubacivanje brojeva u niz:
		for(n=2;n<fibonaccibrojbrojevaunizu;n++)//ukoliko se deklarise promenljiva unutar zagrade ptelje, ta promenljiva je @ziva@ samo dok se petlja ne zavrsava
		{
			fibonaccibrojeviunizu[n]=fibonaccibrojeviunizu[n-2]+fibonaccibrojeviunizu[n-1];
		}
		//Zatim ide FOR petlja za izlistavanje fibonacci brojeva
		System.out.println("Fibonacijevi brojevi do "+(fibonaccibrojbrojevaunizu)+"-tog broja su:");
		for(n=0;n<fibonaccibrojbrojevaunizu;n++)
		{
			System.out.print(fibonaccibrojeviunizu[n]+ ", ");
		}

	}

}
