public class arr {
    static int secLargest(int arr[]){
        int n=arr.length;
        int max=-1,secMax=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            if(arr[i]>secMax && arr[i]!=max){
                secMax=arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
//        System.out.println("alhamdulillah learned github");
        int arr[] = {1,1,1};
        System.out.println(secLargest(arr));
    }
}
