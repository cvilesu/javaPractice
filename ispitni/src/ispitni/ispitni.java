package ispitni;
import java.util.Scanner;
public class ispitni {
public static double etapa (double x1, double x2, double y1, double y2) {
	double e=0;
	e=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
	return e;
}
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Ukucaj broj kota sa pocetnom:");
	int brojkota = input.nextInt();
	System.out.print(" \n");
	int[][] sektori = new int [brojkota][2];
	int brojac=0;
	double duzina=0;
	System.out.println("X koordinata pocetka staze je "+(sektori[0][0]=1));
	System.out.println("Y koordinata pocetka staze je "+(sektori[0][1]=1)+"\n");
	for(brojac=1;brojac<brojkota;brojac++) {
		if(brojac==brojkota-1) {
			System.out.print("X koordinata kraja finalne etape je: ");
		}
		else
		{
		System.out.print("X koordinata "+(brojac)+". prolazne kote staze je: ");
		}
		sektori[brojac][0] = input.nextInt();		
		if(brojac==brojkota-1) {
			System.out.print("Y koordinata kraja finalne etape je: ");
		}		
		else		
		{
		System.out.print("Y koordinata "+(brojac)+". prolazne kote staze je: ");
		}
		sektori[brojac][1] = input.nextInt();
		duzina+=etapa(sektori[brojac-1][0],sektori[brojac-1][1],sektori[brojac][0],sektori[brojac][1]);
		if(brojac==(brojkota-1)) 
			{
			System.out.println("\nDuzina predjene staze posle finalne etape je "+duzina+" km");
			}
		else
			{
			System.out.println("\nDuzina predjene staze posle "+(brojac)+". etape je "+duzina+" km");
			}
		if(brojac==(brojkota-1)) 
			{
			System.out.print("Ukucaj ukupnu prolaznu minutazu nakon finalne etape: ");
			}
		else
			{
			System.out.print("Ukucaj ukupnu prolaznu minutazu nakon "+(brojac)+". etape: ");
			}
		double min = input.nextInt();
		if(brojac==(brojkota-1))
			{
			System.out.println("Ukupna prosecna brzina posle finalne etape je "+(duzina/(min/60))+" km/h\n");
			}
		else
			{
			System.out.println("Ukupna prosecna brzina posle "+(brojac)+". etape je "+(duzina/(min/60))+" km/h\n");
	}


	}
	input.close();
	}

}
