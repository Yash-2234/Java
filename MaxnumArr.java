public class MaxnumArr {

    public static int findMax(int[] n) {
        if (n == null || n.length == 0) { // Handle empty or null arrays
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = n[0];

        for (int num : n) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] n = {125, 132, 95, 116, 110};

        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println(); // Print newline for clarity

        System.out.println("Max value: " + findMax(n));
    }
}
