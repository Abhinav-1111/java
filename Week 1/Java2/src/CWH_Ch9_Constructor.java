class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        name = "Halo";
        id = 45;
    }
    public MyMainEmployee(String myName, int myId){
        name = myName;
        id = myId;
    }
    public MyMainEmployee(String nyName){
        name = nyName;
        id = 71;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}

public class CWH_Ch9_Constructor {
    public static void main(String[] args) {
        MyMainEmployee abhinav = new MyMainEmployee("abhi", 23);

        System.out.println(abhinav.getId());
        System.out.println(abhinav.getName());
    }
}
