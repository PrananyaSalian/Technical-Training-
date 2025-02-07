public class SalesAnalysis {
    public static int findHighestSalesDay(int[] sales) {
        int maxSale = sales[0]; // Start by assuming first day's sales are the highest
        int maxDay = 1; // Since days are 1-based, start with 1

        for (int i = 0; i < sales.length; i++) { // Loop through the array
            if (sales[i] > maxSale) { // If we find a bigger number
                maxSale = sales[i]; // Update max sale
                maxDay = i + 1; // Store the day (1-based index)
            }
        }

        return maxDay; // Return the day with the highest sales
    }

    public static void main(String[] args) {
        int[] sales = {500, 700, 800, 600, 800, 750}; // Sample input
        int highestDay = findHighestSalesDay(sales);
        System.out.println("The day with the highest sales is: " + highestDay);
    }
}

