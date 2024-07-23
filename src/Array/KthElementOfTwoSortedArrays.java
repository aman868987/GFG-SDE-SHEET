package Array;

public class KthElementOfTwoSortedArrays {
    //problem : https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int i = 0;
        int j = 0;
        int x = 0;

        while (i < n && j < m) {
            x++;
            if (arr1[i] < arr2[j]) {
                if (x == k) {
                    return arr1[i];
                }
                i++;
            } else {
                if (x == k) {
                    return arr2[j];
                }
                j++;
            }

        }
        while (i < n) {
            x++;
            if (x == k) {
                return arr1[i];
            }
            i++;
        }
        while (j < m) {
            x++;
            if (x == k) {
                return arr2[j];
            }
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 6, 7, 9 };
        int arr2[] = { 1, 4, 8, 10 };
        int n = arr1.length;
        int m = arr2.length;
        int k = 5;
        System.out.println(new KthElementOfTwoSortedArrays().kthElement(arr1, arr2, n, m, k));
    }
}
