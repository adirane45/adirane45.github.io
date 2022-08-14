import java.util.*;

class Fc
  {
        public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      final float pi=(float) 3.14;
      float A,r;
      
      System.out.println("Enter Radius Of Circle = ");
      r=sc.nextFloat();

      A=pi*r*r;

      System.out.print("Area Of Circle = ");
      System.out.println(A);
    }
  }