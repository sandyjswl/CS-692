import java.io.*;
import java.net.*;
import java.util.*;

public class ClientS 
{
	private static Socket socket;
	public static void main(String [] args) 
	{
		try{
			String host="localhost";
			int port=25000;
			InetAddress address=InetAddress.getByName(host);
			socket =new Socket(address,port);
			
			OutputStream os=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
				BufferedWriter bw=new BufferedWriter(osw);
				
			String number="2";
			String sendMessage=number +"\n";
			bw.write(sendMessage);
			bw.flush();
			System.out.println("Message sent to the server"+sendMessage);
			
			InputStream is=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				BufferedReader br=new BufferedReader(isr);
				String message=br.readLine();
				System.out.println("Message recieves from server is "+message);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				socket.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
