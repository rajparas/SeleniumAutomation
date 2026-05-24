package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			
			FileInputStream fis = new FileInputStream("D:\\Sanket\\File Demo\\Sanket.doc");
			
			int i = fis.read();
				
			while(i!=-1)
			{
				char c = (char) i;
			System.out.print(c);
			i = fis.read();
			

			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
