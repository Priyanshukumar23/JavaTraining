import java.util.*;

public class CalmActivity {
    private static final Map<String, String[]> ACTIVITIES = new HashMap<>();
    private static final Random RANDOM = new Random();

    static {
        ACTIVITIES.put("sad", new String[]{
            "Take a gentle walk in nature.",
            "Listen to your favorite calming music.",
            "Write your feelings in a journal.",
            "Try a guided meditation session."
        });
        ACTIVITIES.put("happy", new String[]{
            "Share your happiness with a friend.",
            "Dance to your favorite upbeat song.",
            "Go outside and enjoy the sunshine.",
            "Make a gratitude list."
        });
        ACTIVITIES.put("angry", new String[]{
            "Practice deep breathing for 5 minutes.",
            "Do some light stretching or yoga.",
            "Take a break and drink a glass of water.",
            "Write down what's making you angry, then tear up the paper."
        });
        ACTIVITIES.put("anxious", new String[]{
            "Try progressive muscle relaxation.",
            "Focus on slow, deep breaths.",
            "Color or draw something simple.",
            "Watch a calming video or listen to nature sounds."
        });
        ACTIVITIES.put("depressed", new String[]{
            "Try a simple breathing exercise.",
            "Write down three things you are grateful for.",
            "Reach out to a close friend or family member.",
            "Take a warm shower and relax."
        });
        // Add more moods and activities as needed
    }

    public static String suggestActivity(String mood) {
        if (mood.equalsIgnoreCase("depressed")) {
            breathingExercise();
            return "You just completed a calming breathing exercise.";
        }
        String[] activities = ACTIVITIES.getOrDefault(mood.toLowerCase(), new String[]{
            "Take a deep breath and go for a short walk.",
            "Sit quietly and focus on your breathing.",
            "Drink a glass of water and stretch your body."
        });
        int idx = RANDOM.nextInt(activities.length);
        return activities[idx];
    }

    private static void breathingExercise() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Round " + i + ": Breathe in...");
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Round " + i + ": Breathe out...");
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
