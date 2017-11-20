package petlje2;
import java.util.Scanner;

public class petlje2class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nProgram realizovan sa do while petljom:\n\n");
		System.out.println("\nUnesite brojeve. Broj 0 ce prekinuti unos");
		Scanner in = new Scanner(System.in);
	    int num,brojac=0; 
		do
		{
		num = in.nextInt();
		brojac++;
		}while(num!=0);
		System.out.println("\nUneli ste "+brojac+" brojeva");
		
		System.out.println("\nProgram realizovan sa while petljom:\n\n");
		
		num=9;
		brojac=0;
		while(num!=0)
		{
			num = in.nextInt();
			brojac++;
		}
		System.out.println("\nUneli ste "+brojac+" brojeva");
		
		System.out.println("\nProgram realizovan sa for petljom:\n\n");
		for(brojac=1;brojac>=0;brojac++)
		{
			num = in.nextInt();
			if(num==0) break;//grananje, kondicionalna naredba
		}
		System.out.println("\nUneli ste "+brojac+" brojeva");
	}

}
