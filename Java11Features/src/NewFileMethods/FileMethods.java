package NewFileMethods;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileMethods {
	
	public static void main(String[] args)
	{
		try {
		Path filePath = Paths.get("C:\\Users\\Acer\\Desktop","example.txt","example.txt");
		Path filepath1 =Paths.get("C:\\\\Users\\\\Acer\\\\Desktop","example.txt","example1.txt");
		Files.writeString(filePath,"Write String !!",StandardOpenOption.APPEND );
		Files.writeString(filePath, "NEW STRING..", StandardOpenOption.TRUNCATE_EXISTING);
		String content = Files.readString(filePath);
		String secondContent = Files.readString(filepath1);
		System.out.println(secondContent);
		System.out.println(content);
		System.out.println(Files.isSameFile(filePath, filePath));//both files are same hence that returns true.
		System.out.println(Files.isSameFile(filePath, filepath1));//both files are different hence that returns false.
		}catch(Exception E) {
			E.printStackTrace();
		}
	}
}
