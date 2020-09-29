public class FibonacciSequence {

    public static int fab(int n){
        if(n < 1){
            return -1;
        }
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fab(n-1) + fab(n-2);
        }
    }

    public static void main(String args[]){
        System.out.println(fab(5));
    }
}
