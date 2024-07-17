import javax.xml.namespace.QName;

class employee{
    int id;
    int salary;
    String name;

    public void printdetails(){
        System.out.println("MY id is is " + id);
        System.out.println("MY name is is " + name);
    }

    public int getSalary(){
        return salary;
    }
}

public class CWH_Ch8_Class {
    public static void main(String[] args) {
        System.out.println("Let's start");

        employee abhi = new employee();
        employee osho = new employee();

        abhi.id = 33;
        abhi.salary = 40;
        abhi.name = "Abhinav";

        osho.id = 69;
        osho.salary = 10;
        osho.name = "Osho";

        abhi.printdetails();
        osho.printdetails();
        int salary = osho.getSalary();
        System.out.println(salary);

//        System.out.println(abhi.id);
//        System.out.println(abhi.name);
    }
}
