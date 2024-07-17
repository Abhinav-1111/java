public class CWH_Ch7_recursion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++){
                product *= i;
            }
            return product;
        }
    }

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
        int n = 7;
//        System.out.println("The value of factorial n is: " + factorial(x));
//        System.out.println("The value of factorial n is: " + factorial_iterative(x));

        for (int i=0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
