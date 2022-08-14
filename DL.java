import java.util.Scanner;




public class DL 
{   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int a = sc.nextInt();
        System.out.print("Enter 2st number = ");
        int b = sc.nextInt();

        if(a==b)
        {
            System.out.println(a+" Is Equal To "+b);
        }
        else if(a>b)
        {
            System.out.println(a+" Is Greater Than "+b);
        }
        else
        {
            System.out.println(a+" Is Less Than "+b);
        }
    }
}
