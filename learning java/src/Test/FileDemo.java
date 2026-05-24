package Test;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File fl = new File("C:\\Users\\srajpara2\\Desktop\\Selenium\\Demo\\FileDemo");
		
		fl.mkdir();
		
		/*if(fl.exists())
		{
			System.out.println("File already exists...");
			fl.delete();
			
		}
		
		else
		{
			try {
				fl.createNewFile();
				System.out.println("File Created...");
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
			*/
		}
		
	}


