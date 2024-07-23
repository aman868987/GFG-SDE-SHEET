package Array;
import java.util.Arrays;

public class EquilibriumPoint {

    //problem link : https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1

    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if (n == 1) return 1;

        long leftSum = 0;
        long totalSum = Arrays.stream(arr).sum();

        for (int i = 0; i < n - 1; i++) {
            long rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i + 1;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        long arr[] = { 1, 3, 5, 2, 2 };
        int n = arr.length;
        System.out.println("The equilibrium point is " + equilibriumPoint(arr, n));
    }
}
