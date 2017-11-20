package vezba_koordinate;
import java.util.Scanner;
public class VK {
	public static double razdaljina (int x1,int y1, int x2, int y2) {
		double z=0;
		z=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		return z;
	} 
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj tacaka:");
		int broj_tacaka = input.nextInt();
		int[][] tacke = new int[broj_tacaka][2];
		int brojac=0;
		for(brojac=0;brojac<broj_tacaka;brojac++) {
			System.out.println("Ukucajte X koordinatu "+(brojac+1)+". tacke:");
			tacke[brojac][0] = input.nextInt();
			System.out.println("Ukucajte Y koordinatu "+(brojac+1)+". tacke:");
			tacke[brojac][1] = input.nextInt();
		}
		int duzina=0;
		for(brojac=0;brojac<(broj_tacaka-1);brojac++) {
			duzina+=razdaljina(tacke[brojac][0],tacke[brojac][1],tacke[brojac+1][0],tacke[brojac+1][1]);
		}
		duzina+=razdaljina(tacke[broj_tacaka-1][0],tacke[broj_tacaka-1][1],tacke[0][0],tacke[0][1]);
		System.out.println("Obim je "+duzina+" m");
	}

}
