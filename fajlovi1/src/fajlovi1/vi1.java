package fajlovi1;
import java.io.*;
public class vi1 {

	public static void main(String[] args) throws IOException{
	FileInputStream in = null;
	FileOutputStream out=null;
	try
	{
		in=new FileInputStream("d:/teskst1.txt");
		out=new FileOutputStream("d:/teskst2.txt");
		int broj; 
		int brojac=1;
		while((broj=in.read())!=-1 ) {
			out.write(broj);
			if(brojac==4) break;
			brojac++;
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