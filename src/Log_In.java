import java.util.HashMap;

public class Log_In {
    private HashMap<String,String> user_identification = new HashMap<>();

//    public Log_In() {
//        user_identification = new HashMap<>();
//    }

    public void registration(String username, String password){
        user_identification.put(username,password);
        System.out.println("You have successfully registered!");
        System.out.println("Please log in to your new account");
    }
    public void logIn(String username, String password) {
            if (user_identification.containsKey(username) && user_identification.get(username).equals(password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

}
