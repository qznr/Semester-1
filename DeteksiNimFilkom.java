import java.util.*;
public class DeteksiNimFilkom {
    static Scanner in = new Scanner(System.in);
    static String nim;
    static int pilihan;
    public static void nimSubstring(String nim){
        String angkatan = "20" + nim.substring(0,2);
        String prodi = nim.substring(5,7);
        String seleksiMasuk = nim.substring(7,12);
        String kodeUnik = nim.substring(12,15);
        switch(prodi){
            case "02":
            prodi = "TIF"; break;
            case "03":
            prodi = "TEKKOM"; break;
            case "04":
            prodi = "SI"; break;
            case "06":
            prodi = "PTI"; break;
            case "07":
            prodi = "TI"; break;
            default:
            prodi = "Tidak valid"; break;
        }
        switch(seleksiMasuk){
            case "01111":
            seleksiMasuk = "SNMPTN"; break;
            case "00111":
            seleksiMasuk = "SBMPTN"; break;
            case "07111":
            seleksiMasuk = "Mandiri"; break;
            default:
            seleksiMasuk = "Tidak valid"; break;
        }
        System.out.print("\nFakultas: Ilmu Komputer\n");
        System.out.printf("Angkatan: %s\nProgram Studi: %s\nSeleksi Masuk: %s\nKode Unik: %s\n\n",angkatan,prodi,seleksiMasuk,kodeUnik);
    }
    public static void menu(){
        System.out.println("1. Input NIM");
        System.out.println("2. Exit");
        System.out.print("Pilihan anda: "); pilihan = in.nextInt(); in.nextLine();
        switch(pilihan){
            case 1:
            System.out.print("Input NIM: "); nim=in.nextLine(); break;
            case 2:
            pilihan = 2; break;
        }
    }
    public static void main(String[] args){
        do {
            menu();
            if (nim.length()==15){
                nimSubstring(nim);
            } else {
                System.out.println("Bukan sebuah NIM");
            }
        } while (pilihan != 2);
    }
}