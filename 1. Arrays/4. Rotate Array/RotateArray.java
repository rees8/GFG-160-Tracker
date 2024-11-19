class Solution {
    static void reverse(int[] arr, int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d%n;
        reverse(arr, 0, d-1); // reverse 1st half
        reverse(arr, d, n-1); // reverse 2nd half
        reverse(arr, 0, n-1); // reverse entire array
    }
}

// TC = O(n)
// SC = O(1)
