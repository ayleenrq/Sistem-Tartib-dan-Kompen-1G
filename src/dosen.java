import java.util.Scanner;

public class dosen {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.println("Berhasil Login Sebagai Dosen!");
        System.out.println();

        do {
            System.out.println("============================================");
            System.out.println("[   Tata Tertib dan Kompensasi Mahasiswa   ]");
            System.out.println("============================================");
            System.out.println("[ MENU :                                   ]");
            System.out.println("[ 1. Input Jam Alfa                        ]");
            System.out.println("[ 2. Pembayaran Kompensasi                 ]");
            System.out.println("[ 3. Pelaporan Pelanggaran                 ]");
            System.out.println("[ 4. Keluar                                ]");
            
            System.out.print("Pilih menu (1/2/3/4/5?): ");
            int menu = sc08.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("======================================================");
                    System.out.println("[                   Input Jam Alfa                   ]");
                    System.out.println("======================================================");
                    System.out.print("Masukkan nama mahasiswa : ");
                    String mhs = sc08.next();
                    System.out.print("Masukkan jam alfa  : ");
                    int jamAlfaK = sc08.nextInt();
                    int jamKompensasiK = jamAlfaK * 2;
                    System.out.println("Jam Alfa berhasil di input!");
                    System.out.println("Jam kompensasi yang didapat mahasiswa " + mhs + " adalah: " + jamKompensasiK);
                    break;

                case 2:
                    System.out.println("======================================================");
                    System.out.println("[              Pembayaran Kompensasi                 ]");
                    System.out.println("======================================================");
                    System.out.print("Masukkan nama mahasiswa: ");
                    mhs = sc08.next();
                    System.out.println("Pilih cara pembayaran kompensasi:");
                    System.out.println("1. Membantu Dosen");
                    System.out.println("2. Membersihkan Ruangan");
                    System.out.println("3. Membantu Panitia");
                    System.out.print("Pilih Salah Satu (1/2/3): ");

                    int pilihan = sc08.nextInt();
                    System.out.println(mhs + " diharuskan membayar kompensasi");

                    switch (pilihan) {
                        case 1:
                            System.out.println("Membantu dosen");
                            break;
                        case 2:
                            System.out.println("Membersihkan ruangan");
                            break;
                        case 3:
                            System.out.println("Membantu panitia");
                            break;
                        default:
                            System.out.println("Pilihan yang Anda masukkan tidak valid.");

                    }
                    System.out.println("Terima Kasih Atas Masukan Anda!");
                    break;

                case 3:
                    System.out.println("======================================================");
                    System.out.println("[              Pelaporan Pelanggaran                 ]");
                    System.out.println("======================================================");
                    break;
                case 4:
                    System.out.println("Apakah anda ingin keluar?");
                    break;
            }
        } while (true);
    }
}
