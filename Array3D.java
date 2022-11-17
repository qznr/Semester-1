import java.util.Scanner;

public class Array3D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("============= input =============");
        System.out.printf("Panjang x = "); int x = in.nextInt();
        System.out.printf("Panjang y = "); int y = in.nextInt();
        System.out.printf("Panjang z = "); int z = in.nextInt(), count = 0;
        System.out.println("============= input =============");
        in.close();
        int[][][] array = new int[z][y][x];
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    array[i][j][k] = ++count;
                    System.out.printf("%-3s ",Integer.toString(array[i][j][k]));
                }
                System.out.println();
            }
            System.out.printf("======== index z ke - %d ========\n",i);
        }
    }
}