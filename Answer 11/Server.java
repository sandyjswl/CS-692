import java.net.*;
import java.io.*;
import java.util.*;
public class Server
{
	public static void main(String args[])
	{
		try{	Date d=new Date();
			ServerSocket ss=new ServerSocket(1114);
			Socket s=ss.accept();
			BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream Out=new PrintStream(s.getOutputStream());
			String str=in.readLine();
			System.out.println("Server received a message -> "+str);
			System.out.println("Converting to Upper Case......");
			String upperStr=str.toUpperCase();
			System.out.println("Sending converted String......"+upperStr);
			Out.println(upperStr);			
			s.close();
			ss.close();
		}catch(Exception e){}
	}
}
