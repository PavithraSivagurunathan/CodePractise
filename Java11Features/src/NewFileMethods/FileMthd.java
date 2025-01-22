package NewFileMethods;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileMthd {
	
	public static void main (String[] args) {
		try {
		Path filepath = Paths.get("D:\\","FileRead","Details.txt");
		String filestr= Files.readString(filepath);
		System.out.println(filestr);
		Files.writeString(filepath, filestr.repeat(4), StandardOpenOption.APPEND);
		String filestr1= Files.readString(filepath);
		System.out.println(filestr1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
