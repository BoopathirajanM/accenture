import java.util.Scanner;
import java.util.Arrays;

public class MaximumDifference2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        
        long maxDifference = 0;
        int i = 0;
        
        while (i < N) {
            int currentElement = arr[i];
            
            boolean isDuplicate = (i + 1 < N) && (arr[i + 1] == currentElement);
            
            if (isDuplicate) {
                i += 2;
            } else {
                maxDifference += Math.abs((long)currentElement);
                i += 1;
            }
        }

        System.out.println("Maximum Difference = " + maxDifference);

        scanner.close();
    }
}