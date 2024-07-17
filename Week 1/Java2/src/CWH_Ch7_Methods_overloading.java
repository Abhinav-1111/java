public class CWH_Ch7_Methods_overloading {
    static void joke(){
        System.out.println("I invented new jokes.");
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 90;
    }

    static void foo(){
        System.out.println("This is one");
    }
    static void foo(int a){
        System.out.println("This is "+ a + " one");
    }

    static void foo(int a, int b){
        System.out.println("This is "+ a + " one");
        System.out.println("This is "+ b + " one");
    }

    public static void main(String[] args) {
        // joke();

        // case 1: Changing the integer.
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is: "+ x);

        // case 2: changing the array
//        int [] marks = {45,66,77,88,99};
//        change2(marks);
//        System.out.println("The value of x after running change is: " + marks[0]);

        foo();
        foo(3000);
        foo(3000, 5000);
    }
}
