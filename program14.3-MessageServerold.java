Program 14.3 Program for implementing a Server using Java Sockets

//MessageServerold.java
import java.net.*;
import java.io.*;
class MessageServer {
private static int port = 4321;
public static void main(String[] args) {
try (ServerSocket ss = new ServerSocket(port)) {
System.out.println("Server started and waiting for a client connection on port " + port);
try (Socket s = ss.accept()) {
System.out.println("Client connected to the server");
try (PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {
out.println("This is a message from the server");
System.out.println("Message sent to client");
}
}
} catch (IOException e) {
System.out.println("There is an error in I/O: " + e.getMessage());
}
}
}
/*
Output:
C:\>java MessageServer
Client connected to the server
Message sent to client
*/
