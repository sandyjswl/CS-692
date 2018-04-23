import java.io.*;
import java.net.*;

class SenderMult
{
	public static void main(String args[])
	{
		try{
			InetAddress group=InetAddress.getByName("224.0.0.1");
			MulticastSocket s=new MulticastSocket(1212);
			String msg="Hello, this is SIT";
			DatagramPacket packet=new DatagramPacket(msg.getBytes(),msg.length(),group,1212);
			s.send(packet);
			s.close();
						 	
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
