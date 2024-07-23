package Array;

public class ZigZag {

    //problem link : https://www.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1

    public static void zigZag(int arr[], int n) {
        int flag = 0;
        for(int i = 0; i < n -1; i++) {
            if(flag == 0) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                flag = 1;
            } else {
                if(arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                flag = 0;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        zigZag(arr, arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
