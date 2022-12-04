package Java;
import java.util.*;
public class CountOddAndEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();
        int ganjil = (max-min)/2;
        if (max%2!=0 || min%2!=0) ganjil++;
        int genap = max-min+1-ganjil;
        System.out.println(genap);
    }
}