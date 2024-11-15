class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        if(n < 2) { // 2nd largest value not possible
            return -1;
        }
        for(int i=0; i<n; i++){
            // condition 1
            if(arr[i] > max) {
                result = max;
                max = arr[i];
            }
            // condition 2
            else if(arr[i] > result && arr[i] < max) {
                result = arr[i];
            }
        }
        return (result == Integer.MIN_VALUE) ? -1 : result;
    }
}

// TC = O(n)
// SC = O(1)
