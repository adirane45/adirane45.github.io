import java.util.Scanner;

public class pattern2 {
    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows = ");
        int a = sc.nextInt();
        System.out.print("Enter Columns = ");
        int b = sc.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            //outerloop
            for(int j=1;j<=b;j++)
            {
                //innerloop
                if(i==1 || j==1 || i==a || j==b)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
