import java.util.Scanner;

public class upsideDownTriangleUsingRecursive {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        pangkat(a,a);
        
    }
    public static int pangkat(int n, int m){
        int count = m;
        if (n>0){
            n = n-1;
            System.out.print("* ");
            if (n==0){
                n = --count;
                System.out.println("");
            }
            return (pangkat(n,count));
          }
          return n;
    }
}
