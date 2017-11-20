import java.io.File;
public class preimenovanjeClass {

	public static void main(String[] args) {
		File oldName = new File("teskst1.txt");
	      File newName = new File("java.txt");
	      
	      if(oldName.renameTo(newName)) {
	         System.out.println("Preimenovan");
	      } else {
	         System.out.println("Greska");
	      }

	}

}
