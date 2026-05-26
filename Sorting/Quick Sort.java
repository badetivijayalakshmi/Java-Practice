class Quicksort{
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int  i = low-1;
        
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;//correct position of pivot
    }
    public static void qS(int arr[],int low,int high){
        if (low<high){
            int pidx = partition(arr,low,high);
            qS(arr,low,pidx-1);
            qS(arr,pidx+1,high);
        }
    
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        qS(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
//o/p-2 3 5 6 8 9 
