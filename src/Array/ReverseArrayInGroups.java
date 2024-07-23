package Array;

import java.util.ArrayList;

public class ReverseArrayInGroups {

    //problem link :  https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here

        for (int i = 0; i < n; i += k) {
            int left = i;
            // To handle the case when the sub-array size is less than K
            int right = Math.min(i + k - 1, n - 1);

            // Reverse the sublist in place
            while (left < right) {
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        ReverseArrayInGroups ob = new ReverseArrayInGroups();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        ob.reverseInGroups(arr, 10, 3);
        System.out.println(arr);
    }

}