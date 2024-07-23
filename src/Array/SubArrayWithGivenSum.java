package Array;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithGivenSum {
    //problem link : https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > s && left < right) {
                sum -= arr[left];
                left++;
            }
            if (sum == s) {
                result.add(left + 1);
                result.add(right + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int s = 0;
        ArrayList<Integer> result = subarraySum(arr, n, s);
        System.out.println(result);
    }
}
