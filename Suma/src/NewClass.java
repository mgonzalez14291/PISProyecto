 import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewClass{
public static void main(String[] args) throws IOException {
 DataInputStream inFromUser = new DataInputStream(System.in); 
  
      DatagramSocket clientSocket = new DatagramSocket(); 
  
      InetAddress IPAddress = InetAddress.getByName("localhost"); 
  
      byte[] sendData = new byte[1024]; 
      byte[] receiveData = new byte[1024]; 
  
      while(true) 
        { 
  
          String sentence = inFromUser.readLine(); 
  
          sentence.getBytes(0, sentence.length(), sendData, 0); 

          DatagramPacket sendPacket = 
            new DatagramPacket(sendData, sendData.length, IPAddress, 9876); 
  
          clientSocket.send(sendPacket); 
  
          DatagramPacket receivePacket 
             = new DatagramPacket(receiveData, receiveData.length); 
  
         clientSocket.receive(receivePacket); 
  
         String modifiedSentence = 
            new String(receivePacket.getData(), 0); 
  
         System.out.println("FROM SERVER:" + modifiedSentence); 
}
} }