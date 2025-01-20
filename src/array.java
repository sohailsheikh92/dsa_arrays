public class array {

    //left rotate an array one
    static void leftRot1(int arr[]){
        int n= arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }


    //left rotate an array by d places
    static void leftRotbyd(int arr[],int d){
        int n=arr.length;
        d = d%n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
    }

    static void rev(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void leaders(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean flag =false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag==false)
                System.out.print(arr[i]+" ");
        }
    }

    static void leaders_efficient(int arr[]){
        int n=arr.length;
        int curr_lead = arr[n-1];
        System.out.print(curr_lead+" ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>curr_lead){
                curr_lead = arr[i];
                System.out.print(curr_lead+" ");
            }
        }
    }


    //max difference
    static int maxDiff(int arr[]){
        int n=arr.length;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff=arr[j]-arr[i];
                if(res<diff)
                    res=diff;
            }
        }
        return res;
    }

    public static int rem(int arr[]){
        int size=1;
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            if(arr[i]!=arr[i-1]){
                size++;
            }
        }
        return size;
    }

    static int maxSubarr(int arr[]){
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i;j<n;j++){
                cnt+=arr[j];
            }
            res=Math.max(res,cnt);
        }
        return res;
    }

    static int kadane(int arr[]){
        int n=arr.length;
        int curr=arr[0];
        int res=0;
        for(int i=1;i<n;i++){
            curr=Math.max(arr[i],curr+arr[i]);
            res=Math.max(curr,res);
        }
        return res;
    }

    static int evenOdd(int arr[]){
        int n=arr.length;
        int res=1;int cnt=1;
        for(int i=0;i<n-1;i++){
            if((arr[i]%2==0 && arr[i+1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0)){
                cnt++;
                res=Math.max(res,cnt);
            }
            else
                cnt=1;
        }
        return res;
    }

    //Max Element
    static int maxElement(int arr[]){
        int n=arr.length;
        int res=-1;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j])
                    cnt++;
            }
            if(cnt>n/2){
                if(res<cnt)
                    res=i;
            }
        }
        return res;
    }

    static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_idx]>arr[j])
                    min_idx=j;
            }
            int temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }
    }

    static int[] mergetwosortedarr(int a[],int b[]){
        int m=a.length,n=b.length;
        int ans[]=new int[m+n];
        if(n>=m){
            int i=0;
            while(i<m){
                if(a[i]<b[i])
                    ans[i]=a[i];
                else
                    ans[i]=b[i];
                i++;
            }
            for(int j=i;j<n;j++)
                ans[i]=b[i];
        }
        else{
            int k=0;
            while(k<n){
                if(a[k]<b[k])
                    ans[k]=a[k];
                else
                    ans[k]=b[k];
                k++;
            }
            for(int l=k;l<n;l++)
                ans[l]=a[l];
        }
        return ans;
    }

    static int[] mergeFunction(int arr[],int low,int high,int mid){
        int n=arr.length;
        int ans[]=new int[n];
        int j=mid+1;
        int k=0;
        while(low<=mid && j<=high){
            if(arr[low]<arr[j]){
                ans[k++]=arr[low++];
            }else{
                ans[k++]=arr[j++];
            }
        }
        while(low<=mid)
                ans[k++]=arr[low++];
        while(j<=high)
                ans[k++]=arr[j++];
        return ans;
    }

    //selection sort
    static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j<=i+1;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }


    }

    //lomuto Partition
    static int lomuto(int arr[],int low,int high){
        int pivot=arr.length-1;
        int i=-1;
        for(int j=0;j<arr.length-1;i++){
            if(arr[j]<arr[pivot]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[pivot];
        arr[pivot]=temp;

        return i+1;
    }

    //Quick Sort
    static void qSort(int arr[],int low,int high){
        if(low<high){
            int p=lomuto(arr,low,high);
            qSort(arr,low,p-1);
            qSort(arr,p+1,high);
        }
    }


    public static void main(String[] args) {
//        System.out.println("Sohail");

        //left rotate an array by d places
//        int arr[] = {1,2,3,4,5,6,7};
//        int d = 4;
//        leftRotbyd(arr,d);
//        for(int i : arr)
//            System.out.print(i +" ");

        //leaders in a array
//        int arr[] = {7,10,4,10,6,5,2};
//        leaders_efficient(arr);

        //max difference
//        int arr[] = {10,20,20};
//        System.out.println(rem(arr));

        //max sum subarray
//        int arr[]={2,3,-8,7,-1,2,3};
//        System.out.println(kadane(arr));

        //longest even odd subarray
//        int arr[]={10,12,8,4};
//        System.out.println(evenOdd(arr));

        //max Element
//        int arr[] = {20,30,40,50,50,50,50};
//        System.out.println(maxElement(arr));

        //bubble sort
//        int arr[]={50,40,30,20,10};
//        insertionSort(arr);
//        for(int i : arr)
//            System.out.print(i+" ");

        //merge two sorted arr
//        int a[]={10,15,20};
//        int b[]={5,6,6,15};
//        System.out.println(mergetwosortedarr(a,b));

        //merge function of two arr
//        int arr[]={5,8,12,14,7};
//        int low=0,mid=3,high=4;
//        int[] anns=mergeFunction(arr,low,high,mid);
//        for(int i : anns)
//            System.out.print(i+" ");

        //selection  sort
//        int arr[]={10,5,8,20,18};
//        selectionsort(arr);
//        for (int i:arr) {
//            System.out.print(i + " ");
//        }

        //quickSort
        int arr[]={8,4,7,9,3,10,5};
        int low=0,high=arr.length-1;
        qSort(arr,low,high);
        for (int k:
             arr) {
            System.out.print(k+" ");
        }

    }
}
