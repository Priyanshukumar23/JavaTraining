import java.util.List;

public class Assistant {
    private User user;

    public Assistant(User user) {
        this.user = user;
    }

    public void processMood(String mood) {
        user.addMoodToHistory(mood);

        String quote = QuoteProvider.getQuote(mood);
        String activity = CalmActivity.suggestActivity(mood);
        

        System.out.println("\nHi " + user.getName() + ", here's something for you:");
        System.out.println("💬 Quote: " + quote);
        System.out.println("🧘‍♀️ Activity: " + activity);
    }

    public void showMoodHistory() {
        List<String> history = user.getMoodHistory();
        if (history.isEmpty()) {
            System.out.println("No mood history available.");
        } else {
            System.out.println("Mood History:");
            for (String mood : history) {
                System.out.println("- " + mood);
            }
        }
    }
}
