package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		try {
			FileReader fr = new FileReader("C:\\Users\\srajpara2\\Desktop\\Selenium\\Demo\\Texas.doc");
			
			int i = fr.read();
			
			while(i!=-1)
			{
				char c =(char) i;
				
				System.out.print(c);
				
				i = fr.read();
			}
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
