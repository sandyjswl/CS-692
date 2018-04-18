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
			System.out.println("Server received the request......"+str);
			Out.println(d);			
			s.close();
			ss.close();
		}catch(Exception e){}
	}
}
