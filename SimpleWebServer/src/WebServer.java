import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    public static void main(String[] args){

        try {
            ServerSocket serverSocket = new ServerSocket(2745);
            Socket clientSocket = serverSocket.accept();

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String stuffPrint;

            String[] lines = in.readLine().split(" ");
            File file = new File("www" + lines[1]);

            if (lines[0].equals("GET")) {


                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

                out.println("HTTP/1.0 200 Document Follows\r\n" +
                        "Content-Type: text/html; charset=UTF-8\r\n "
                        + "Content-Length: " + file.length() + "\r\n \r\n");

                while ((stuffPrint = bufferedReader.readLine()) != null) {
                    System.out.println(stuffPrint);
                    out.println(stuffPrint+"\n");
                    out.flush();
                }
                bufferedReader.close();
                out.close();
            }
            out.close();

        } catch (Exception e) {
            e.getMessage();
        }

    }
}
