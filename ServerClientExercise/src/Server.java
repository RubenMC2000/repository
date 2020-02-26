import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Server {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Port Number: ");
        String port = scanner.next();
        System.out.println("Enter massage");
        String message = scanner.next();

        String hostName ="127.0.0.1";
        int portNumber = Integer.parseInt(port);
        boolean wait = false;

        byte[] recvBuffer;
        byte[] sendBuffer = recvBuffer;

        DatagramSocket socket = new DatagramSocket(portNumber);

        DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
        socket.receive(receivePacket);

        DatagramPacket sendPacket = new DatagramPacket(sendBuffer,
                sendBuffer.length, InetAddress.getByName(hostName), portNumber);

        socket.send(sendPacket);





        socket.close();

    }
}
