
public class X3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] brojeviunizu= {10,20,30,40,50,60,70,80,90,0};
		int brojbrojevaunizu=10;
		int brojac=0;
		int zbir=0;
		System.out.println("Elementi niza su:");
		for (brojac=0;brojac<brojbrojevaunizu;brojac++) {
			System.out.println(+brojeviunizu[brojac]);
			zbir = zbir+brojeviunizu[brojac];
			System.out.println("ukupan trenutni zbir niza je: "+zbir);
		}
		
		//System.out.println("a njihov zbir je: "+zbir);
	}

}
