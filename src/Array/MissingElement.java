package Array;

public class MissingElement {
    //problem link : https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int sumOfn = n * (n+1)/2;
        int sumArr = 0;

        for(int i : arr){
            sumArr += i;
        }
        return sumOfn - sumArr;
    }

    public static void main(String[] args) {

        int n = 10;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        System.out.println(new MissingElement().missingNumber(n, arr));
    }
}
