import java.util.Scanner;
public class piramida3klasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ukucaj broj redova:");
		Scanner in = new Scanner(System.in);
	    int n,m,k,a;
		a = in.nextInt();
		for(n=0;n<a;n++)
		{
			for(m=0;m<a-n-1;m++)
			{
			
				System.out.print(" ");
			}
			for(k=0;k<(a-m+n);k++)
			{
		
				System.out.print("*");
			}
			System.out.print("\n");
		}

		in.close();

	}

}
