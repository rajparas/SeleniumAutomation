package FileIO;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fl = new File("D:\\Sanket\\File Demo\\File Demo1.doc");

		// TO CREATE A NEW FOLDER
		// fl.mkdir();

		// TO CREATE A WORD OR ANY TYPE OF DOC.

		if (fl.exists()) {
			System.out.println("File Exists...");
			fl.delete();
		}

		else {
			try {

				fl.createNewFile();
				System.out.println("File created");

			}

			catch (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
				e.printStackTrace();
			}

		}

	}

}
