package fileReadear;
import java.io.*;

public class FileReaderBufferReader {

	public static void main(String[] args) {
		FileReader file = null;
		BufferedReader reader = null;
		String fileLocation = "/Users/palmauzzal/Desktop/Hello.txt";

		try {
			file = new FileReader(fileLocation);
		} 
		catch (Exception ex) {
			System.out.println("File is not readable");
		}
		try {
			reader = new BufferedReader(file);
			String data = " ";
			  while ((data = reader.readLine()) != null) {
			  System.out.println(data);
			} 
			} 
		catch (Exception ex) {
			  System.out.println("Sorry, please try again");
		}
	}

}
