import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🧠 Welcome to the Mental Health Assistant!");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        User user = new User(name);
        Assistant assistant = new Assistant(user);

        System.out.print("How are you feeling today? (e.g., sad, anxious, tired): ");
        String mood = sc.nextLine();

        assistant.processMood(mood);
        sc.close();
    }
}
