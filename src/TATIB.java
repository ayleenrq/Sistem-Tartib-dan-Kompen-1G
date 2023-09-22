import java.util.Scanner;

public class TATIB {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        int jamAlfa, jamKompensasi;

        System.out.println("=============================");
        System.out.println("|     Hitung Jam Kompen     |");
        System.out.println("=============================");
        System.out.print("   Masukkan jam alfa  : ");
        jamAlfa = sc08.nextInt();
        
        jamKompensasi = jamAlfa * 2;

        System.out.println("   Jam Kompensasi anda: " + jamKompensasi);   
        System.out.println("=============================");     
    }
}
