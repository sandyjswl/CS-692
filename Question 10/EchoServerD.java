import java.net.*;
import java.io.*;
import java.util.*;
public class EchoServerD
{
	public static void main(String args[])
	{
		try{	Date d=new Date();
			ServerSocket ss=new ServerSocket(1114);
			Socket s=ss.accept();
			BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream Out=new PrintStream(s.getOutputStream());
			String str=in.readLine();
			System.out.println("Server received a message......"+str);
			System.out.println("Server is sending back the message......"+str);
			Out.println(str);			
			s.close();
			ss.close();
		}catch(Exception e){}
	}
}
