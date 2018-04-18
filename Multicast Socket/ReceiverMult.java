import java.io.*;
import java.net.*;

class ReceiverMult
{
	public static void main(String args[])
	{
		try{
			InetAddress group=InetAddress.getByName("224.0.0.1");
			MulticastSocket s=new MulticastSocket(1212);
			s.joinGroup(group);
			byte[] buffer=new byte[100];
			DatagramPacket packet=new DatagramPacket(buffer,buffer.length);
			s.receive(packet);
			System.out.println(new String(buffer));
			s.close();
						 	
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
