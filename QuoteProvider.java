import java.util.*;

public class QuoteProvider {
    private static final Map<String, String[]> QUOTES = new HashMap<>();
    private static final Random RANDOM = new Random();

    static {
        QUOTES.put("sad", new String[]{
            "Tough times never last, but tough people do.",
            "Every day may not be good, but there is something good in every day.",
            "This too shall pass.",
            "You are stronger than you think."
        });
        QUOTES.put("happy", new String[]{
            "Happiness is not by chance, but by choice.",
            "The purpose of our lives is to be happy.",
            "Enjoy the little things in life.",
            "Smile, and let the world wonder why."
        });
        QUOTES.put("angry", new String[]{
            "For every minute you are angry you lose sixty seconds of happiness.",
            "Keep calm and carry on.",
            "Anger doesn’t solve anything. It builds nothing, but it can destroy everything.",
            "Take a deep breath and let it go."
        });
        QUOTES.put("motivated", new String[]{
            "The future depends on what you do today.",
            "Push yourself, because no one else is going to do it for you.",
            "Dream it. Wish it. Do it.",
            "Success is not for the lazy."
        });
        // Add more moods and quotes as needed
    }

    public static String getQuote(String mood) {
        String[] quotes = QUOTES.getOrDefault(mood.toLowerCase(), new String[]{
            "Stay positive and keep moving forward!",
            "Believe in yourself and all that you are.",
            "Every moment is a fresh beginning."
        });
        int idx = RANDOM.nextInt(quotes.length);
        return quotes[idx];
    }
}
