class employes{
    String name;
    int salary;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    public int getSalary(){
        return salary;
    }
}

public class CWH_Ch8_Ps_Q1 {
    public static void main(String[] args) {
        employes abhi = new employes();
        abhi.name = "Abhinav";
        abhi.salary = 40;
        abhi.setName("Obhinav");

        System.out.println(abhi.getName());
        System.out.println(abhi.getSalary());
    }
}
