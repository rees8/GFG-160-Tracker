class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0; // tracks position to place the non-zero element
        for(int i=0; i<n; i++) {
            if(arr[i] != 0) { // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++; // increment non-zero index
            }
        }
    }
}
