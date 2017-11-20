import java.util.Scanner;
public class X2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int brojac=0;
		Scanner input = new Scanner(System.in);

		System.out.print("\nPrekidanje niza nulom preko DO WHILE petlje\n");
		System.out.println("Unosite vrednosti niza koji prekidate unosom nule, pa stisnite ENTER :");
		do {
			num = input.nextInt();
			brojac++;
			} while (num!=0);
		System.out.println("\nUneli ste "+brojac+" elemenata\n");
		
		System.out.println("Prekidanje niza nulom preko WHILE petlje:");
		num=1;
		brojac=0;
		System.out.println("Unosite vrednosti niza koji prekidate unosom nule, pa stisnite ENTER :");
		while(num!=0)
		{
			num = input.nextInt();
			brojac++;
		}
		System.out.println("\nUneli ste "+brojac+" elemenata\n");
				
		
	}

}
