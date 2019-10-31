package JavaWebSimple;
import java.net.*;
import java.io.*;
import java.util.*;
public class UrlSimple {

	public static void main(String[] args) {
		URL u;
		String UrlAdd = null;
		System.out.print("Input Address:http://");
		UrlAdd = new Scanner(System.in).next();
		try {
			u = new URL("http://"+UrlAdd);
			String thisLine;
			try
			{
				DataInputStream  dis = new DataInputStream (u.openStream());
				while((thisLine=dis.readLine())!=null)
				{
					{
						System.out.println(thisLine);
					}
				}
			}
			catch(IOException e)
			{
				System.err.println("Sai duong dan..!");
			}				
		} 
		catch (MalformedURLException e) 
		{
			System.err.print(e);
		}
	}
}
