package zidanje;
import java.util.Scanner;
public class zidClass {

	public static double razdaljina(int x1, int y1, int x2, int y2)//metoda (funkcija) koja racuna razdaljinu izmedu tacaka
	{
	double z=0;
	z=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
	return z;
	}
	public static void main(String[] args) {

		System.out.println("Koliko tacaka zelite uneti?");
		Scanner in = new Scanner(System.in);
		int broj_tacki=in.nextInt();
		int[][] tacke=new int[broj_tacki][2];
		for(int n=0;n<broj_tacki;n++)
		{
			System.out.print("Unesite X koordinatu za "+n+". tacku: ");
			tacke[n][0]=in.nextInt();
			System.out.print("Unesite Y koordinatu za "+n+". tacku: ");
			tacke[n][1]=in.nextInt();
		}
		double duzina=0;
		for(int n=0;n<broj_tacki-1;n++)
		{
			duzina+=razdaljina(tacke[n][0],tacke[n][1],tacke[n+1][0],tacke[n+1][1]);
		}
		duzina+=razdaljina(tacke[broj_tacki-1][0],tacke[broj_tacki-1][1],tacke[0][0],tacke[0][1]);
		System.out.println(duzina);
		System.out.print("Unesite visinu zida: ");
		int visina=in.nextInt();
		double broj_cigala=visina*duzina*50;
		System.out.print("Broj cigala: "+broj_cigala);
	}

}
