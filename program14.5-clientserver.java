Program 14.5 Client-Server program

//MessageServer.java

import java.net.*;
import java.io.*;
class MessageServer1 {
private static int port = 2448; // Define the port
public static void main(String[] args) {
try (ServerSocket ss = new ServerSocket(port)) {
System.out.println("Server started and waiting for a client connection on port " + port);
try (Socket s = ss.accept()) {
System.out.println("Client connected to the server");
try (PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {
out.println("This is a message from the server");
System.out.println("Message sent to client");
}
}
} catch (IOException e) {
System.out.println("There is an error in I/O: " + e.getMessage());
}
}
}
//MessageClient.java

import java.net.*;
import java.io.*;
class MessageClient1 {
public static void main(String[] args) {
try {
Socket s = new Socket(InetAddress.getByName("localhost"), 2448);
try (BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()))) {
System.out.println(in.readLine());
}
s.close();
} catch (UnknownHostException uhexcp) {
System.out.println("Host computer unknown: " + uhexcp.getMessage());
} catch (IOException ioexcp) {
System.out.println("An error occurred in I/O: " + ioexcp.getMessage());
}
}
}

/* 
Server Output: 
C:\>java MessageServer
Server started and waiting for a client connection on port 2448
Client connected to the server
Message sent to client
/* 
Client Output:
C:\>java MessageClient
This is a message from the server
*/
