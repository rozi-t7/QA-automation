import java.util.Scanner;

public class UserHobby {
    public static void main(String[] args) {
        System.out.println("Type your first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Type your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Type your hobby: ");
        String hobby = scanner.nextLine();
        System.out.println("Your name is: " + firstName + lastName);
        System.out.println("Your hobby is: " + hobby);

    }
}
