package vezbicafibonacci;

public class VF {

	public static void main(String[] args) {
		long [] nizfbrojeva = new long[10000];
		System.out.println("Fibonacci brojevi u nizu su:");
		int brojfbrojeva=10;
		nizfbrojeva[0]=0;
		nizfbrojeva[1]=3;
		for(int brojac=2;brojac<brojfbrojeva;brojac++) {
			nizfbrojeva[brojac]=nizfbrojeva[brojac-1]+nizfbrojeva[brojac-2];
		}
		for(int brojac=0;brojac<brojfbrojeva;brojac++){
			System.out.print(nizfbrojeva[brojac]+", ");
		}
	}

}
