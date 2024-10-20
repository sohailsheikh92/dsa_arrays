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
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target = 5;
        System.out.println(binarySearch(arr,target));
    }
}



