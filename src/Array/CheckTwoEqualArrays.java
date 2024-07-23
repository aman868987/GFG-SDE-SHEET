package Array;

import java.util.HashMap;
import java.util.Map;

public class CheckTwoEqualArrays {
    //problem : https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1

    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr1.length; i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }
        //loop on map
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 != 0){
                return false;
            }
        }
        return true;
    }
    //main calling method
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 5, 4, 0 };
        int[] arr2 = { 2, 4, 5, 0, 1 };
        System.out.println(check(arr1, arr2));
    }
}
