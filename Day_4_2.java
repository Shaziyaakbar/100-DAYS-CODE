import java.util.*;
import java.io.*;

public class Day_4_2 {

  public static  void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String A = sc.next();
      int start = sc.nextInt();
      int end = sc.nextInt();
      System.out.println(A.substring(start,end));
  }  
}