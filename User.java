import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<String> moodHistory = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addMoodToHistory(String mood) {
        moodHistory.add(mood);
    }

    public List<String> getMoodHistory() {
        return moodHistory;
    }
}
