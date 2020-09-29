import java.util.ArrayList;
import java.util.List;

public class Equi {

    /**
     * This is a demo task.
     *
     *     An array A consisting of N integers is given. An equilibrium index of this array is any integer P such that 0 ≤ P < N and the sum of elements of lower indices is equal to the sum of elements of higher indices, i.e.
     *             A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1].
     *     Sum of zero elements is assumed to be equal to 0. This can happen if P = 0 or if P = N−1.
     *
     *     For example, consider the following array A consisting of N = 8 elements:
     *
     *     A[0] = -1
     *     A[1] =  3
     *     A[2] = -4
     *     A[3] =  5
     *     A[4] =  1
     *     A[5] = -6
     *     A[6] =  2
     *     A[7] =  1
     *     P = 1 is an equilibrium index of this array, because:
     *
     *     A[0] = −1 = A[2] + A[3] + A[4] + A[5] + A[6] + A[7]
     *     P = 3 is an equilibrium index of this array, because:
     *
     *     A[0] + A[1] + A[2] = −2 = A[4] + A[5] + A[6] + A[7]
     *     P = 7 is also an equilibrium index, because:
     *
     *     A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0
     *     and there are no elements with indices greater than 7.
     *
     *     P = 8 is not an equilibrium index, because it does not fulfill the condition 0 ≤ P < N.
     *
     *     Write a function:
     *
     *     def solution(A)
     *
     *     that, given an array A consisting of N integers, returns any of its equilibrium indices. The function should return −1 if no equilibrium index exists.
     *
     *     For example, given array A shown above, the function may return 1, 3 or 7, as explained above.
     *
     *     Write an efficient algorithm for the following assumptions:
     *
     *     N is an integer within the range [0..100,000];
     *     if N == 0, the array is equilibrium/balance because there has no left item and right item
     *
     *     each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
     */
    public static int solution(int [] A){
        List<Integer> indexArr = new ArrayList<Integer>();
        int n = A.length;
        System.out.print("length of Input Array:"+n+"\n");

        if(n > 100000 ){
            System.out.println("Array size Out of range");
            return -1;
        }

        for(int i= 0;i<n;i++){
            if(A[i]<-2147483648 || A[i]>2147483647){
                System.out.println("Value out of range");
                return -1;
            }
            int sum_left = 0;
            int sum_right = 0;
            int mm = 0;
            for(int j=0;j<i;j++){
                sum_left += A[j];
            }
            for(int k=i+1;k<n;k++){
                sum_right += A[k];
            }
            if(sum_left == sum_right){
                System.out.print(i);
                indexArr.add(Integer.valueOf(i));
            }
        }
        if(indexArr.size() == 0){
            return -1;
        }else{
            return indexArr.size();
        }
    }

    public static void main(String args[]){
        int[] A = {-214748349,0,1,2147483647};
        System.out.println(solution(A));
    }
}
