package fajlovi;
import java.io.*;

public class fajloviClass {

	public static void main(String[] args) throws IOException{
		FileInputStream in = null;
		FileOutputStream out=null;
		try
		{
			in=new FileInputStream("teskst1.txt");
			out=new FileOutputStream("teskst2.txt");
			int broj, brojac=1;
			while((broj=in.read())!=-1){
				if(brojac>=5 && brojac<=7) out.write(broj);
				if(brojac==7) break;
				brojac++;
			}
		}finally
			{
			if(in!=null)
			{
				in.close();
			}
			if(out!=null)
			{
				out.close();
			}
			}

		}

}
