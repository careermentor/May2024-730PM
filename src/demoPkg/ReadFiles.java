package demoPkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ReadFiles 
{
	
	public static void readprop() throws Exception
	{
		//File f = new File("./TestData/test.properties");
		FileReader fr = new FileReader("./TestData/test.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		prop.get("username");
		
		
		System.out.println(prop.get("lang"));
		
		System.out.println(prop.get("automation"));
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nThis is the forth line of the file");
		fw.flush();
		fw.close();
	}

	public static void readfile() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt"); //file connection
		
		File f = new File("./TestData/abc.txt");
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();  //116
		
		while(r!=-1)  //114
		{
			System.out.print((char)r);
			r = fr.read(); 
			
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		ReadFiles.readprop();;
	}
	
}
