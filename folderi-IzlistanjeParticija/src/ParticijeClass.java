import java.io.File;
public class ParticijeClass {

	public static void main(String[] args) {
	      File[] particije = File.listRoots();
	      System.out.println("Root directories in your system are:"); 
	      for (int i = 0; i < particije.length; i++) {
	         System.out.println(particije[i].toString());
	      }

	}

}
