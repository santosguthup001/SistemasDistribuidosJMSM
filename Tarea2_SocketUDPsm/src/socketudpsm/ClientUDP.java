/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketudpsm;

/**
 *
 * @author Carlos
 */
import java.net.*;
import java.io.*;

public class ClientUDP {

  // Los argumentos proporcionan el mensaje y el nombre del servidor
  public static void main(String args[]) {
    int puerto = 6789;

    try {
        int dato = 5;
        String ip ="localhost";
      DatagramSocket socketUDP = new DatagramSocket();
      byte numero=(byte)dato;
      byte[] mensaje = new byte[1];
      mensaje[0]=numero;
      InetAddress hostServidor = InetAddress.getByName(ip);
      
      // Construimos un datagrama para enviar el mensaje al servidor
      DatagramPacket peticion =
        new DatagramPacket(mensaje, 1, hostServidor,
                           puerto);

      // Enviamos el datagrama
      socketUDP.send(peticion);

      // Construimos el DatagramPacket que contendrá la respuesta
      byte[] bufer = new byte[1000];
      DatagramPacket respuesta =
        new DatagramPacket(bufer, bufer.length);
      socketUDP.receive(respuesta);

      // Enviamos la respuesta del servidor a la salida estandar
      byte[] resp=respuesta.getData();
      System.out.println("Respuesta: " + resp[0]);

      // Cerramos el socket
      socketUDP.close();

    } catch (SocketException e) {
      System.out.println("Socket: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO: " + e.getMessage());
    }
  }
}

