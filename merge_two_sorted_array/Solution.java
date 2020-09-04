public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public static int[] mergeSortedArray(int[] A, int[] B) {
        int []C = new int[A.length + B.length];
        int i = 0;
        int j = 0;
        int indexOfc = 0;
        while( i < A.length && j < B.length){
            C[indexOfc++] = (A[i] < B[j])?A[i++]:B[j++];
        }

        while( i < A.length){
            C[indexOfc++] = A[i++];
        }

        while( j < B.length){
            C[indexOfc++] = B[j++];
        }

        // write your code here
        return C;
    }

    public static void main(String args[]){
        int [] a = new int []{1,2,4,6,8};
        int [] b = new int []{2,6,7,10};
        int [] c = mergeSortedArray(a,b);
        for(int i = 0; i<c.length; i++){
            System.out.print(c[i] + " ");
        }
    }

}
