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
            System.out.println("[ 4. Feedback/Tanggapan                    ]");
            System.out.println("[ 5. Keluar                                ]");

            System.out.print("Pilih menu (1/2/3/4/5?): ");
            int menu = sc08.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("======================================================");
                    System.out.println("[                   Input Jam Alfa                   ]");
                    System.out.println("======================================================");
                    System.out.print("Pilih mahasiswa (1: Adham, 2: Marsya, 3: Ayleen): ");
                    int choice = sc08.nextInt();

                    String mahasiswa = "";
                    switch (choice) {
                        case 1:
                            mahasiswa = "Adham";
                            break;
                        case 2:
                            mahasiswa = "Marsya";
                            break;
                        case 3:
                            mahasiswa = "Ayleen";
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            return;
                    }

                    System.out.print("Masukkan Jam Alfa untuk " + mahasiswa + ": ");
                    int jamAlfa = sc08.nextInt();

                    int jamKompen = jamAlfa * 2;
                    System.out.println("\nBerhasil melakukan input jam alfa!");
                    System.out.println("Nama Mahasiswa: " + mahasiswa);
                    System.out.println("Jam Alfa: " + jamAlfa);
                    System.out.println(mahasiswa + " mendapatkan jam kompensasi:  " + jamKompen + " jam");
                    break;

                case 2:
                    System.out.println("======================================================");
                    System.out.println("[              Pembayaran Kompensasi                 ]");
                    System.out.println("======================================================");
                    System.out.print("Pilih mahasiswa (1: Adham, 2: Marsya, 3: Ayleen): ");
                    choice = sc08.nextInt();

                    mahasiswa = "";
                    switch (choice) {
                        case 1:
                            mahasiswa = "Adham";
                            break;
                        case 2:
                            mahasiswa = "Marsya";
                            break;
                        case 3:
                            mahasiswa = "Ayleen";
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            return;
                    }
                    System.out.println("Pilih cara pembayaran kompensasi:");
                    System.out.println("1. Membantu Dosen");
                    System.out.println("2. Membersihkan Ruangan");
                    System.out.println("3. Membantu Panitia");
                    System.out.println("4. Menjadi relawan sebagai petugas damkar");
                    System.out.println("5. Menjadi Volunteer");
                    System.out.print("Pilih Salah Satu (1/2/3): ");

                    int pilihan = sc08.nextInt();
                    System.out.print("Masukkan jam kompensasi yang harus dikerjakan: ");
                    int jam = sc08.nextInt();
                    System.out.println(mahasiswa + " diharuskan membayar kompensasi: ");

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
                        case 4:
                            System.out.println("Menjadi relawan sebagai petugas damkar");
                            break;
                        case 5:
                            System.out.println("Menjadi volunteer");
                            break;
                        default:
                            System.out.println("Pilihan yang Anda masukkan tidak valid.");

                    }
                    System.out.println("Sebanyak " + jam + " jam");
                    break;

                case 3:
                    System.out.println("======================================================");
                    System.out.println("[              Pelaporan Pelanggaran                 ]");
                    System.out.println("======================================================");
                    System.out.print("Apakah Anda ingin melaporkan pelanggaran? (y/t): ");
                    char p = sc08.next().charAt(0);

                    if (p == 'y' || p == 'Y') {
                        System.out.print("Masukkan nama mahasiswa: ");
                        String namaMahasiswa = sc08.next();

                        System.out.print("Masukkan pelanggaran yang dilakukan: ");
                        String pelanggaran = sc08.next();

                        System.out.print("Masukkan tingkat pelanggaran (berat/cukupBerat/sedang/ringan): ");
                        String tingkatPelanggaran = sc08.next();

                        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
                        System.out.println("Pelanggaran: " + pelanggaran);
                        System.out.println("Tingkat Pelanggaran: " + tingkatPelanggaran + "\n");

                        System.out.println("Terima Kasih, mahasiswa atas nama " + namaMahasiswa + " telah dilaporkan!");
                    } else {
                        System.out.println("Terima kasih. Tidak ada pelaporan pelanggaran.");
                    }
                    break;
                case 4:
                    System.out.println("======================================================");
                    System.out.println("[                  Feedback/Tanggapan                 ]");
                    System.out.println("======================================================");
                    System.out.print("Pilih mahasiswa (1: Adham, 2: Marsya, 3: Ayleen): ");
                    choice = sc08.nextInt();

                    mahasiswa = "";
                    switch (choice) {
                        case 1:
                            mahasiswa = "Adham";
                            break;
                        case 2:
                            mahasiswa = "Marsya";
                            break;
                        case 3:
                            mahasiswa = "Ayleen";
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            return;
                    }
                    System.out.println("Masukkan Feedback/Tanggapan: ");
                    String tanggapan = sc08.next();
                    System.out.println(mahasiswa + "taggapan dari dosen: " + tanggapan);
                    break;
                case 5: 
                System.out.println("Apakah anda ingin logout sebagai dosen? (y/t)");
            }
        } while (true);
    }
}
