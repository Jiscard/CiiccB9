public class Task8 {
     static int[] cumulativeSums(int... numbers) {
        int[] results = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            int sum = 0;

            // Calculate 1 + 2 + ... + n
            for (int j = 1; j <= n; j++) {
                sum += j;
            }

            results[i] = sum;
        }

        return results;
    }
    public static void main(String[] args) {
        int[] output = cumulativeSums(4, 5, 10);

        System.out.println("Cumulative sums:");
        for (int val : output) {
            System.out.println(val);
        }

    }
}
