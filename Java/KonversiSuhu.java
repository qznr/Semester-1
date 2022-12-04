package Java;
import java.util.*;

public class KonversiSuhu {
  private static double input,output,inFreeze,inBoil,outFreeze,outBoil;
  private static String inType,outType;

  static void menu(int inputType, int outputType){
    switch (inputType){
      case 1:
        inFreeze=0;inBoil=100;inType="Celcius";
        break;
      case 2:
        inFreeze=32;inBoil=212;inType="Fahrenheit";
        break;
      case 3:
        inFreeze=0;inBoil=80;inType="Reamur";
        break;
      case 4:
        inFreeze=273.15;inBoil=373.15;inType="Kelvin";
        break;
    }
    switch (outputType){
      case 1:
        outFreeze=0;outBoil=100;outType="Celcius";
        break;
      case 2:
        outFreeze=32;outBoil=212;outType="Fahrenheit";
        break;
      case 3:
        outFreeze=0;outBoil=80;outType="Reamur";
        break;
      case 4:
        outFreeze=273.15;outBoil=373.15;outType="Kelvin";
        break;}
    }

  static void conversion(){
    output = (((input-inFreeze)/(inBoil-inFreeze))*(outBoil-outFreeze))+outFreeze;
    System.out.printf("Hasil konversi dari %s ke %s adalah = %f\n",inType,outType,output);
    System.out.println("==================================================");
  }

  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("==================================================");
    System.out.printf("1. Celcius\n2. Fahrenheit\n3. Reamur\n4. Kelvin\n");
    System.out.println("==================================================");
    System.out.printf("%-51s","Ketik angka untuk memilih tipe input dan output!");
    menu(sc.nextInt(),sc.nextInt());
    System.out.printf("Nilai suhu %s yang akan dikonversi  = ",inType); input=sc.nextDouble();
    conversion(); sc.close();
  }
}