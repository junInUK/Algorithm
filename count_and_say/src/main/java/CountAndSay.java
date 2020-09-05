/**
 * 420. Count and Say
 * 中文English
 * The count-and-say sequence is the sequence of integers beginning as follows:
 *
 * 1, 11, 21, 1211, 111221, ...
 *
 * 1 is read off as "one 1" or 11.
 *
 * 11 is read off as "two 1s" or 21.
 *
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n, generate the nth sequence.
 *
 * Example
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 * Example 2:
 *
 * Input: 5
 * Output: "111221"
 * Notice
 * The sequence of integers will be represented as a string.
 */
public class CountAndSay {

    public static void main(String args[]){
        System.out.println("Hello Count And Say");
        System.out.println(countAndSay(11));
    }

    public static String countAndSay(int n){
        StringBuffer outputBuf = new StringBuffer();
        String output;
        if(n == 1){
            output = "1";
            return output;
        }else if(n == 2){
            output = "11";
            return output;
        }else{

            String str = countAndSay(n-1);
            char []charArr = str.toCharArray();

            int number = charArr[0] - 48;
            int count = 1;
            int i = 1;
            while(i<charArr.length){
                if(charArr[i] == charArr[i-1]){  //  if current value was the same with the last one
                    count ++;
                }else{
                    outputBuf.append(Integer.toString(count));
                    outputBuf.append(Integer.toString(number));
                    number = charArr[i] -48;
                    count = 1;
                }
                i++;
            }
            outputBuf.append(Integer.toString(count));
            outputBuf.append(Integer.toString(number));
            output = outputBuf.toString();
            return output;
        }
    }
}
