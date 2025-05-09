import java.util.Scanner;

public class TatibKompen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamAlfa, jamKompensasi, menuChoice;

        String[][] aturanKompensasi = {
            {"1-10", "Pemberian peringatan lisan atau tertulis"},
            {"11-20", "Melakukan bantuan atau layanan masyarakat"},
            {"21-30", "Pemberhentian dari kegiatan UKM atau OKI"},
            {"31-40", "Drop-out atau penangguhan sementara dari kegiatan akademik"},
            {"41-50", "Pemecatan akademik / Pemberhentian kegiatan studi di kampus"}
        };

        do {
            System.out.println("Menu:");
            System.out.println("1. Hitung jam kompensasi");
            System.out.println("2. Kategori Tata Tertib dan Kompensasi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            
            menuChoice = sc.nextInt();
            
            switch (menuChoice) {
                case 1:
                    System.out.println("Masukkan jam alfa: ");
                    jamAlfa = sc.nextInt();
                    jamKompensasi = jamAlfa * 2;
                    System.out.println("Jam kompensasi anda: " + jamKompensasi);
                    break;
                case 2:
                    System.out.println("Aturan Tata Tertib dan Kompensasi:");
                    for (String[] aturan : aturanKompensasi) {
                        System.out.println(aturan[0] + ": " + aturan[1]);
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1, 2, atau 3.");
            }
        } while (menuChoice != 3);
    }
}
