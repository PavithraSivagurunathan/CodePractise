package NewFileMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Filemtd {
	public static void main(String[] args) {
		Path p=Paths.get("C:\\Users\\Acer\\Desktop","example.txt","example.txt");
		Path p1=Paths.get("C:\\Users\\Acer\\Desktop","New folder","example.txt");
		try {
			System.out.println(Files.readString(p));
			Files.writeString(p, "Hello World",StandardOpenOption.TRUNCATE_EXISTING);
			System.out.println(Files.readString(p));
			System.out.println(Files.isSameFile(p, p1));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
