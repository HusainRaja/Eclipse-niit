package files;

import java.io.File;
import java.io.FileWriter;

public class FilesExample {
	public static void main(String args[]) throws Exception{
		String path="‪e:/files.txt";
		File f=new File(path);
		f.createNewFile();
		FileWriter fw=new FileWriter(f,true);
		fw.append("The name is Raja...Husain Raja");
		fw.close();
	}
}