import java.net.*;
import java.io.*;
import java.util.*;

public class Server
{
	public static void main(String args[])
	{
		try
		{
			
			ServerSocket ss=new ServerSocket(1414);
			Socket s=ss.accept();
			
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream out=new PrintStream(s.getOutputStream());	
			String msg=" ";
			while(true)
			{
				String str=br.readLine();
				if (str.equals("end"))
				{
					msg="Acknowledgement Not Received";
					
					break;
				}
				msg="Acknowledgment Received";
				System.out.println("RECEIVED FRAME "+str);
				out.println(msg);
	
			}
			out.println(msg);
	
			s.close();
			ss.close();

		}
		catch(Exception e)
		{

		}
	}

}
