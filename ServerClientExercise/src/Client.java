import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your address: ");
        String address = scanner.next();
        System.out.println("Enter port Number: ");
        String port = scanner.next();
        System.out.println("Enter massage");
        String message = scanner.next();

        String hostName = address;
        int portNumber = Integer.parseInt(port);
        boolean wait = false;
        boolean stop = false;

        byte[] sendBuffer = message.getBytes();
        byte[] recvBuffer = new byte[1024];

        DatagramSocket socket = new DatagramSocket();

        DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);

        DatagramPacket sendPacket = new DatagramPacket(sendBuffer,
                sendBuffer.length, InetAddress.getByName(hostName), portNumber);

            if(wait == true){
                System.out.println("Waiting....");
            } else{
                wait = true;
                socket.send(sendPacket);

            }


        socket.close();


    }
}
