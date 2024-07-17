public class CWH_Ch6_Arrays {
    public static void main(String[] args) {
//        int [] marks = new int[5];
//        marks[0] = 22;
//        marks[1] = 42;
//        marks[2] = 52;
//        marks[3] = 82;
//        marks[4] = 92;

         int [] marks = {34,45,67,86,98};
//        float [] marks = {34.6f,45.4f,67.3f,86.5f,98.3f};
//        System.out.println(marks.length);
//        System.out.println(marks[4]);

//        String [] students = {"Abhinav", "Rohit", "Akash", "Swaraj"};
//        System.out.println(students.length);
//        System.out.println(students[2]);

        for (int i=0; i<marks.length; i++ ){
            System.out.println(marks[i]);
        }

        System.out.println("In reverse order");
        for (int i=marks.length - 1; i>=0; i-- ){
            System.out.println(marks[i]);
        }

        System.out.println("Printing using for each loop : ");
        for (int element: marks){
            System.out.println(element);
        }

    }
}