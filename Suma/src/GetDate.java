import java.net.*;

public class GetDate {

final static int PORT_DAYTIME = 8050;

// puerto asignado para la comunicación con el servidor

public static void main (String args[]) throws Exception {
      DatagramSocket serverSocket = new DatagramSocket(9876); 
  
      byte[] receiveData = new byte[1024]; 
      byte[] sendData  = new byte[1024]; 
  
      while(true) 
        { 
  
          DatagramPacket receivePacket 
            = new DatagramPacket(receiveData, receiveData.length); 
  
          serverSocket.receive(receivePacket); 
  
          String sentence = new String(receivePacket.getData(), 0); 
  
          InetAddress IPAddress = receivePacket.getAddress(); 
  
          int port = receivePacket.getPort(); 
  
          String capitalizedSentence = sentence.toUpperCase(); 
  
          capitalizedSentence.getBytes(0,sentence.length(),sendData,0); 
  
          DatagramPacket sendPacket = 
            new DatagramPacket(sendData, sendData.length, IPAddress, 
                               port); 
  
          serverSocket.send(sendPacket); 
        } 
}
} // final de la clase cliente 