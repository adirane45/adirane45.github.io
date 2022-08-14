import java.util.Scanner;

public class pattern1 {
    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows = ");
        int a = sc.nextInt();
        System.out.print("Enter Columns = ");
        int b = sc.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            //outerloop
            System.out.print(" * ");
            for(int j=1;j<=b;j++)
            {
                //innerloop
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
