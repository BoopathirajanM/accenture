import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MaximumDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        Map<Integer, Integer> counts = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            int element = scanner.nextInt();
            counts.put(element, counts.getOrDefault(element, 0) + 1);
        }

        long maxDifference = 0;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            if (frequency == 1) {
                maxDifference += Math.abs((long)element);
            } 
        }

        System.out.println("Maximum Difference = " + maxDifference);

        scanner.close();
    }
}
