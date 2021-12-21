import java.util.*;
import java.io.*;
public class Pattern_4 {
    public static void main(String[] aergs) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                if(i==n || j==1 || j==i) {
                System.out.print(j+" ");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}