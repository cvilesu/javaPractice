package bzvzb;
import java.util.Scanner;
public class BZVZB {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Ukucaj broj redova: ");
		int bred = Input.nextInt();
		System.out.println("Ukucaj bazni broj: ");
		int bb = Input.nextInt();
		System.out.println("Ukucaj korak: ");
		int kor = Input.nextInt();
		int brojac=0;
		int prame=0;
		int br=0;
		for(brojac=0;brojac<bred;brojac++) {
			for(prame=0;prame<(bred-brojac-1);prame++) {
				System.out.print(" ");				
			}
			for(br=0;br<(bred+brojac-prame);br++) {
				System.out.print(bb+", ");
				bb+=kor;				
			}
			System.out.println("\n");
		}
	}

}
