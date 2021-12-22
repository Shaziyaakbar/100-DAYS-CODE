import java.util.*;
import java.io.*;
public class Example_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("==================================");
        for(int i=0;i<=3;i++) {
            String N= sc.next();
            String B= sc.next();
            if(N.length()<8) {
                System.out.print(N+"\t\t");
            }
            else{
                System.out.print(N+"\t");
            }
            if(B.length()<3) {
            if(B.length()<2) {
                System.out.println("00"+B);
            }
            else {
                System.out.println("0"+B);
            }
        }
        else {
            System.out.println(B);
        }
        sc.close();
    }
}
}
