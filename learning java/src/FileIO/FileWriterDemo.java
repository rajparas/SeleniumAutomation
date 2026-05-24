package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fw = new FileWriter("D:\\Sanket\\File Demo\\Fw.doc");
			
			System.out.println("File Created...");
		
			String str = "Hello Java Hello Tops...";
			
			
			fw.write(str);
			fw.flush();
		
			System.out.println("Data Written...");
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
