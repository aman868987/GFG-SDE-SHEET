package Array;

public class AlternatelyArray {
    //problem link : https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1

    public static void rearrange(long arr[], int n){

        int maxIdx = n - 1;
        int minIdx = 0;
        long maxElement = arr[maxIdx] + 1; // Store a number greater than the maximum element of the array

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Encode maximum element at even index
                arr[i] += (arr[maxIdx] % maxElement) * maxElement;
                maxIdx--;
            } else {
                // Encode minimum element at odd index
                arr[i] += (arr[minIdx] % maxElement) * maxElement;
                minIdx++;
            }
        }

        // Retrieve new values by dividing with maxElement
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElement;
        }
    }

    public static void main(String[] args) {
        long arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        rearrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
