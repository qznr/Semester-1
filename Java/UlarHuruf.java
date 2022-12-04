package Java;
import java.util.*;
public class UlarHuruf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int t = in.nextInt();
        char[][] grid = new char[t][l]; //array 2dimensi, anggep aja bidang buat nentuin tempat(koordinat) dimana hurufnya nanti ditaruh.
        int a = 0; //index sudah huruf keberapa, dimulai dari 0.
        char[] huruf = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; //array char untuk a-z.
        for (int i=0;i<t;i++){
            if (i%2==0){ //jika baris genap
                for (int j=0;j<l;j++){//loop baris dimulai dari kiri, yaitu l(panjang) dengan index mulai dari 0.
                    grid[i][j]=huruf[a%26];//huruf dengan index a%26 ditempatkan pada koordinat i dan j dimana i adalah baris dan j adalah kolom.
                    a++;//index ditambah 1.
                    System.out.print(grid[i][j]);
                }
            } else if (i%2==1){ //jika baris ganjil
                for (int j=l-1;j>=0;j--){ //loop dimulai dari kanan, yaitu l(panjang) dikurangi 1 sampai ke 0.
                    grid[i][j]=huruf[a%26];//huruf dengan index a%26 ditempatkan pada koordinat i dan j dimana i adalah baris dan j adalah kolom.
                    a++;//index ditambah 1
                }
                for (int j=0;j<l;j++){//loop dimulai dari kiri.
                    System.out.print(grid[i][j]);//print grid dengan koordinat i dan j, grid pada koordinat tersebut sudah ditentukan dari loop sebelumnya.
                }
            } System.out.println("");//setelah baris selesai buat new line lagi.
        }
    }
}