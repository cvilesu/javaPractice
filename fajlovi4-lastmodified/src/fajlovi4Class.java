import java.io.File;
import java.util.Date;
public class fajlovi4Class {

	public static void main(String[] args)
	{
		File file=new File("src/fajlovi4Class.java");
		Long zadnjiputModifikovan=file.lastModified();
		Date datum=new Date(zadnjiputModifikovan);
		System.out.println(datum);

	}

}
