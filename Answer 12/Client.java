import java.net.*;
import java.io.*;
import java.util.*;
public class Client
{
	public static void main(String args[])
	{
		try
		{
			InetAddress ip= InetAddress.getByName(args[0]);
			int port=Integer.parseInt(args[1]);
			int num=Integer.parseInt(args[2]);
			Socket s=new Socket(ip,port);
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
			PrintStream out=new PrintStream(s.getOutputStream());	
			//System.out.println("Enter Your name to echo: ");
			//String str=stdin.readLine();
			System.out.println("Sending Request to server ");	
			//System.out.println("Retreiving the name of host..............");		
			out.println(num);
			String str=br.readLine();
			System.out.println("Answer Received from server: "+str);
			//long endtime=System.currentTimeMillis();
			//System.out.println("Execution Time is: "+(endtime-starttime)+"ms");
			s.close();

		}
		catch(Exception e)
		{

		}
	}

}
