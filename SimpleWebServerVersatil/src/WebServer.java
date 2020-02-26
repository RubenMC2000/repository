import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    public static void main(String[] args){

        WebServer webServer = new WebServer();
            try {
                webServer.startServer();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                webServer.request();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }

    //-----PROPERTIES-----//
    private ServerSocket serverSocket = null;
    private Socket socket = null;
    String[] strings = null;
    BufferedReader bufferedReader = null;
    File acessFile = null;



    //-----METHODS-----//
    public void startServer() throws IOException {

        serverSocket = new ServerSocket(2745);
        socket = serverSocket.accept();

    }

    public void request() throws IOException {

        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        strings = bufferedReader.readLine().split(" ");

        if (strings[0].equals("GET")) {
            acessFile = new File("www" + strings[1]);

            if (!acessFile.exists()) {
                acessFile = new File("www/404.html");
            }

            DataInputStream inputStream = new DataInputStream(new FileInputStream(acessFile));
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            outputStream.write(getHeader(acessFile).getBytes());

            byte[] buffer = new byte[(int) acessFile.length()];
            int i;
            int j = 0;
            while ((i = inputStream.read()) != -1) {
                buffer[j] = (byte) i;
                j++;
            }

            outputStream.write(buffer);

        }

    }

        public String getHeader(File acessFile){
            String[] str = acessFile.getName().split("\\.");
            if (acessFile.getName().equals("404.html")){
                return "HTTP/1.0 404 Not Found\r\n" +
                        "Content-Type: text/html; charset=UTF-8\r\n" +
                        "Content-Length: " + acessFile.length() +" \r\n" +
                        "\r\n";
            }
            if (str[1].equals("html")){
                return ("HTTP/1.0 200 Document Follows\r\n" +
                        "Content-Type: text/html; charset=UTF-8\r\n"
                        + "Content-Length: " + acessFile.length() + " \r\n" + "\r\n");
            }
            if(str[1].equals("mp4")){
                return ("HTTP/1.0 200 Document Follows\r\n" +
                        "Content-Type: video/mp4; charset=UTF-8\r\n"
                        + "Content-Length: " + acessFile.length() + " \r\n" + "\r\n");
            }
            return "HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: image/" + str[1] +" \r\n" +
                    "Content-Length: " + acessFile.length()+ " \r\n" +
                    "\r\n";
        }

    }
