import java.io.File;
import java.io.IOException;
public class fajl3Class {

	public static void main(String[] args) 
	{
	try
	{
	File file=new File("novi_fajl2.txt");
	if(file.createNewFile()) {System.out.println("Uspesno smo kreirali novi fajl!");}
	else {System.out.println("Greska! Fajl vec postoji.");}
	}
	catch(IOException ioe)
	{
		ioe.printStackTrace();
	}
	}

}
