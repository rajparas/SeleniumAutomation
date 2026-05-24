package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\srajpara2\\Desktop\\Selenium\\Demo\\Java.doc");
			
			int i = fis.read();
			
			while(i!=-1)
			{
				char c = (char) i;
				
				System.out.print(c);
				
				i = fis.read();
				
			}
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
