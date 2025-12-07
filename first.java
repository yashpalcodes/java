import java.util.Scanner;


public class first{
    public static void sprt(String n){
        System.out.print(n);
    }
    public static void sprtln(String s){
        System.out.println(s);
    }
    public static void iprt(int s){
        System.out.print(s);
    }
    public static void iprtln(int s){
        System.out.println(s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hi this is my first java code.");
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
        sprt("you have choosen: ");
        iprtln(n);
        sprt("2 times : " );
        int m = n*2;
        iprtln(m);
        sprt("3 times : ");
        System.out.println(3*n);
    }
}