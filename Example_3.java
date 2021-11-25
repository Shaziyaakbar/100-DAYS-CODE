import java.util.Scanner;
public class Example_3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        int n=sc.nextInt();
        Double a=sc.nextDouble();
        sc.nextLine();
        String s=sc.nextLine();
        System.out.println("String:" +s);
        System.out.println("Double:" +a);
        System.out.println("Integer:" +n);    
    }

}
