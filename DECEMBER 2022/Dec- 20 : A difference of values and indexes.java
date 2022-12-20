class Solution{
    public static int maxDistance (int arr[], int n) {
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<n;i++){
            max1=Math.max(max1,arr[i]+(i+1));
            min1=Math.min(min1,arr[i]+(i+1));
            max2=Math.max(max2,arr[i]-(i+1));
            min2=Math.min(min2,arr[i]-(i+1));
        }
        return Math.max(max1-min1,max2-min2);
    }
}
