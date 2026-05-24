package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		try {
			FileOutputStream fis = new FileOutputStream("C:\\Users\\srajpara2\\Desktop\\Selenium\\Demo\\Java.doc");
			
			System.out.println("File Created...");
			
			String str = "This is my Practice IO Program.....";
			
			byte b[]= str.getBytes();
			
			fis.write(b);
			
			System.out.println("Data Written...");
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
