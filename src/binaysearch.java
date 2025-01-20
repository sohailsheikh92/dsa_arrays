public class binaysearch {

    public static int binarySearch(int arr[],int target){
        int n=arr.length;
        int start=0;
        int end = n-1;
        int mid = start+end/2;
        while (start<=end){
            if(target==arr[mid]){
                return mid ;
            }
            if(target<arr[mid])
                end=mid-1;
            if(target>arr[mid]){
                start=mid+1;
            }
        }

        return -1;
        //end of programmm
    }

    static int minDiff(int arr[])
    {
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        if(n==1)
            return ans;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int diff=Math.abs(arr[i]-arr[j]);
                ans=Math.min(diff,ans);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,8,12,5,18};
//        int target = 5;
//        System.out.println(binarySearch(arr,target));
        System.out.println(minDiff(arr));
    }
}



