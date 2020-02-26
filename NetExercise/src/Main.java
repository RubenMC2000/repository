import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    public static String address;
    public static int portNumber;

    public void inputTerminal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your address: ");
        address = scanner.next();
        System.out.println("Enter port Number: ");
        portNumber = scanner.nextInt();
    }

    public void getAddress() throws UnknownHostException {
        System.out.println("This address IP is: " + InetAddress.getByName(address).getHostAddress());

    }

    public void isReachable(int time) throws IOException {
        System.out.println("Is reachable: " + InetAddress.getByName(address).isReachable(time));
    }



    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.inputTerminal();
        main.getAddress();
        main.isReachable(1000);


    }


}
