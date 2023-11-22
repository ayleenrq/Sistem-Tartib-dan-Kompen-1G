import java.util.Scanner;

public class SistemTatibKompen {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("[                  LOGIN                   ]");
        System.out.println("============================================");
        System.out.println("[ Pilih Login sebagai :                    ]");
        System.out.println("[ 1. Admin                                 ]");
        System.out.println("[ 2. Mahasiswa                             ]");
        System.out.println("[ 3. Dosen                                 ]");
        System.out.print("Pilih menu (1/2/3): ");
        int Login = sc08.nextInt();

        do {
            System.out.println("============================================");
            System.out.println("[   Tata Tertib dan Kompensasi Mahasiswa   ]");
            System.out.println("============================================");
            System.out.println("[ MENU :                                   ]");
            System.out.println("[ 1. Kategori Tata Tertib dan Kompensasi   ]");
            System.out.println("[ 2. Data Mahasiswa                        ]");
            System.out.println("[ 3. Kompensasi                            ]");
            System.out.println("[ 4. Pembayaran Kompensasi                 ]");
            System.out.println("[ 5. Daftar Kompensasi                     ]");
            System.out.println("[ 6. Pelaporan Pelanggaran                 ]");
            System.out.println("[ 7. Cetak Pelanggaran                     ]");
            System.out.println("[ 8. Manajemen Akun                        ]");
            System.out.println("[ 9. Keluar                                ]");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc08.nextInt();


        } while (true);
        
    }
}
