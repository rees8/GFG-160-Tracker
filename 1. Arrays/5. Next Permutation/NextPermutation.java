class Solution {
    // reverse function
    void reverse(int[] arr, int start) {
        int n = arr.length;
        for(int i=start; i<(n+start)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i+start];
            arr[n-1-i+start] = temp;
        }
    }
    
    void nextPermutation(int[] arr) {
        int n = arr.length;
        // find the breakpoint
        int index = -1;
        for(int i=n-2; i>=0; i--) {
            if(arr[i] < arr[i+1]) {
                index = i;
                break;
            }
        }
        // if breakpoint doesn't exist
        if(index == -1) {
            reverse(arr, 0);
            return;
        }
        // iterarte from end. when the first element > breakpoint found -> swap
        for(int i=n-1; i>index; i--) {
            if(arr[i] > arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        // since it is a permutation, remaining part (from ind+1 to n) would already be in descending order. Hence, simply reverse it.
        reverse(arr, index+1);
    }
}

// TC = O(n)
// SC = O(1)
