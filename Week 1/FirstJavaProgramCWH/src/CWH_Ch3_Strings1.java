import java.util.Scanner;

public class CWH_Ch3_Strings1 {
    public static void main(String[] args) {
        String name = "Abhinav";
//        int value = name.length();
//        System.out.println(value);
//
//        String lscase = name.toLowerCase();
//        System.out.println(lscase);
//
//        String upcase = name.toUpperCase();
//        System.out.println(upcase);
//
//        String nontrimmedstring = "     Abhinav     ";
//        System.out.println(nontrimmedstring);
//        String trimstring = nontrimmedstring.trim();
//        System.out.println(trimstring);
//
//        System.out.println(name.substring(1));
//        System.out.println(name.substring(1,6));
//
//        System.out.println(name.replace('b','l'));
//        System.out.println(name.replace("nav","avr"));
//        System.out.println(name.replace("n","avr"));
//
//        System.out.println(name.startsWith("Ab"));
//
//        System.out.println(name.endsWith("av"));
//
//        System.out.println(name.charAt(2));
//
//        System.out.println(name.indexOf("i"));
//
//        System.out.println(name.indexOf("i", 2));
//
        System.out.println(name.lastIndexOf("a" ));

        String name1 = "Abavhinavavav";

        System.out.println(name1.lastIndexOf("av", 4));

//        System.out.println(name.equals("Abhinav"));
//
//        System.out.println(name.equalsIgnoreCase("Abhinav"));

        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \' double quote");
        System.out.println("I am escape sequence \\ double quote");
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence \t double quote");
    }
}
