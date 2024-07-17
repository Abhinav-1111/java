class Base1{

    Base1() {
        System.out.println("This is base class constructor");
    }
    Base1(int x) {
        System.out.println("This is overloading base class constructor with value: " + x);
    }
}

class Derived1 extends Base1{

    Derived1(){
        //super(5);
        System.out.println("This is derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("This is derived class constructor overloadin with value :" +  y);
    }
}

class childDerived1 extends Derived1{
    childDerived1() {
        System.out.println("This is child  of Derived constructor ");
    }
    childDerived1(int x, int y, int z){
        super(x,y);
        System.out.println("The value of z is : " + z);
    }
}

public class CWH_Ch10_constructor_in_inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(4,6);
        //childDerived1 d = new childDerived1();
        childDerived1 d = new childDerived1(4,6,7);

    }
}
