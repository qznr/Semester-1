package Java;
import java.util.*;
public class PerbaikiPeta {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String warna = in.nextLine();
        int n = in.nextInt();
        int arahInt = 0;
        String arahString = "";
        int biru = (int)'B'+(int)'I'+(int)'R'+(int)'U';
        switch(warna){
            case "kuning":
            n%=7;
            arahInt=n%4; break;
            case "hijau":
            n-=30;
            arahInt=n%4; break;
            case "biru":
            n=biru-n;
            arahInt=n%4; break;
        }
        switch(arahInt){
            case 0:
            arahString = "utara"; break;
            case 1:
            arahString = "barat"; break;
            case 2:
            arahString = "timur"; break;
            case 3:
            arahString = "selatan"; break;
        }
        System.out.printf("Kapal pak Dengklek akan bergerak ke arah %s dan peta berhasil dibetulkan", arahString);
    }
}
