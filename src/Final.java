import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Final {
    public static List<String[]> dataTatib = new ArrayList<>();
    public static List<String[]> dataKompen = new ArrayList<>();

        static String[][] dosenAkun = {
                { "Dosen1", "abcd" },
                { "Dosen2", "efgh" }
        };

        static String[][] adminAkun = {
                { "Admin1", "1111" },
                { "Admin2", "0000" }
        };

        static String[][] mahasiswaAkun = {
                { "Adham", "7890" },
                { "Ayleen", "1234" },
                { "Marsya", "5678" },
        };

        static String[][] dataMahasiswa = {
                { "Adham Baskara", "2341720199", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G", "02" },
                { "Ayleen Ruhul Qisthy", "2341720012", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G", "07" },
                { "Marsya Aurelia Sefira", "2341720011", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G", "18" }
        };
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        boolean run = true, loginAdmin = false, loginMahasiswa = false, loginDosen = false, paswordSalah = false,
                exitBoolean = false, logout = false, logoutDosen = false, logoutMahasiswa = false, logoutProgram = false, keluarKategori = false, keluarData = false, keluarDataDosen = false, keluarDataAdmin = false, keluarDataMahasiswa = false, keluarKompensasi = false;
        String feedbackDosen, exit, kompen;
        int poin = 0, jamAlfaK = 0, jamKompensasiK = 0, jatahKompen, jatahKompenSelesai;

        do {
            System.out.println("============================================");
            System.out.println("[                  LOGIN                   ]");
            System.out.println("============================================");
            System.out.println("[ Pilih Login sebagai :                    ]");
            System.out.println("[ 1. Login Admin                           ]");
            System.out.println("[ 2. Login Mahasiswa                       ]");
            System.out.println("[ 3. Login Dosen                           ]");
            System.out.println("[ 4. Exit                                  ]");
            System.out.print("Pilih menu (1/2/3): ");
            String login = sc08.next();

            if (login.equalsIgnoreCase("4")) {
                System.out.println("Terimakasih telah menggunakan program ini!");
                logoutProgram = true;
                break;
            }
            
            System.out.println();
            System.out.print("Masukkan Username: ");
            String inputuser = sc08.next();

            System.out.print("Masukkan Password: ");
            String inputpassword = sc08.next();

            System.out.println();

            if (login.equalsIgnoreCase("1")) {
                for (int i = 0; i < adminAkun.length; i++) {
                    if (inputuser.equals(adminAkun[i][0])) {
                        if (inputpassword.equals(adminAkun[i][1])) {
                            loginAdmin = true;
                            paswordSalah = false;
                            break;
                        } else {
                            loginAdmin = false;
                            paswordSalah = true;
                        }
                    } else {
                        loginAdmin = false;
                    }
                }
            } else if (login.equalsIgnoreCase("2")) {
                for (int j = 0; j < mahasiswaAkun.length; j++) {
                    if (inputuser.equals(mahasiswaAkun[j][0])) {
                        if (inputpassword.equals(mahasiswaAkun[j][1])) {
                            loginMahasiswa = true;
                            paswordSalah = false;
                            break;
                        } else {
                            loginMahasiswa = false;
                            paswordSalah = true;
                        }
                    } else {
                        loginMahasiswa = false;
                    }
                }
            } else if (login.equalsIgnoreCase("3")) {
                for (int k = 0; k < dosenAkun.length; k++) {
                    if (inputuser.equals(dosenAkun[k][0])) {
                        if (inputpassword.equals(dosenAkun[k][1])) {
                            loginDosen = true;
                            paswordSalah = false;
                            break;
                        } else {
                            loginDosen = false;
                            paswordSalah = true;
                        }
                    } else {
                        loginDosen = false;
                    }
                }
            } else {
                System.out.println("Peran yang anda pilih tidak valid");
            }

            if (paswordSalah) {
                System.out.println("Password Salah");
            } else if (loginMahasiswa) {
                System.out.println("Berhasil Login Sebagai Mahasiswa!");
                System.out.println();

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
                    System.out.println("[ 7. Cetak Resi Kompensasi                 ]");
                    System.out.println("[ 8. Manajemen Akun                        ]");
                    System.out.println("[ 9. Keluar                                ]");
                    System.out.print("Pilih menu (1/2/3/?): ");
                    int menu = sc08.nextInt();

                    switch (menu) {
                        case 1:
                            kategoriTatib();
                            System.out.print("Exit (true) : ");
                            exitBoolean = sc08.nextBoolean();
                            System.out.println();
                            if (exitBoolean) {
                                break;
                            }
                            break;
                        case 2:
                            for (int i = 0; i < dataMahasiswa.length; i++) {
                                if (inputuser.equals(mahasiswaAkun[i][0])) {
                                    System.out.println();
                                    System.out.println("============================================");
                                    System.out.println("[              Data Mahasiswa              ]");
                                    System.out.println("============================================");
                                    System.out.println("[ Nama Mahasiswa : " + dataMahasiswa[i][0]);
                                    System.out.println("[ NIM            : " + dataMahasiswa[i][1]);
                                    System.out.println("[ Jurusan        : " + dataMahasiswa[i][2]);
                                    System.out.println("[ Prodi          : " + dataMahasiswa[i][3]);
                                    System.out.println("[ Kelas          : " + dataMahasiswa[i][4]);
                                    System.out.println("[ Nomor Absen    : " + dataMahasiswa[i][5]);
                                    System.out.print("Exit (true) : ");
                                    exitBoolean = sc08.nextBoolean();
                                    System.out.println();
                                    if (exitBoolean) {
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("======================================================");
                            System.out.println("[                    Kompensasi                      ]");
                            System.out.println("======================================================");
                            System.out.print("Masukkan jam alfa  : ");
                            jamAlfaK = sc08.nextInt();
                            System.out.print("Masukkan poin pelanggaran   : ");
                            int poinPelanggaran = sc08.nextInt();

                            jamKompensasiK = jamAlfaK * 2;

                            System.out.println("Jam Kompensasi anda: " + jamKompensasiK);
                            if (poinPelanggaran <= 0)
                                System.out.println("Tidak ada pelanggaran ");
                            else if (poinPelanggaran <= 30 && poin != 0)
                                System.out.println("Peringatan Pelanggaran Ringan Tingkat V ");
                            else if (poinPelanggaran > 30 && poin <= 40)
                                System.out.println("Peringatan Pelanggaran Sedang Tingkat IV ");
                            else if (poinPelanggaran > 40 && poin <= 60)
                                System.out.println("Peringatan Pelanggaran Cukup Berat Tingkat III");
                            else if (poinPelanggaran > 60 && poin <= 70)
                                System.out.println("Peringatan Pelanggaran Berat Tingkat II");
                            else {
                                System.out.println("Peringatan Pelanggaran Sangat Berat Tingkat I");
                            }
                            System.out.print("Exit (true) : ");
                            exitBoolean = sc08.nextBoolean();
                            System.out.println();
                            if (exitBoolean) {
                                break;
                            }
                            break;

                        case 4:
                            System.out.println("======================================================");
                            System.out.println("[              Pembayaran Kompensasi                 ]");
                            System.out.println("======================================================");
                            System.out.println("Pilih cara pembayaran kompensasi:");
                            System.out.println("1. Membantu Dosen");
                            System.out.println("2. Membersihkan Ruangan");
                            System.out.println("3. Membantu Panitia");
                            System.out.print("Pilih Salah Satu (1/2/3): ");

                            int pilihan = sc08.nextInt();

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
                            System.out.print("Exit (true) : ");
                            exitBoolean = sc08.nextBoolean();
                            System.out.println();
                            if (exitBoolean) {
                                System.out.println("Terima kasih telah berpartisipasi!");
                                break;
                            }
                        case 5:
                            System.out.println("===========================================");
                            System.out.println("[       Daftar Kompensasi Mahasiswa       ]");
                            System.out.println("===========================================");
                            System.out.println("========Jumlah Alpha : " + jamAlfaK + "jam ===============");
                            System.out.println("======= Jumlah Kompensasi : " + jamKompensasiK + "jam =========\n");

                            System.out.print("Masukkan jumlah kompensasi anda: ");
                            jatahKompen = sc08.nextInt();

                            do {
                                System.out.print("Apakah anda sudah menyelesaikan kompen (sudah/belum)?");
                                kompen = sc08.next();

                                if (kompen.equalsIgnoreCase("sudah")) {
                                    System.out.print("Jumlah jam kompen yang sudah diselesaikan: ");
                                    jatahKompenSelesai = sc08.nextInt();

                                    if (jatahKompenSelesai <= jatahKompen) {
                                        jatahKompen -= jatahKompenSelesai;
                                        System.out.println("Sisa jam kompen yang belum diselesaikan: " + jatahKompen);
                                        continue;
                                    }
                                } else if (kompen.equalsIgnoreCase("belum")) {
                                    continue;
                                }
                            } while (jatahKompen > 0);
                            break;

                        case 6:
                            System.out.println("======================================================");
                            System.out.println("[              Pelaporan Pelanggaran                 ]");
                            System.out.println("======================================================");
                            break;

                        case 7:
                            System.out.println("======================================================");
                            System.out.println("[              Cetak Resi Kompensasi                 ]");
                            System.out.println("======================================================");
                            System.out.print("Masukkan nama mahasiswa: ");
                            String namaMahasiswa = sc08.next();
                            System.out.print("Masukkan banyaknya jam alfa: ");
                            int jamAlfa = sc08.nextInt();

                            int jamKompensasi = jamAlfa * 2;
                            System.out.println("Jam Kompensasi yang didapat: " + jamKompensasi);
                            int pembayaranKompensasi = 0;

                            System.out.print("Apakah Anda ingin mencetak resi? (y/t): ");
                            char cetakResi = sc08.next().charAt(0);
                            if (cetakResi == 'y' || cetakResi == 'Y') {
                                System.out.println("===== Resi Pembayaran Kompensasi =====");
                                System.out.println("Nama Mahasiswa: " + namaMahasiswa);
                                System.out.println("Banyaknya Jam Alfa: " + jamAlfa);
                                System.out.println("Jam Kompensasi: " + jamKompensasi);
                            }
                            System.out.println("Pilih kategori pembayaran:");
                            System.out.println("1. 2-4 jam = Membersihkan kamar mandi");
                            System.out.println("2. 5-6 jam = Membersihkan taman");
                            System.out.println("3. 7-10 jam = Menjadi Panitia sebuah event");
                            System.out.print("Pilih Salah Satu (1/2/3): ");
                            int kategori = sc08.nextInt();

                            switch (kategori) {
                                case 1:
                                    System.out.println("Membersihkan kamar mandi");
                                    break;
                                case 2:
                                    System.out.println("Membersihkan taman");
                                    break;
                                case 3:
                                    System.out.println("Menjadi Panitia Sebuah Event");
                                    break;
                                default:
                                    System.out.println("Kategori tidak valid.");
                            }

                            break;

                        case 8:
                            System.out.println("=======================================================");
                            System.out.println("[                   Manajemen Akun                    ]");
                            System.out.println("=======================================================");
                            System.out.println("      Apakah anda ingin mengedit info akun anda?      ");
                            break;

                        case 9:
                            logoutMahasiswa = true;
                            break;
                    }
                } while (!logoutMahasiswa);
            } else if (loginDosen) {
                System.out.println("Berhasil Login Sebagai Dosen!");
                System.out.println();

                do {
                    System.out.println("============================================");
                    System.out.println("[                  Dosen                   ]");
                    System.out.println("============================================");
                    System.out.println("[ MENU :                                   ]");
                    System.out.println("[ 1. Input Jam Alfa                        ]");
                    System.out.println("[ 2. Pembayaran Kompensasi                 ]");
                    System.out.println("[ 3. Pelaporan Pelanggaran                 ]");
                    System.out.println("[ 4. Feedback/Tanggapan                    ]");
                    System.out.println("[ 5. Logout                                ]");

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
                            System.out.print("Exit (true) : ");
                            exitBoolean = sc08.nextBoolean();
                            System.out.println();
                            if (exitBoolean) {
                                break;
                            }
                            

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
                            System.out.print("Exit (true) : ");
                            exitBoolean = sc08.nextBoolean();
                            System.out.println();
                            if (exitBoolean) {
                                break;
                            }

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

                                System.out.println(
                                        "Terima Kasih, mahasiswa atas nama " + namaMahasiswa + " telah dilaporkan!");
                            } else {
                                System.out.println("Terima kasih. Tidak ada pelaporan pelanggaran.");
                            }
                            System.out.print("Exit (true) : ");
                            exitBoolean = sc08.nextBoolean();
                            System.out.println();
                            if (exitBoolean) {
                                break;
                            }
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
                            System.out.print("Exit (true) : ");
                            exitBoolean = sc08.nextBoolean();
                            System.out.println();
                            if (exitBoolean) {
                                break;
                            }
                        case 5:
                            logoutDosen = true;
                            break;
                    }
                } while (!logoutDosen);

            } else if (loginAdmin) {
                System.out.println("Berhasil Login Sebagai Admin!");
                System.out.println();

                do {
                    System.out.println("============================================");
                    System.out.println("[                  Admin                   ]");
                    System.out.println("============================================");
                    System.out.println("[ MENU :                                   ]");
                    System.out.println("[ 1. Kategori Tata Tertib dan Kompensasi   ]");
                    System.out.println("[ 2. Manajemen Akun                        ]");
                    System.out.println("[ 3. Kompensasi Mahasiswa                  ]");
                    System.out.println("[ 4. Pelaporan Pelanggaran                 ]");
                    System.out.println("[ 5. Feedback/Tanggapan                    ]");
                    System.out.println("[ 6. Logout                                ]");

                    System.out.print("Pilih menu (1/2/3?) : ");
                    int menu = sc08.nextInt();

                    switch (menu) {
                        case 1:
                            do {
                                System.out.println("============================================");
                                System.out.println("[     Kategori Tata Tertib & Kompensasi    ]");
                                System.out.println("============================================");
                                System.out.println("[ MENU :                                   ]");
                                System.out.println("[ 1. Kategori Tata Tertib                  ]");
                                System.out.println("[ 2. Input Kategori Tata Tertib            ]");
                                System.out.println("[ 3. Kategori Kompensasi                   ]");
                                System.out.println("[ 4. Input Kategori Kompensasi             ]");
                                System.out.println("[ 5. Exit                                  ]");

                                System.out.print("Pilih menu (1/2/3?) : ");
                                int menuAdminTatib = sc08.nextInt();

                                switch (menuAdminTatib) {
                                    case 1:
                                        System.out.println();
                                        kategoriTatib();
                                        System.out.print("Exit (true/false) : ");
                                        keluarKategori = sc08.nextBoolean();
                                        System.out.println();
                                        break;
                                    case 2:
                                        System.out.println();
                                        System.out.println("============================================");
                                        System.out.println("[        Input Kategori Tata Tertib        ]");
                                        System.out.println("============================================");
                                        inputKategoriTatib(sc08);
                                        kategoriTatib();
                                        break;
                                    case 3:
                                        System.out.println();
                                        kategoriKompen();
                                        System.out.print("Exit (true/false) : ");
                                        keluarKategori = sc08.nextBoolean();
                                        System.out.println();
                                        break;
                                    case 4:
                                        System.out.println();
                                        System.out.println("============================================");
                                        System.out.println("[            Kategori Kompensasi           ]");
                                        System.out.println("============================================");
                                        inputKategoriKompen(sc08);
                                        kategoriKompen();
                                        break;
                                    case 5:
                                        System.out.println();
                                        keluarKategori = true;                                        
                                        break;
                                    default:
                                        System.out.println();
                                        System.out.println("============================================");
                                        System.out.println("[ Pilihan anda tidak valid!                ]");
                                        System.out.println("[ Silahkan masukkan menu yang valid!       ]");
                                        System.out.println("============================================");
                                        System.out.println();
                                        keluarKategori = false;
                                        break;
                                }
                            } while (!keluarKategori);
                            break;
                        case 2:
                            do {
                                System.out.println("============================================");
                                System.out.println("[              Manajemen Akun              ]");
                                System.out.println("============================================");
                                System.out.println("[ MENU :                                   ]");
                                System.out.println("[ 1. Akun Dosen                            ]");
                                System.out.println("[ 2. Akun Mahasiswa                        ]");
                                System.out.println("[ 3. Akun Admin                            ]");
                                System.out.println("[ 4. Exit                                  ]");

                                System.out.print("Pilih menu (1/2/3?) : ");
                                int menuAdminData= sc08.nextInt();

                                switch (menuAdminData) {
                                    case 1:
                                        do {
                                            System.out.println("============================================");
                                            System.out.println("[                Akun Dosen                ]");
                                            System.out.println("============================================");
                                            System.out.println("[ MENU :                                   ]");
                                            System.out.println("[ 1. Tampilkan Akun Dosen                  ]");
                                            System.out.println("[ 2. Ubah Akun Dosen                       ]");
                                            System.out.println("[ 3. Tambahkan Akun Dosen                  ]");
                                            System.out.println("[ 4. Exit                                  ]");

                                            System.out.print("Pilih menu (1/2/3?) : ");
                                            int menuAdminDataDosen= sc08.nextInt();

                                            switch (menuAdminDataDosen) {
                                                case 1:
                                                    tampilkanAkunDosen();
                                                    break;
                                                case 2:
                                                    ubahAkunDosen(sc08);
                                                    break;
                                                case 3:
                                                    tambahkanAkunDosen(sc08);
                                                    break;
                                                case 4:
                                                    keluarDataDosen = true;
                                                    break;
                                                default:
                                                    System.out.println();
                                                    System.out.println("============================================");
                                                    System.out.println("[ Pilihan anda tidak valid!                ]");
                                                    System.out.println("[ Silahkan masukkan menu yang valid!       ]");
                                                    System.out.println("============================================");
                                                    System.out.println();
                                                    keluarDataDosen = false;
                                                    break;
                                            }
                                        } while (!keluarDataDosen);
                                        break;
                                    case 2:
                                        do {
                                            System.out.println("============================================");
                                            System.out.println("[              Akun Mahasiswa              ]");
                                            System.out.println("============================================");
                                            System.out.println("[ MENU :                                   ]");
                                            System.out.println("[ 1. Ubah Akun Mahasiswa                   ]");
                                            System.out.println("[ 2. Ubah Data Mahasiswa                   ]");
                                            System.out.println("[ 3. Tambahkan Akun Mahasiswa              ]");
                                            System.out.println("[ 4. Tambahkan Data Mahasiswa              ]");
                                            System.out.println("[ 5. Tampilkan Akun Mahasiswa              ]");
                                            System.out.println("[ 6. Tampilkan Data Mahasiswa              ]");
                                            System.out.println("[ 7. Exit                                  ]");

                                            System.out.print("Pilih menu (1/2/3?) : ");
                                            int menuAdminDataMahasiswa= sc08.nextInt();

                                            switch (menuAdminDataMahasiswa) {
                                                case 1:
                                                    ubahAkunMahasiswa(sc08);
                                                    break;
                                                case 2:
                                                    ubahDataMahasiswa(sc08);
                                                    break;
                                                case 3:
                                                    tambahkanAkunMahasiswa(sc08);
                                                    break;
                                                case 4:
                                                    tambahkanDataMahasiswa(sc08);
                                                    break;
                                                case 5:
                                                    tampilkanAkunMahasiswa();
                                                    break;
                                                case 6:
                                                    tampilkanDataMahasiswa();
                                                    break;
                                                case 7:
                                                    keluarDataMahasiswa = true;
                                                    break;
                                                default:
                                                    System.out.println();
                                                    System.out.println("============================================");
                                                    System.out.println("[ Pilihan anda tidak valid!                ]");
                                                    System.out.println("[ Silahkan masukkan menu yang valid!       ]");
                                                    System.out.println("============================================");
                                                    System.out.println();
                                                    keluarDataMahasiswa = false;
                                                    break;
                                            }
                                        } while (!keluarDataMahasiswa);
                                        break;
                                    case 3:
                                        do {
                                            System.out.println("============================================");
                                            System.out.println("[                Akun Admin                ]");
                                            System.out.println("============================================");
                                            System.out.println("[ MENU :                                   ]");
                                            System.out.println("[ 1. Tampilkan Akun Admin                  ]");
                                            System.out.println("[ 2. Ubah Akun Admin                       ]");
                                            System.out.println("[ 3. Tambahkan Akun Admin                  ]");
                                            System.out.println("[ 4. Exit                                  ]");

                                            System.out.print("Pilih menu (1/2/3?) : ");
                                            int menuAdminDataAdmin= sc08.nextInt();

                                            switch (menuAdminDataAdmin) {
                                                case 1:
                                                    tampilkanAkunAdmin();
                                                    break;
                                                case 2:
                                                    ubahAkunAdmin(sc08);
                                                    break;
                                                case 3:
                                                    tambahkanAkunAdmin(sc08);
                                                    break;
                                                case 4:
                                                    keluarDataAdmin = true;
                                                    break;
                                                default:
                                                    System.out.println();
                                                    System.out.println("============================================");
                                                    System.out.println("[ Pilihan anda tidak valid!                ]");
                                                    System.out.println("[ Silahkan masukkan menu yang valid!       ]");
                                                    System.out.println("============================================");
                                                    System.out.println();
                                                    keluarDataAdmin = false;
                                                    break;
                                            }
                                        } while (!keluarDataAdmin);
                                        break;
                                    case 4:
                                        System.out.println();
                                        keluarData = true;
                                        break;
                                    default:
                                        System.out.println();
                                        System.out.println("============================================");
                                        System.out.println("[ Pilihan anda tidak valid!                ]");
                                        System.out.println("[ Silahkan masukkan menu yang valid!       ]");
                                        System.out.println("============================================");
                                        System.out.println();
                                        keluarData = false;
                                        break;
                                }
                            } while (!keluarData);
                            break;
                        case 3:
                            do {
                                System.out.println("============================================");
                                System.out.println("[           Kompensasi Mahasiswa           ]");
                                System.out.println("============================================");
                                System.out.println("[ MENU :                                   ]");
                                System.out.println("[ 1. Pembayaran Kompensasi                 ]");
                                System.out.println("[ 2. Daftar Kompensasi                     ]");
                                System.out.println("[ 3. Riwayat Kompensasi                    ]");
                                System.out.println("[ 4. Input Jam Alpha Mahasiswa             ]");
                                System.out.println("[ 5. Exit                                  ]");

                                System.out.print("Pilih menu (1/2/3?) : ");
                                int menuAdminKompensasi= sc08.nextInt();

                                switch (menuAdminKompensasi) {
                                    case 1:
                                        
                                        break;
                                    case 2:
                                        kategoriTatib();
                                        break;
                                    case 3:
                                        
                                        break;
                                    case 4:
                                        
                                        break;
                                    case 5:
                                        System.out.println();
                                        keluarKompensasi = true;
                                        break;
                                    default:
                                        System.out.println();
                                        System.out.println("============================================");
                                        System.out.println("[ Pilihan anda tidak valid!                ]");
                                        System.out.println("[ Silahkan masukkan menu yang valid!       ]");
                                        System.out.println("============================================");
                                        System.out.println();
                                        keluarKompensasi = false;
                                        break;
                                }
                            } while (!keluarKompensasi);
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            
                            break;
                        case 6:
                            if (menu == 6) {
                                System.out.println("Terimakasih telah menggunakan program ini!");
                                exitBoolean = true;
                                loginAdmin = false; 
                                break;
                            }
                        default:
                            System.out.println("============================================");
                            System.out.println("[ Pilihan anda tidak valid!                ]");
                            System.out.println("[ Silahkan masukkan menu yang valid!       ]");
                            System.out.println("============================================");
                            exitBoolean = false;
                            break;
                    }
                } while (exitBoolean != true);
            } 
            else {
                System.out.println("Username Salah!");
            }
        } while ((logoutProgram != true));
    }
    

    public static void kategoriTatib() {
        String[][] tatib = {
            {"============================================================="},
            {"[         Kategori Tata Tertib dan Kompensasi               ]"},
            {"============================================================="},
            {"1. Berkomunikasi dengan tidak sopan, baik tertulis atau tidak tertulis\r\n" + //
                "kepada mahasiswa, dosen, karyawan, atau orang lain : Tingkat V"},
            {" "},
            {" "},
            {"2 Berbusana tidak sopan dan tidak rapi. Yaitu antara lain adalah:\r\n" + //
                "berpakaian ketat, transparan, memakai t-shirt (baju kaos tidak\r\n" + //
                "berkerah), tank top, hipster, you can see, rok mini, backless, celana\r\n" + //
                "pendek, celana tiga per empat, legging, model celana atau baju\r\n" + //
                "koyak, sandal, sepatu sandal di lingkungan kampus : Tingkat IV"},
            {" "},
            {"3. Mahasiswa Iaki-laki berambut tidak rapi, gondrong yaitu panjang\r\n" + //
                "rarnbutnya melewati batas alis mata di bagian depan, telinga di\r\n" + //
                "bagian sarnping atau menyentuh kerah baju di bagian leher : Tingkat IV"},
            {" "},
            {"4. Mahasiswa berarnbut dengan model punk, dicat selain hitam dan/\r\n" + //
                "atau skinned. : Tingkat IV"},
            {" "},
            {"5. Makan, atau minum di dalam ruang kuliah/ laboratorium/ bengkel. : Tingkat IV"},
            {" "},
            {"6. Melanggar peraturan/ ketentuan yang berlaku di Polinema baik di\r\n" + //
                "Jurusan/ Program Studi : Tingkat III"},
            {" "},
            {"7. Tidak menjaga kebersihan di seluruh area Polinema : Tingkat III"},
            {" "},
            {"8. Membuat kegaduhan yang mengganggu pelaksanaan perkuliahan\r\n" + //
                "atau praktikum yang sedang berlangsung. : Tingkat III"},
            {" "},
            {"9. Merokok di luar area kawasan merokok : Tingkat III"},
            {" "},
            {"10. Bermain kartu, game online di area kampus : Tingkat III"},
            {" "},
            {"11. Mengotori atau mencoret-coret meja, kursi, tembok, dan lain-lain di\r\n" + //
                "lingkungan Polinema : Tingkat III"},
            {" "},
            {"12. Bertingkah laku kasar atau tidak sopan kepada mahasiswa, dosen,\r\n" + //
                "dan/atau karyawan. : Tingkat III"},
            {" "},
            {"13. Merusak sarana dan prasarana yang ada di area Polinema : Tingkat III"},
            {" "},
            {"14. Tidak menjaga ketertiban dan keamanan di seluruh area Polinema\r\n" + //
                "(misalnya: parkir tidak pada tempatnya, konvoi selebrasi wisuda\r\n" + //
                "dll) : Tingkat II"},
            {" "}
        };
        for (String[] row : tatib) {
            for (String element : row) {
                System.out.println(element);
            }
        }
        for (String[] row : dataTatib) {
            for (String element : row) {
                System.out.println(element);
            }
        }
    }
    public static void inputKategoriTatib(Scanner scanner) {
        System.out.println();
        System.out.println("Masukkan Tata Tertib Baru : ");
        String kategori = scanner.next();

        dataTatib.add(new String[]{kategori});
    }
    public static void kategoriKompen() {
        String[][] kompen = {
            {
                "============================================",
                "[            Kategori Kompensasi           ]",
                "============================================",
                "1. Membantu Dosen",
                "2. Membersihkan Ruangan",
                "3. Membantu Panitia",
                "4. Menjadi relawan sebagai petugas damkar",
                "5. Menjadi volunteer"
            }
        };
        for (String[] row : kompen) {
            for (String element : row) {
                System.out.println(element);
            }
        }
        for (String[] row : dataKompen) {
            for (String element : row) {
                System.out.println(element);
            }
        }
    }
    public static void inputKategoriKompen(Scanner scanner) {
        System.out.println();
        System.out.println("Masukkan Kategori Kompensasi : ");
        String kategoriKompen = scanner.next();

        dataKompen.add(new String[]{kategoriKompen});
    }
    public static void tampilkanAkunDosen() {
        System.out.println("============================================");
        System.out.println("[         Tampilkan Akun Dosen             ]");
        System.out.println("============================================");
    
        for (String[] dosen : dosenAkun) {
            displayAkunDosen(dosen);
        }
    }
    public static void displayAkunDosen(String[] dosen) {
        System.out.println("============================================");
        System.out.println("[ Username: " + dosen[0] + "              ");
        System.out.println("[ Password: " + dosen[1] + "              ");
    }
    public static void ubahAkunDosen(Scanner scanner) {
        System.out.print("Masukkan username Dosen yang ingin diubah: ");
        String username = scanner.next();

        boolean found = false;
        for (String[] dosen : dosenAkun) {
            if (username.equals(dosen[0])) {
                found = true;
                System.out.print("Masukkan password baru: ");
                String newPassword = scanner.next();
                dosen[1] = newPassword;
                System.out.println("Akun Dosen berhasil diubah.");
                break;
            }
        }
        if (!found) {
            System.out.println("Username Dosen tidak ditemukan.");
        }
    }
    public static void tambahkanAkunDosen(Scanner scanner) {
        System.out.print("Masukkan username Dosen baru: ");
        String newUsername = scanner.next();
        System.out.print("Masukkan password Dosen baru: ");
        String newPassword = scanner.next();

        String[][] newDosen = { { newUsername, newPassword } };
        dosenAkun = concatArraysDosen(dosenAkun, newDosen);

        System.out.println("Data Dosen baru berhasil ditambahkan.");
    }
    public static String[][] concatArraysDosen(String[][] arr1, String[][] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        String[][] result = new String[len1 + len2][];
        System.arraycopy(arr1, 0, result, 0, len1);
        System.arraycopy(arr2, 0, result, len1, len2);

        return result;
    }
    public static void tampilkanAkunAdmin() {
        System.out.println("============================================");
        System.out.println("[         Tampilkan Akun Admin             ]");
        System.out.println("============================================");
    
        for (String[] admin : adminAkun) {
            displayAkunAdmin(admin);
        }
    }
    public static void displayAkunAdmin(String[] admin) {
        System.out.println("============================================");
        System.out.println("[ Username: " + admin[0] + "              ");
        System.out.println("[ Password: " + admin[1] + "              ");
    }
    
    public static void ubahAkunAdmin(Scanner scanner) {
        System.out.print("Masukkan username Admin yang ingin diubah: ");
        String username = scanner.next();

        boolean found = false;
        for (String[] admin : adminAkun) {
            if (username.equals(admin[0])) {
                found = true;
                System.out.print("Masukkan password baru: ");
                String newPassword = scanner.next();
                admin[1] = newPassword;
                System.out.println("Akun Admin berhasil diubah.");
                break;
            }
        }
        if (!found) {
            System.out.println("Username Admin tidak ditemukan.");
        }
    }
    public static void tambahkanAkunAdmin(Scanner scanner) {
        System.out.print("Masukkan username Admin baru: ");
        String newUsername = scanner.next();
        System.out.print("Masukkan password Admin baru: ");
        String newPassword = scanner.next();

        String[][] newAdmin = { { newUsername, newPassword } };
        adminAkun = concatArraysAdmin(adminAkun, newAdmin);

        System.out.println("Data Admin baru berhasil ditambahkan.");
    }
    public static String[][] concatArraysAdmin(String[][] arr1, String[][] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        String[][] result = new String[len1 + len2][];
        System.arraycopy(arr1, 0, result, 0, len1);
        System.arraycopy(arr2, 0, result, len1, len2);

        return result;
    }
    public static void ubahAkunMahasiswa(Scanner scanner) {
        System.out.print("Masukkan username Mahasiswa yang ingin diubah: ");
        String username = scanner.next();

        boolean found = false;
        for (String[] mahasiswa : mahasiswaAkun) {
            if (username.equals(mahasiswa[0])) {
                found = true;
                System.out.print("Masukkan password baru: ");
                String newPassword = scanner.next();
                mahasiswa[1] = newPassword;
                System.out.println("Akun Mahasiswa berhasil diubah.");
                break;
            }
        }
        if (!found) {
            System.out.println("Username Mahasiswa tidak ditemukan.");
        }
    }
    public static void tambahkanAkunMahasiswa(Scanner scanner) {
        System.out.print("Masukkan username Mahasiswa baru: ");
        String newUsername = scanner.next();
        System.out.print("Masukkan password Mahasiswa baru: ");
        String newPassword = scanner.next();

        String[][] newMahasiswa = { { newUsername, newPassword } };
        mahasiswaAkun = concatArrays(mahasiswaAkun, newMahasiswa);

        System.out.println("Akun Mahasiswa baru berhasil ditambahkan.");
    }
    public static String[][] concatArraysMahasiswa(String[][] arr1, String[][] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        String[][] result = new String[len1 + len2][];
        System.arraycopy(arr1, 0, result, 0, len1);
        System.arraycopy(arr2, 0, result, len1, len2);

        return result;
    }
    public static void ubahDataMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM Mahasiswa yang ingin diubah : ");
        String nim = scanner.next();

        boolean found = false;
        for (String[] mahasiswa : dataMahasiswa) {
            if (nim.equals(mahasiswa[1])) {
                found = true;

                System.out.println("Data Mahasiswa sebelum diubah:");
                displayDataMahasiswa(mahasiswa);

                System.out.print("Masukkan Nama baru: ");
                mahasiswa[0] = scanner.nextLine();

                System.out.print("Masukkan Prodi baru: ");
                mahasiswa[2] = scanner.nextLine();

                System.out.print("Masukkan Jurusan baru: ");
                mahasiswa[3] = scanner.nextLine();

                System.out.print("Masukkan Kelas baru: ");
                mahasiswa[4] = scanner.nextLine();

                System.out.print("Masukkan Absen baru: ");
                mahasiswa[5] = scanner.nextLine();

                System.out.println("Data Mahasiswa berhasil diubah.");
                System.out.println("Data Mahasiswa setelah diubah:");
                displayDataMahasiswa(mahasiswa);

                break;
            }
        }
        if (!found) {
            System.out.println("NIM Mahasiswa tidak ditemukan.");
        }
    }
    public static void tambahkanDataMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM Mahasiswa baru: ");
        String nimBaru = scanner.nextLine();
        scanner.nextLine();

        boolean found = false;
        for (String[] mahasiswa : dataMahasiswa) {
            if (nimBaru.equals(mahasiswa[1])) {
                found = true;
                System.out.println("NIM Mahasiswa sudah ada. Tambahkan data gagal.");
                break;
            }
        }
        if (!found) {
            String[] newMahasiswa = new String[6];
            newMahasiswa[1] = nimBaru;

            System.out.print("Masukkan Nama Mahasiswa: ");
            newMahasiswa[0] = scanner.nextLine();

            System.out.print("Masukkan Prodi Mahasiswa: ");
            newMahasiswa[2] = scanner.nextLine();

            System.out.print("Masukkan Jurusan Mahasiswa: ");
            newMahasiswa[3] = scanner.nextLine();

            System.out.print("Masukkan Kelas Mahasiswa: ");
            newMahasiswa[4] = scanner.nextLine();

            System.out.print("Masukkan Absen Mahasiswa: ");
            newMahasiswa[5] = scanner.nextLine();

            dataMahasiswa = concatArrays(dataMahasiswa, new String[][] { newMahasiswa });

            System.out.println("Data Mahasiswa baru berhasil ditambahkan.");
        }
    }
    public static void tampilkanDataMahasiswa() {
        System.out.println("============================================");
        for (String[] mahasiswa : dataMahasiswa) {
            displayDataMahasiswa(mahasiswa);
            System.out.println("============================================");
        }
    }
    public static void displayDataMahasiswa(String[] mahasiswa) {
        System.out.println("============================================");
        System.out.println("[ Nama: " + mahasiswa[0] + "              ");
        System.out.println("[ NIM: " + mahasiswa[1] + "               ");
        System.out.println("[ Prodi: " + mahasiswa[2] + "             ");
        System.out.println("[ Jurusan: " + mahasiswa[3] + "           ");
        System.out.println("[ Kelas: " + mahasiswa[4] + "             ");
        System.out.println("[ Nomor Absen: " + mahasiswa[5] + "       ");
    }
    public static void tampilkanAkunMahasiswa() {
        System.out.println("============================================");
        System.out.println("[         Tampilkan Akun Mahasiswa          ]");
        System.out.println("============================================");
    
        for (String[] mahasiswa : mahasiswaAkun) {
            displayAkunMahasiswa(mahasiswa);
        }
    }
    
    public static void displayAkunMahasiswa(String[] mahasiswa) {
        System.out.println("============================================");
        System.out.println("[ Nama: " + mahasiswa[0] + "              ");
        System.out.println("[ Password: " + mahasiswa[1] + "          ");
    }
    
    public static String[][] concatArrays(String[][] arr1, String[][] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        String[][] result = new String[len1 + len2][];
        System.arraycopy(arr1, 0, result, 0, len1);
        System.arraycopy(arr2, 0, result, len1, len2);

        return result;
    }
}
