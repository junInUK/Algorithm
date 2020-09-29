/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 *
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 *
 * Write a function:
 *
 * class Solution { public int solution(int N); }
 *
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 *
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..2,147,483,647].
 */


public class BinaryGap {

    public static int solution(int N){
        String binaryStr = transBinary(N);
        System.out.println("Decimal Number:" + N);
        System.out.println("Binary String:" + binaryStr + "\n");

        char[] chArr = binaryStr.toCharArray();
        int i=0;
        int flag = 0;
        int count = 0;
        int maxCount = 0;
        while(i<chArr.length){
//            System.out.print(chArr[i]);
            int value = chArr[i] -48;
            if(1 == value && 0 == flag){
                flag = 1;
                i++;
                continue;
            }
            if(0 == value && 1 == flag ){
                count ++;
                i++;
                continue;
            }
            if(1 == value && 1 == flag){
                if( count > maxCount){
                    maxCount = count;
                }
                count = 0;
            }
            i++;
        }
//        for(int i=0;i<chArr.length;i++){
//            if(1 == chArr[i] ){
//
//            }
//        }
        return maxCount;
    }

    public static String transBinary(int N){
        return Integer.toBinaryString(N);
    }


    public static void main(String args[]){
        System.out.print(solution(2147483647));
        /**
         * 1
         * 5
         * 6
         * 9
         * 16
         * 529
         * 20
         * 15
         * 32
         * 1041
         * 1089
         * 1091
         * 51712
         * 1610612737
         * 2147483647
         */
    }


}
