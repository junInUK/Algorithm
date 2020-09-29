public class MinPositiveNumber {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        final int N = 100000;
        int flag = 0;
        for(int i=1;i<N;i++){
            for(int j = 0;j<A.length;j++){
                if(i == A[j]){
                    flag = 1;   //  found
                    break;
                }
            }
            if(0 == flag){
                return i;
            }
            flag = 0;
        }
        return 0;
    }

    public static void main(String args[]){
        int [] A = {1,3,6,4,1,2};
        System.out.println(solution(A));
    }
}
