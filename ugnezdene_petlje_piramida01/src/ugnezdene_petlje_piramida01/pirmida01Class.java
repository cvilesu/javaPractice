package ugnezdene_petlje_piramida01;
import java.io.BufferedReader;

import java.io.InputStreamReader;

public class pirmida01Class {

	public static void main(String[] args) throws Exception {
		BufferedReader tastatura=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesi broj redova");
		int brojredova=Integer.parseInt(tastatura.readLine());
		System.out.println("Unesi korak:");
		int korak=Integer.parseInt(tastatura.readLine());
		int kolona=0;
		for (int i=0;i<=brojredova;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(kolona+"\t");
				kolona=kolona+korak;
			}
			System.out.print("\n");
		}
		
	}

}
