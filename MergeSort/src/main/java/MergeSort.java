public class MergeSort {

    public static void mergeSort(int[] arr) {
        //  use Non-recursive
        int len = arr.length;
        int k = 1;
        while (k < len) {
            mergePass(arr, k, len);
            k *= 2;
        }
    }

    //
    public static void mergePass(int []arr, int k, int n)
    {
        int i = 0;
        int j;

        //from front to back, merge two k size array to one array
        while(i<n-2*k +1)
        {
            merge(arr, i, i+k-1,i+2*k-1);
            i += 2*k;
        }
        if(i<n-k)
        {
            merge(arr,i,i+k-1,n-1);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high)
    {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        for(; i<= mid && j<=high; k++)
        {
            if(arr[i]<arr[i])
                temp[k] = arr[i++];
            else
                temp[k] = arr[j++];
        }

        while(i <= mid)
            temp[k++] = arr[i++];

        while(j <= high)
            temp[k++] = arr[j++];

        for(int l = 0; l < temp.length; l++)
            arr[low + l] = temp[l];
    }

    public static void main(String args[]){
        int A[] = { 4,-5,0,5,-3,2,0};
        mergeSort(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+ " ");
        }
    }


}
