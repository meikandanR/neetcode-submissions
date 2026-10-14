class Solution {
    public int[] replaceElements(int[] arr) { 
        int res[] = arr;
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int l = i+1;
            int r = n-1;
            int max = 0 ;
            while(l<=r){
                max = Math.max(arr[l],max);
                l++;
            }
            res[i] = max;

        }

        res[n-1] = -1;
        
        return res;
    }
}