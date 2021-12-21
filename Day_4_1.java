                                import java.io.*;
import java.util.*;

public class Day_4_1 {
    public static void main(String[] args) {

    

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    String C = A+B;
    System.out.println(C.length());
    if(A.equals(B)) {
        System.out.println("yes");
    }
        else {
            System.out.println("No");

        }
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+" ");
        System.out.print(B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());


}

}