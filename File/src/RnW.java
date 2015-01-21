import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class RnW {
	
	public static String ScanFile(File File) throws FileNotFoundException  {
		 @SuppressWarnings("resource")
		 Scanner sc = new Scanner(File);
		 String scan = sc.nextLine();
		 System.out.println("Scan: " + scan);
		 return scan;
	}
	
	public static String StreamFile(File File) throws IOException {
		 FileInputStream inputStream = new FileInputStream(File);
			try {
				String result = ""; 
				int content;
				while ((content = inputStream.read()) != -1) {
					result = result + (char)content;
				}
				result = result.substring(0, 15);
				System.out.println("Stream: " + result);
				return result;
				}
				finally {
						if (inputStream != null)
							inputStream.close();
				}
	}
	
	public static String BuffFile(File File) throws IOException {
		BufferedReader br = new BufferedReader( new FileReader(File.getPath()));
		try {
	        String line = br.readLine();
	        System.out.println("Buff: " + line);
	        return line;}
	    finally {
	        br.close();
	    }
		
	}
	
	public static String ReadFile(File File) throws IOException {
	       FileReader reader = new FileReader(File);
	       char[] chars = new char[(int) File.length()];
	       reader.read(chars);
	       String content = new String(chars);
	       reader.close();
	       System.out.println("Buff: " + content);
	       return content;
	}
	
	public static String Check(File File) throws IOException {
		BufferedReader br = new BufferedReader( new FileReader(File.getPath()));
		try {
	        String line = br.readLine();
	        return line;}
	    finally {
	        br.close();
	    }
		
	}
	
	public static String BuffWriteFile(File File, String content) throws IOException{
		FileWriter fw = new FileWriter(File.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
		System.out.println("BuffWrite: " + Check(File));
		return Check(File);
	}
	
	public static String PrintFile(File File, String content) throws IOException{
		PrintWriter writer = new PrintWriter(File);
		writer.print(content);
		writer.close();	
		System.out.println("Print: " + Check(File));
		return Check(File);
	}
	
	public static String OutputFile(File File, String content) throws IOException{
		FileOutputStream fos = new FileOutputStream(File); 
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write(content);
		osw.close();
		System.out.println("Output: " + Check(File));
		return Check(File);
	}
	
	public static String WriteFile(File File, String content) throws IOException{
		FileWriter fw = new FileWriter(File);
		fw.write(content);
		fw.close();
		System.out.println("Output: " + Check(File));
		return Check(File);
	}
	
}
