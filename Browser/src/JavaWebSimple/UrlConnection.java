package JavaWebSimple;
import java.net.*;
import java.io.*;
import java.util.*;
public class UrlConnection {

	public static void main(String[] args) {
		URL u;
		URLConnection uc;
		String UrlAdd = null;
		System.out.print("Input Address:http://");
		UrlAdd = new Scanner(System.in).next();
		try {
			u = new URL("http://"+UrlAdd);
			String thisLine;
			try
			{
				uc = u.openConnection();
				DataInputStream theHtml = new DataInputStream (uc.getInputStream());
				try
				{
					while((thisLine = theHtml.readLine())!=null)
					{
						System.out.println(thisLine);
					}
				}
				catch(Exception e)
				{
					System.err.println(e);
				}
				
			}
			catch(IOException e)
			{
				System.err.println("Sai duong dan..!");
			}				
		} 
		catch (MalformedURLException e) 
		{
			System.out.print("Sai duong dan..!");
		}
	}
}
