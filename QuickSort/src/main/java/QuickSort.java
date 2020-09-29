public class QuickSort {

    private static int[] A;

    public static void quickSort(int left, int right)
    {
        /**
         *  partition is the middle base, after switch, all the item on the left
         *  will less than this base, all the item on the right will great than this base
         */
        int i,j,t,partition;
        if(left>right)
            return;

        partition = A[left];
        /**
         * i and j are left right index, i will move to the right, and j will move to the left
         * until they meet
         */
        i = left;
        j = right;
        while(i!=j)
        {
            //  find an item which is less than partition, should switch this item
            while(A[j]>=partition && i<j)
                j--;
            //  find an item which is great than partition, should switch this item
            while(A[i]<=partition && i<j)
                i++;
            //  if partition are the smallest item, do not need switch
            if(i<j)
            {
                t = A[i];
                A[i] = A[j];
                A[j] =t;
            }
        }
        A[left] = A[i];
        A[i] = partition;

        quickSort(left, i-1);
        quickSort(i+1,right);

    }

    public static void main(String args[])
    {
        A = new int[]{-7, 0, -4, 3, 2, 9, 7};
        quickSort(0,A.length-1);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }

        /**
         * test case
         * {-7, 0, -4, 3, 2, 9, 7}
         * {-4, 0, -7, 3, 2, 9, 7}
         */
    }

}
