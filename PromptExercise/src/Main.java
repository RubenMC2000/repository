import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("//========================================//\r\n" +
                "Welcome to my first Prompt-View Experience!!\r\n" +
                "//========================================//\r\n");

        Main main = new Main();
    }

    private Prompt prompt = new Prompt(System.in, System.out);
    private HashMap<String, String> users = new HashMap<>();
    private String username;
    private String password;
    private boolean login = false;

    public Main(){
        menu();
    }

    public void usernameQuestion(){
        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("Username: ");
        username = prompt.getUserInput(question1);
    }

    public void passwordQuestion(){
        PasswordInputScanner question2 = new PasswordInputScanner();
        question2.setMessage("Password: ");
        password = prompt.getUserInput(question2);
    }

    public void checkCredentials() {
        while (!login) {
            if (users.containsKey(username) && users.get(username).equals(password)) {
                    System.out.println("Login Successful!\r\nWelcome home, " + username);
                    login = true;
                } else {
                    System.out.println("Username and/or Password is/are Wrong!!!");
                    usernameQuestion();
                    passwordQuestion();
            }
        }
    }

    public void createUser(){
        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("New Username: ");
        String userName = prompt.getUserInput(question1);

        PasswordInputScanner question2 = new PasswordInputScanner();
        question2.setMessage("New Password: ");
        String passWord = prompt.getUserInput(question2);

        users.put(userName, passWord);

    }

    public void menu() {
        String[] options = {"Sign in", "Log in"};
        while (!login) {
            MenuInputScanner menu = new MenuInputScanner(options);
            menu.setMessage("Do you want to sign in or log in");
            int answer = prompt.getUserInput(menu);

            if (options[answer - 1].equals("Sign in")) {
                createUser();
            } else {
                usernameQuestion();
                passwordQuestion();
                checkCredentials();
            }
        }
    }


}
