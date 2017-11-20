package pravi_maraton;
import java.util.Scanner;
public class Pravi_Maraton {
public static double etapa (double x1, double x2, double y1, double y2) {
	double e=0;
	e=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
	return e;
}
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Ukucaj broj kota:");
	int brojkota = input.nextInt();
	System.out.print(" \n");
	int[][] sektori = new int [brojkota][2];
	int brojac=0;
	double duzina=0;
	for(brojac=0;brojac<brojkota;brojac++) {
		if(brojac==0) {
			System.out.print("X koordinata pocetka staze je: ");
			}
		else		
		{
		System.out.print("X koordinata "+(brojac)+". kote staze je: ");
		}
		sektori[brojac][0] = input.nextInt();		
		if(brojac==0) {
			System.out.print("Y koordinata pocetka staze je: ");
			}
		else		
		{
		System.out.print("Y koordinata "+(brojac)+". kote staze je: ");
		}
		sektori[brojac][1] = input.nextInt();
	}

	for(brojac=0;brojac<(brojkota-1);brojac++) {
		duzina+=etapa(sektori[brojac][0],sektori[brojac][1],sektori[brojac+1][0],sektori[brojac+1][1]);
		if(brojac==(brojkota-2)) 
			{
			System.out.println("\nDuzina predjene staze posle finalne etape je "+duzina+" km");
			}
		else
			{
			System.out.println("\nDuzina predjene staze posle "+(brojac+1)+". etape je "+duzina+" km");
			}
		if(brojac==(brojkota-2)) 
			{
			System.out.print("Ukucaj minutazu nakon finalne etape: ");
			}
		else
			{
			System.out.print("Ukucaj minutazu nakon "+(brojac+1)+". etape: ");
			}
		double min = input.nextInt();
		if(brojac==(brojkota-2))
			{
			System.out.println("Ukupna prosecna brzina posle finalne etape je "+(duzina/(min/60))+" km/h\n");
			}
		else
			{
			System.out.println("Ukupna prosecna brzina posle "+(brojac+1)+". etape je "+(duzina/(min/60))+" km/h\n");
			}
	}
	
	}

}
