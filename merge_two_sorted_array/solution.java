public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
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
}
