package currentfolder;

public class Cf {

	public static void main(String[] args) {
		String  trenutnifolder = System.getProperty("user.dir");
		System.out.println("Trenutmo smo u" + trenutnifolder);
	}

}
