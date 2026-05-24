package FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try 
		{
			
			FileOutputStream fis = new FileOutputStream("D:\\Sanket\\File Demo\\Sanket1.doc");
			
			System.out.println("File Created...");
			String str = "This is my first IO Program....!!!";
			
			byte b[]= str.getBytes();
			
			fis.write(b);
			System.out.println("Data written...");
			
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
}
