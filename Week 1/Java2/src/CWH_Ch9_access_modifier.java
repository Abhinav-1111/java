class el{
    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public void setId(int i){
        this.id = i;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }
}

public class CWH_Ch9_access_modifier {
    public static void main(String[] args) {
        el elf = new el();

        elf.setId(45);
        elf.setName("Abhinav");

        System.out.println(elf.getId());
        System.out.println(elf.getName());
    }
}
