import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Log_In login = new Log_In();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1.Register");
            System.out.println("2.Log In");
            System.out.println("3.Log Out");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice){
                case 1:
                    System.out.println("Registration");
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    login.registration(username, password);

                    System.out.println("\nLog In");
                    System.out.print("Enter username: ");
             username = scanner.nextLine();
                    System.out.print("Enter password: ");
                  password = scanner.nextLine();
                    login.logInUser(username, password);

                    break;
                case 2:
                    System.out.println("\nLog In");
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    login.logInUser(username,password);
                    break;
                    case 3:
                        System.out.println("Log Out");
                        System.out.println("Enter username: ");
                        String logoutUsername = scanner.nextLine();
                        login.LogOut(logoutUsername);
                        break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.Please try again!");

            }  break;


        }
        Posts post1 = new Posts("albinagrajqevci","",PostType.TEXT);
        Posts post2 = new Posts("dalinaelshani", "",PostType.IMAGE);
        Posts post3 = new Posts("eronagashi", "",PostType.IMAGE);
        Posts post4 = new Posts("deaosmanaj", "",PostType.IMAGE);
        System.out.println(post1);
        System.out.println(post2);
        System.out.println(post3);
        System.out.println(post4);




        Comments postComments = new Comments();
        // Add comments to the post
        postComments.addComment("Great post!");
        postComments.addComment("I totally agree with you.");
        postComments.addComment("Could you provide more details?");

        // Retrieve and print the comments
        List<String> comments = postComments.getComments();
        System.out.println("Comments:");
        for (String comment : comments) {
            System.out.println(comment);
        }


    }





}
