package bzvzg;
import java.io.File;
import java.io.IOException;
public class BZVZG {

	public static void main(String[] args) {
	try {
	File fajl = new File("d:/novi.txt");
	if(fajl.createNewFile()) {
		System.out.println("Fajl uspesno kreiran !");
	}
	else{
		System.out.println("Fajl vec postoji !");
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

}
