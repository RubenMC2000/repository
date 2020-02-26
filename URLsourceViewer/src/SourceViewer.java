import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class SourceViewer {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String UrlAddress = scanner.next();
        String line = "";

        try {
            URL url = new URL(UrlAddress);
            InputStream inputStream = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while(line != null){
                System.out.println(reader.readLine());
                line = reader.readLine();
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
