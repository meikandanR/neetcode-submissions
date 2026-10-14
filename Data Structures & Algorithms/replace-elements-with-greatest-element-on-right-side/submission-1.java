class Solution {
    public int[] replaceElements(int[] arr) { 
        // int res[] = arr;
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int l = i+1;
            int max = 0 ;
            while(l<=n-1){
                max = Math.max(arr[l],max);
                l++;
            }
            arr[i] = max;

        }

        arr[n-1] = -1;
        
        return arr;
    }
}