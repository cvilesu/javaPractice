package nizovi;

public class nizoviklasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Program izracuna zbir vrednosti u nizu  
		int[] array = {10, 20, 30, 40, 50, 10};
	      int n,sum = 0;
	      for(n=0;n<6;n++) {
	          sum = sum+array[n];
	      }
	      System.out.println("Zbir elemenata niza je: "+sum);
	}

}
