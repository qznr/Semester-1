import java.util.*;
public class UlarHuruf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int t = in.nextInt();
        char[][] grid = new char[t][l];
        int a = 0;
        char[] huruf = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i=0;i<t;i++){
            if (i%2==0){
                for (int j=0;j<l;j++){
                    if (a==26) a=0;
                    grid[i][j]=huruf[a];
                    a++;
                    System.out.print(grid[i][j]);
                }
            } else if (i%2==1){
                for (int j=l-1;j>=0;j--){
                    if (a==26) a=0;
                    grid[i][j]=huruf[a];
                    a++;
                }
                for (int j=0;j<l;j++){
                    System.out.print(grid[i][j]);
                }
            } System.out.println("");
        }
    }
}