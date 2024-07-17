class A{
    public  int a;
    public int abhi(){
        return 5;
    }
    public void meth2(){
        System.out.println("This is method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("This is method 2 of class B");
    }
    public void method3(){
        System.out.println("This is meth 3 of class B");
    }
}

public class CWH_Ch10_method_overloading {
    public static void main(String[] args) {
//        A a = new A();
//        a.meth2();

        B b = new B();
        b.meth2();

    }
}
