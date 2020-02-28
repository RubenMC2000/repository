import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class ServerChat {

    public static void main(String[] args){


    }

    /*-----
    PROPERTIES
     -----*/
    private LinkedList<ServerWorker> list = new LinkedList<>();
    private String messageSendAll;
    private ServerSocket serverSocket;
    private Socket clientSocket;

    /*-----
    METHODS
     -----*/
    public void start(){
        try {
            serverSocket = new ServerSocket(2745);
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ServerWorker implements Runnable{

        /*-----
   PROPERTIES
    -----*/
        private ServerSocket serverSocket;
        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;


        /*-----
     METHODS
      -----*/
        @Override
        public void run() {
            
        }
    }

}
