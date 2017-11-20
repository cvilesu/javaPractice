import java.util.Scanner;
public class X1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int reversenum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi broj za inverziju: ");
		num = input.nextInt();
		while (num!=0)
			{
				reversenum = reversenum*10;
				reversenum = reversenum+(num%10);
				num = num/10;
			}
		System.out.println("Inverzni broj je: "+reversenum);
	}
}
