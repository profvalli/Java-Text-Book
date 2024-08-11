//Program 14.1 to print address of the local host

//AddressTest.java
import java.net.*;

class AddressTest
{
public static void main(String[] args)
{
try
{
InetAddress add = InetAddress.getLocalHost();
System.out.println(add);
}
catch(Exception ex)
{
System.out.println("An error occurred when trying to get host address");
}
}
}
/*
Output:

C:\java\bin\javabook>java AddressTest
LAPTOP-BOPQKI3U/192.168.29.81
*/
