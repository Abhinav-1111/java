public class CWH_Ch7_Ps_Q5 {
    static int fibonacci(int n){
        if (n==0 ){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else {
            return fibonacci(n-2)+fibonacci(n-1);
        }
    }

    public static void main(String[] args) {
        int n=7;
        for (int i=0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
