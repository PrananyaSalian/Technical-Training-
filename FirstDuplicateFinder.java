import java.util.HashSet;

public class FirstDuplicateFinder {
    public static int findFirstDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                return arr[i]; // Found first duplicate
            }
            seen.add(arr[i]);
        }
        return -1; // No duplicate found
    }

    public static void main(String[] args) {
        int[] numbers = {12, 9, 5, 8, 4, 5, 10};
        System.out.println("First duplicate: " + findFirstDuplicate(n
