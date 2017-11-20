package fajlovi2;
import java.io.*;
public class vi2Class {

	public static void main(String[] args) throws IOException{
	FileInputStream in = null;
	FileOutputStream out=null;
	try
	{
		in=new FileInputStream("d:/teskst1.txt");
		out=new FileOutputStream("d:/teskst2.txt");
		int broj; 
		while((broj=in.read())!=-1 ) {
			out.write(broj);
			}
	}finally
		{
		if(in!= null)
		{
			in.close();
		}
		if(out!= null)
		{
			out.close();
		}
		}

	}

}
