package ugnezdene_petlje_piramida2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class piramida2Cla {

	public static void main(String[] args) throws Exception {
		BufferedReader tastatura=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesi broj");
		int brojredova=Integer.parseInt(tastatura.readLine());

		for (int i=0;i<=brojredova;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+"\t");
			}
			System.out.print("\n");
		}
		
	}

	}
