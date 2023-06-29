import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Log_In login = new Log_In();
        Scanner scanner = new Scanner(System.in);

        // Register a user
        System.out.println("Registration");
        System.out.print("Enter username: ");
        String username = scanner.nextLine().toLowerCase();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        login.registration(username, password);

        // Login
        System.out.println("\nLogin");
        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();
        login.logIn(loginUsername, loginPassword);
    }
}
