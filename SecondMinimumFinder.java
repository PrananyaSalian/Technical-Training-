public class SecondMinimumFinder {
    public static double findSecondMinimum(double[] arr) {
        double min1 = Double.MAX_VALUE; // Smallest number
        double min2 = Double.MAX_VALUE; // Second smallest number

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1; // Move old min1 to min2
                min1 = arr[i]; // Update min1
            } else if (arr[i] > min1 && arr[i] < min2) {
                min2 = arr[i]; // Update second minimum
            }
        }

        return min2; // Return second smallest element
    }

    public static void main(String[] args) {
        double[] numbers = {12.5, 9.2, 4.5, 19.5, 2.5, 56.8};
        System.out.println("Second minimum: " + findSecondMinimum(numbers));
    }
}