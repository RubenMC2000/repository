import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {

    public ClientChat(){
    }

    public static void main(String[] args){

        try {
            ClientChat clientChat = new ClientChat();
            clientChat.createConnection();
            Thread thread = new Thread(clientChat.clientChatRun);
            thread.start();
            while(true){
                clientChat.receiveMessage();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

    private String hostName;
    private int portNumber;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private ClientChatRun clientChatRun = new ClientChatRun();

    public void createConnection(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter host");
        hostName = scanner.next();
        System.out.println("Enter port");
        portNumber = scanner.nextInt();

        try {
            clientSocket = new Socket(hostName, portNumber);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeMessage(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter message");
            String message = scanner.next();

            out.write(message);
            out.flush();
    }

    public void receiveMessage() throws IOException {
        System.out.println(in.readLine());
    }

    private class ClientChatRun implements Runnable{

        @Override
        public void run() {
            writeMessage();
        }
    }

}
