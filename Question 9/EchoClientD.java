import java.net.*;
import java.io.*;
import java.util.*;
public class EchoClientD
{
	public static void main(String args[])
	{
		try{
			Socket s=new Socket("192.168.0.118",1114);
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
			PrintStream out=new PrintStream(s.getOutputStream());
			System.out.println("Sending request to Server......");
			
			out.println();
			String str=br.readLine();
			System.out.println("Received this from server -> "+str);
			s.close();
		}catch(Exception e){}
	}
}
