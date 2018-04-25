
import java.net.*;
import java.io.*;
import java.util.*;
public class Client
{
	public static void main(String args[])
	{
		try
		{
			
			
	
			Socket s=new Socket("192.168.0.118",1414);
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			Scanner sc=new Scanner(System.in);
			PrintStream out=new PrintStream(s.getOutputStream());	
			while(true)
			{
				System.out.println("Enter frame to send or end to stop:");
				String msg=sc.nextLine();
				
				out.println(msg);
				String str=br.readLine();
				if (str.equals("Acknowledgement Not Received"))
				{
					break;
				}
			}
			System.out.println("Acknowledgment Not Received..............\n\n Ending Service...");
			s.close();

		}
		catch(Exception e)
		{

		}
	}

}
