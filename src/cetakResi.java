import java.util.Scanner;
public class CetakResi {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        char kembaliMenu;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cetak Resi Pembayaran Kompensasi");
            System.out.println("2. Cetak Resi Pelanggaran Tata Tertib");
            System.out.print("Pilih menu (1/2): ");
            int menu = sc08.nextInt();

            switch (menu) {
                case 1:
                    cetakResiPembayaranKompensasi(sc08);
                    break;
                case 2:
                    cetakResiPelanggaranTataTertib(sc08);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }

            System.out.print("Kembali ke menu? (y/t): ");
            kembaliMenu = sc08.next().charAt(0);

        } while (kembaliMenu == 'y' || kembaliMenu == 'Y');

        System.out.println("Terima kasih!");
        sc08.close();
    }

    private static void cetakResiPembayaranKompensasi(Scanner sc08) {
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = sc08.next();
        System.out.print("Masukkan banyaknya jam alfa: ");
        int jamAlfa = sc08.nextInt();

        int jamKompensasi = jamAlfa * 2;
        


        System.out.print("Apakah Anda ingin mencetak resi? (y/t): ");
        char cetakResi = sc08.next().charAt(0);
        if (cetakResi == 'y' || cetakResi == 'Y') {
            System.out.println("===== Resi Pembayaran Kompensasi =====");
            System.out.println("Nama Mahasiswa: " + namaMahasiswa);
            System.out.println("Banyaknya Jam Alfa: " + jamAlfa);
            System.out.println("Jam Kompensasi: " + jamKompensasi);
        }
        if (jamKompensasi > 6){
            System.out.println("Pembayaran Kompensasi: Membersihkan Kamar mandi dosen");
        } else{
            System.out.println("Pembayaran Kompensasi: Membersihkan ruangan dosen");
        }
    }

    private static void cetakResiPelanggaranTataTertib(Scanner scanner) {
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.next();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();
        System.out.print("Masukkan jurusan: ");
        String jurusan = scanner.next();
        System.out.print("Masukkan prodi: ");
        String prodi = scanner.next();
        System.out.print("Masukkan kelas: ");
        String kelas = scanner.next();
        System.out.print("Masukkan jumlah poin pelanggaran: ");
        int poinPelanggaran = scanner.nextInt();

        String sanksi;
        if (poinPelanggaran > 50) {
            sanksi = "Cuti/Diberhentikan";
        } else {
            sanksi = "Denda";
        }



        System.out.print("Apakah Anda ingin mencetak resi? (y/t): ");
        char cetakResi = scanner.next().charAt(0);
        if (cetakResi == 'y' || cetakResi == 'Y') {
            System.out.println("===== Resi Pelanggaran Tata Tertib =====");
            System.out.println("Nama Mahasiswa: " + namaMahasiswa);
            System.out.println("NIM: " + nim);
            System.out.println("Jurusan: " + jurusan);
            System.out.println("Prodi: " + prodi);
            System.out.println("Kelas: " + kelas);
            System.out.println("Jumlah Poin Pelanggaran: " + poinPelanggaran);
            System.out.println("Sanksi: " + sanksi);
        }
    }



    }

