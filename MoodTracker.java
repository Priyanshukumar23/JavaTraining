import java.io.*;
import java.time.LocalDateTime;

public class MoodTracker {
    private User user;

    public MoodTracker(User user) {
        this.user = user;
    }

    public void recordMood(String mood) {
        try {
            File historyDir = new File("history");
            if (!historyDir.exists()) historyDir.mkdir();

            String fileName = "history/" + user.getName() + "_mood.txt";
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(LocalDateTime.now() + " - Mood: " + mood + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Could not record mood.");
        }
    }
}
