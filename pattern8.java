//Floyd Triangle
public class pattern8 {
    static public void main(String args[]){
        int n=10;
        int num=1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
