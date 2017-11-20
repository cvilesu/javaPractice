import java.util.Scanner;
public class X6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long[] fibonaccibrojeviunizu = new long[99];		
		System.out.println("Ukucaj koliko fibonacci brojeva u nizu zelis: ");
		int brojfibonaccibrojevaunizu = input.nextInt();
		fibonaccibrojeviunizu[0]=0;
		fibonaccibrojeviunizu[1]=1;
		//int ostalifibonaccibrojeviunizu=2;
		int brojac=0;
		for(fibonaccibrojeviunizu=2;fibonaccibrojeviunizu<brojfibonaccibrojevaunizu;fibonaccibrojeviunizu++) {
			fibonaccibrojeviunizu=(fibonaccibrojeviunizu-2)+(fibonaccibrojeviunizu-1);
		}
		System.out.println("\nFibonacci brojevi u nizu su:");
		for(brojac=0;brojac<brojfibonaccibrojevaunizu;brojac++) {
			System.out.print(fibonaccibrojeviunizu[brojac] +", ");
		}
		input.close();
}
}