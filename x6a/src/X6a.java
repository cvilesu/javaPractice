
public class X6a {

	public static void main(String[] args) {
		
		int brojfibonaccibrojevaunizu = 10;
		long[] fibonaccibrojeviunizu = new long [brojfibonaccibrojevaunizu];
		fibonaccibrojeviunizu[0]=0;
		fibonaccibrojeviunizu[1]=1;
		int ostalifibonaccibrojeviunizu=2;
		int brojac=0;
		for(ostalifibonaccibrojeviunizu=2;ostalifibonaccibrojeviunizu<brojfibonaccibrojevaunizu;ostalifibonaccibrojeviunizu++) {
			fibonaccibrojeviunizu[ostalifibonaccibrojeviunizu]=fibonaccibrojeviunizu[ostalifibonaccibrojeviunizu-2]+fibonaccibrojeviunizu[ostalifibonaccibrojeviunizu-1];
		}
		System.out.println("\nFibonacci brojevi u nizu su:");
		for(brojac=0;brojac<brojfibonaccibrojevaunizu;brojac++) {
			System.out.print(fibonaccibrojeviunizu[brojac] +", ");
		}

}
}