package Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LeadersInArray {

    //problem link : https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();

        int currMax = arr[n-1];

        for(int i = n-1; i >= 0; i--){
            if(arr[i] >= currMax){
                result.add(arr[i]);
                currMax = arr[i];
            }
        }
        //reverse the array.
//        int left = 0;
//        int right = result.size() - 1;
//        while (left < right) {
//            // Swap elements
//            Integer temp = result.get(left);
//            result.set(left, result.get(right));
//            result.set(right, temp);
//            left++;
//            right--;
//        }
//        return result;

         return (ArrayList<Integer>) result.stream()
                             .sorted(Comparator.reverseOrder())
                             .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        ArrayList<Integer> result = leaders(n, arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
