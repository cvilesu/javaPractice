package bzvzd;
import java.io.*;
public class BZVZD {

	public static void main(String[] args) throws IOException {
	FileInputStream in = null;
	FileOutputStream out = null;
	try{
		in = new FileInputStream("d:/teskst1.txt");
		out = new FileOutputStream("d:/teskst2.txt");
		int brojac=1;
		int content;
		while((content=in.read())!=-1) {
			if(brojac>=10 && brojac<=22) out.write(content);
			if(brojac==22) break;
			brojac++;
		}
	}
	finally {
		if(in!=null) {
			in.close();
		}
		if(out!=null) {
			out.close();
		}
	}
	
	}

}
