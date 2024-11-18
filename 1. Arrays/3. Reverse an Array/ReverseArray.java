class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}

// TC = O(n)
// SC = O(1)
