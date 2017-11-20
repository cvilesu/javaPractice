package folderi01;
import java.io.File;
public class ispisSadrajaFolderaClass {

	public static void main(String[] args)  {
	File folder=new File("d:/vezba_folder");
	String[] podfolderi=folder.list();
	if(podfolderi==null)
	{
		System.out.println("Folder je prazan ili ne postoji");
	}else{
		for(int i=0;i<podfolderi.length;i++)
		{
			String imeFajla=podfolderi[i];
			System.out.println(imeFajla);
		}
	}
	}

}
