import java.util.Scanner;

public class PembayaranKompensasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di menu Pembayaran Kompensasi!");
        System.out.println("Pilih cara pembayaran kompensasi:");
        System.out.println("1. Membantu Dosen");
        System.out.println("2. Membersihkan Ruangan");
        System.out.println("3. Membantu Panitia");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda telah memilih membantu dosen");
                break;
            case 2:
                System.out.println("Anda telah memilih membersihkan ruangan");
                break;
            case 3:
                System.out.println("Anda telah memilih membantu panitia");
                break;
            default:
                System.out.println("Pilihan yang Anda masukkan tidak valid.");
            
        }
        System.out.println("Terima kasih telah berpartisipasi!");

        scanner.close();
    }
}
