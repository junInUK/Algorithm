import java.util.ArrayList;
import java.util.List;

public class MinPositiveNumber1 {

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

    public static int solution(int[] A){
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<A.length;i++)
        {
            if(A[i] > 0){
                arr.add(Integer.valueOf(A[i]));
            }
        }
        int[] afterClean = new int[arr.size()];
        int i=0;
        for(Integer item : arr)
        {
            afterClean[i++] = item.intValue();
        }
        for(int j = 0;j<afterClean.length;j++)
        {
            System.out.print(afterClean[j] + " ");
        }
        System.out.println("++++++++++++");
        A = new int[afterClean.length];
        for(int k=0;k<afterClean.length;k++)
        {
            A[k] = afterClean[k];
        }
        for(int j = 0;j<afterClean.length;j++)
        {
            System.out.print(A[j] + " ");
        }
        System.out.println("+++++++++++++++++");
        quickSort(0,A.length-1);
//        for(int m =0 ;m<A.length;m++)
//        {
//            System.out.print(A[m] + " ");
//        }
        return 0;
    }

    public static void main(String args[]){
        int [] initArr = {-1,0,1,3,6,4,1,2};
        solution(initArr);
    }
}
