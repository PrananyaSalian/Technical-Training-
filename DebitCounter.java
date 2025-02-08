public class DebitCounter {
    public static int countDebits(int[] transactions) {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 1000) { // Assuming debit means transaction < 1000
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] transactions = {900, 1500, 600, 1200, 400};
        System.out.println("Number of debits: " + countDebits(transactions));
    }
}