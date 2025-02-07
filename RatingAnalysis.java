import java.util.HashMap; // Import HashMap to count occurrences

public class RatingAnalysis {
    public static int findMostFrequentRating(int[] ratings) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        
        // Count occurrences of each rating
        for (int i = 0; i < ratings.length; i++) { 
            int rating = ratings[i]; // Get current rating
            if (frequency.containsKey(rating)) {
                int count = frequency.get(rating);
                frequency.put(rating, count + 1);
            } else {
                frequency.put(rating, 1);
            }
        }
        
        int maxFreq = 0;
        int mostFrequent = ratings[0]; // Assume first rating is most frequent
        
        // Find the most frequent rating
        for (int i = 0; i < ratings.length; i++) { 
            int rating = ratings[i];
            if (frequency.get(rating) > maxFreq) { // Check if this rating has max frequency
                maxFreq = frequency.get(rating);
                mostFrequent = rating;
            }
        }

        return mostFrequent; // Return the most frequent rating
    }

    public static void main(String[] args) {
        int[] ratings = {4, 5, 3, 5, 2, 4, 5, 4}; // Sample input
        int mostFrequent = findMostFrequentRating(ratings);
        System.out.println("The most frequent rating is: " + mostFrequent);
    }
}
