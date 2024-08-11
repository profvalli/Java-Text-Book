Program 14.4 Program to implement Client using Java Sockets

//MessageClient.java
import java.net.*;
import java.io.*;
import java.net.InetAddress;
class MessageClient
{
public static void main(String[] args)
{
try
{
InetAddress host = InetAddress.getLocalHost();
Socket s = new Socket(host.getHostName(), 4321);
BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
System.out.println(in.readLine());
in.readLine();
}
catch(UnknownHostException uhexcp)
{
System.out.println("Host computer unknown");
}
catch(IOException ioexcp)
{
System.out.println("An error occured in i/o");
}
}
}
/*
Output: 
C:\>java MessageClient
This is a message from the server
*/
