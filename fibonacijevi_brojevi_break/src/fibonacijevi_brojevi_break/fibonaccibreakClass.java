package fibonacijevi_brojevi_break;

public class fibonaccibreakClass {

	public static void main(String[] args) {
		int n=0;
		int granica=20,brojac_indexa=2; //to je limit
		long[] fibonacci=new long[granica];//deklaracija niza tipa long (dvostruki int), koji ce imati 20 elemenata
		fibonacci[0]=0;//prva dva broja niza kod fibonacijevih brojeva moraju ibiti rucno definisana
		fibonacci[1]=1;
		for(n=2;n<granica;n--)//ukoliko se deklarise promenljiva unutar zagrade ptelje, ta promenljiva je @ziva@ samo dok se petlja ne zavrsava
		{
			fibonacci[brojac_indexa]=fibonacci[brojac_indexa-2]+fibonacci[brojac_indexa-1];
			brojac_indexa++;
			if(brojac_indexa==20) break;
		}
		System.out.println("Fibonacijevi brojevi do "+granica+"-tog broja su:");
		for(n=0;n<granica;n++)
		{
			System.out.print(fibonacci[n]+ ", ");
		}



	}

}
