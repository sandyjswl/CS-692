import java.io.*;
import java.net.*;
import java.util.*;
public class Server
{
	public static void main(String args[])
	{
		try
		{
			int port=Integer.parseInt(args[0]);
			ServerSocket ss=new ServerSocket(port);
			Socket s=ss.accept();
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			//BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
			PrintStream out=new PrintStream(s.getOutputStream());
			
			//String str =br.readLine();
			//int n=Integer.parseInt(str);
		//	System.out.println("Request Received from client..");


			String str=br.readLine();
			//System.out.println("name Request from Client "+str);
			//Date d=new Date();
			int num=Integer.parseInt(str);
			System.out.println("Number Received from client "+num);
			//System.out.println("Name in UPPER case: "+str.toUpperCase());
			//String str1=str.toUpperCase();
			long starttime=System.currentTimeMillis();
			//System.out.println(starttime);
			int res=0;	
					
			for(int i=1;i<=num;i++)
			{
				res=res+i;
				Thread.sleep(1000);
			}
			long endtime=System.currentTimeMillis();
			System.out.println(endtime);
			//out.println(str1);
			//str=br.readLine();
			//System.out.println("Sum is "+res);
			System.out.println("Execution Time is: "+(endtime-starttime)/1000+" seconds");


			
			//String st=InetAddress.getLocalHost().getHostName();
			System.out.println("Sending Result to client.......\n");
			out.println(res);
			s.close();
			ss.close();
		}
		catch(Exception e)
		{
		}
	}
}
			
			
