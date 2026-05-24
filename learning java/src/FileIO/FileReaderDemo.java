package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		
		FileReader fr = new FileReader("D:\\Sanket\\File Demo\\Fw.doc");
		
		int i = fr.read();
		
		while(i!=-1)
		{
			
			char c =(char) i;
			System.out.print(c);
			i = fr.read();
			
		}
		
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
