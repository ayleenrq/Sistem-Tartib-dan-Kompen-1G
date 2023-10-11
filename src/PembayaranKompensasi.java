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
                // Mahasiswa memilih untuk membayar kompensasi dengan "Membantu Dosen"
                System.out.println("Pilih dosen yang akan Anda bantu:");
                // Implementasi pemilihan dosen
                break;
            case 2:
                // Mahasiswa memilih untuk membayar kompensasi dengan "Membersihkan Ruangan"
                System.out.println("Pilih ruangan yang akan Anda bersihkan:");
                // Implementasi pemilihan ruangan
                break;
            case 3:
                // Mahasiswa memilih untuk membayar kompensasi dengan "Membantu Panitia"
                System.out.println("Pilih kegiatan yang akan Anda bantu dalam panitia:");
                // Implementasi pemilihan kegiatan
                break;
            default:
                System.out.println("Pilihan yang Anda masukkan tidak valid.");
        }

        scanner.close();
    }
}
