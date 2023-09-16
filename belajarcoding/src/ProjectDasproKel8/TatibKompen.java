package ProjectDasproKel8;
import java.util.Scanner;
public class TatibKompen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 3; // Maksimum percobaan login yang diperbolehkan
        int currentAttempt = 0;
        String correctNIM = "2341720011" ; // NIM yang benar
        String correctUsername = "Marsya Aurelia Sefira"; // Nama mahasiswa yang benar

        // Loop untuk login
        while (currentAttempt < maxAttempts) {
            System.out.print("Masukkan Nama Mahasiswa: ");
            String inputUsername = scanner.nextLine();

            if (inputUsername.equals(correctUsername)) {
                System.out.print("Masukkan NIM: ");
                String inputNIM = scanner.nextLine();

            if (inputNIM.equals(correctNIM)) {
                System.out.println("Login berhasil!");
                break; // Keluar dari loop jika login berhasil
                }
            }

            System.out.println("Username atau NIM tidak sesuai. Coba lagi.");
            currentAttempt++;
        }

            if (currentAttempt == maxAttempts) {
                System.out.println("Anda telah melebihi batas percobaan login. Aplikasi akan keluar.");
                System.exit(0);
        }

        // Jika login berhasil, tampilkan menu
        while (true) {
            System.out.println("\nPilih Menu:");
            System.out.println("1. Kategori Tata Tertib dan Kompensasi");
            System.out.println("2. Data Mahasiswa");
            System.out.println("3. Kompensasi");
            System.out.println("4. Pembayaran Kompensasi");
            System.out.println("5. Daftar Kompensasi");
            System.out.println("6. Pelaporan Pelanggaran");
            System.out.println("7. Keterlibatan Dosen");
            System.out.println("8. Keluar");

            int choice;
            try {
                System.out.print("Pilihan Anda: ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harap masukkan nomor menu.");
                continue; // Melanjutkan loop ke iterasi berikutnya
            }

            switch (choice) {
                case 1:
                // Implementasikan logika untuk menu "Kategori Tata Tertib dan Kompensasi" di sini
                System.out.println("Anda memilih Kategori Tata Tertib dan Kompensasi.");
                System.out.println("Berikut adalah aturan tata tertib dan kompensasi:");
                System.out.println("Poin 1-10: pemberian peringatan lisan atau tertulis");
                System.out.println("Poin 11-20: melakukan bantuan atau layanan masyarakat");
                System.out.println("Poin 21-30: pemberhentian dari kegiatan UKM atau OKI");
                System.out.println("Poin 31-40: drop-out atau penangguhan sementara dari kegiatan akademik");
                System.out.println("Poin 41-50: pemecatan akademik / pemberhentian kegiatan studi di kampus");
                break;

                case 2:
                // Implementasikan logika untuk menu "Data Mahasiswa" di sini
                System.out.println("Anda memilih Data Mahasiswa.");
                System.out.println("Nama\t\t: Marsya Aurelia Sefira");
                System.out.println("NIM\t\t: 2341720011");
                System.out.println("Jurusan\t\t: Teknologi Informasi");
                System.out.println("Prodi\t\t: Teknik Informatika");
                break;

                case 3:
                // Implementasikan logika untuk menu "Kompensasi" di sini
                System.out.println("Anda memilih Kompensasi");
                System.out.println("\nPilih Menu:");
                System.out.println("1. Ketidakhadiran Mahasiswa");
                System.out.println("2. Jam Kompen");
                System.out.println("3. Keluar");
                
                int pilih;
                try {
                    System.out.print("Pilihan Anda: ");
                    pilih = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Harap masukkan nomor menu.");
                    continue; // Melanjutkan loop ke iterasi berikutnya
                }
                    switch (pilih) {
                        case 1:
                        System.out.println("Jam Alpha : 2");  

                        case 2:
                        Scanner sc = new Scanner(System.in);
                        int jamAlfa;
                        int jamKompensasi;
                            System.out.print("Masukkan jam alfa: ");
                            jamAlfa = sc.nextInt();
                            jamKompensasi = jamAlfa * 2;
                            System.out.println("Jam kompensasi anda: " + jamKompensasi);
                            break;

                        case 3:
                        System.out.println("Terima kasih telah menggunakan program ini.");
                        break;
                        default:
                        System.out.println("Pilihan tidak valid. Silakan pilih menu 1, 2, atau 3.");
                
                        }


        // Simulasikan data pelanggaran
        boolean hasViolations = false; // Ganti dengan logika sesuai dengan data pelanggaran yang ada
        if (hasViolations) {
        System.out.println("Pelanggaran:");
        // Implementasikan logika untuk menampilkan pelanggaran yang telah dilakukan
        } else {
        System.out.println("Tidak ada pelanggaran.");
        }
        break;

            }
        }
    }
{
    }
}
