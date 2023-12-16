import java.util.Objects;
import java.util.Scanner;

public class Final {
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
            { "Adham Baskara", "2341720199", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G", "02", "", "",
                    "", "", "", "" },
            { "Ayleen Ruhul Qisthy", "2341720012", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G", "07", "",
                    "", "", "", "", "" },
            { "Marsya Aurelia Sefira", "2341720011", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G", "18",
                    "", "", "", "", "", "" }
    };

    static String[][] riwayatTransaksi = new String[1][12];

    static String[][] kompen = {
            {
                    "+=================================================================================+",
                    "[                              Kompensasi Mahasiswa                               ]",
                    "+=================================================================================+",
                    "| a. Kompensasi merupakan penggantian waktu yang dibebankan kepada mahasiswa atas |",
                    "|    ketidakhadirannya karena alpa.                                               |",
                    "| b. Kompensasi tidak menghapuskan jumlah ketidakhadiran                          |",
                    "| c. Bentuk dan pelaksanaan kompensasi diatur berazaskan pakta integritas oleh    |",
                    "|    jurusan berupa kegiatan yang berimplikasi terhadap peningkatan pengetahuan,  |",
                    "|    keterampilan, kedisiplinan, dan loyalitas almamater.                         |",
                    "| d. Besarnya kompensasi ditentukan berdasarkan jumlah jam alpa dikalikan dua.    |",
                    "| e. Kompensasi dilaksanakan setelah jam pelajaran resmi berakhir atau pada saat  |",
                    "|    liburan dan pelaksanaan serta bentuk kompensasi dan sanksi bagi yang tidak   |",
                    "|    melaksanakan kompensasi ditentukan oleh jurusan.                             |",
                    "| f. Penandatanganan persetujuan KRS tidak dapat diberikan oleh Dosen Pembina     |",
                    "|    Akademik (DPA) jika mahasiswa belum melaksanakan kompensasi semester         |",
                    "|    sebelumnya.                                                                  |",
                    "+=================================================================================+",
            }
    };

    static String[][] pembayaranKompen = {
            {
                    "+=================================================================================+",
                    "[                          Kategori Pembayaran Kompensasi                         ]",
                    "+=================================================================================+",
                    "| 1. Membantu Dosen                                                               |",
                    "| 2. Membersihkan Ruangan                                                         |",
                    "| 3. Membantu Panitia                                                             |",
                    "| 4. Menjadi relawan sebagai petugas damkar                                       |",
                    "| 5. Menjadi volunteer                                                            |",
                    "+=================================================================================+",
                    " "
            }
    };

    static String[][] tatib = {
            {
                    "+=================================================================================+",
                    "[                              Tata Tertib Mahasiswa                              ]",
                    "+=================================================================================+",
                    "| 1.  Terlibat dalam tindakan kriminal dan dinyatakan bersalah oleh |  Tingkat 1  |",
                    "|     Pengadilan                                                    |             |",
                    "| 2.  Mengedarkan serta menjual barang-barang psikotropika dan atau |  Tingkat 1  |",
                    "|     zat-zat Adiktif lainnya                                       |             |",
                    "| 3.  Menggunakan barang-barang psikotropika dan/ atau zat-zat      |  Tingkat 1  |",
                    "|     Adiktif lainnya                                               |             |",
                    "| 4.  Melakukan kegiatan atau sejenisnya yang dapat menurunkan      |  Tingkat 1  |",
                    "|     kehormatan atau martabat Negara, Bangsa dan Polinema.         |             |",
                    "| 5.  Melakukan plagiasi (copy paste) dalam tugas-tugas atau karya  | Tingkat 1/2 |",
                    "|     ilmiah                                                        |             |",
                    "| 6.  Melakukan pemalsuan data / dokumen / tanda tangan.            | Tingkat 1/2 |",
                    "| 7.  Melakukan pemerasan dan/atau penipuan.                        | Tingkat 1/2 |",
                    "| 8.  Melakukan kecurangan dalam bidang akademik, administratif,    | Tingkat 1/2 |",
                    "|     dan keuangan                                                  |             |",
                    "| 9.  Mengancam, baik tertulis atau tidak tertulis kepada mahasiswa |  Tingkat 2  |",
                    "|     dosen, dan/atau karyawan.                                     |             |",
                    "| 10. Melakukan tindakan kekerasan atau perkelahian di dalam        |  Tingkat 2  |",
                    "|     kampus.                                                       |             |",
                    "| 11. Membawa dan/atau menggunakan senjata tajam dan/atau senjata   |  Tingkat 2  |",
                    "|     api untuk hal kriminal                                        |             |",
                    "| 12. Melakukan pengotoran / pengrusakan barang milik orang lain    |  Tingkat 2  |",
                    "|     termasuk milik Politeknik Negeri Malang                       |             |",
                    "| 13. Bertingkah laku kasar atau tidak sopan kepada mahasiswa,      |  Tingkat 3  |",
                    "|     dosen, dan/atau karyawan.                                     |             |",
                    "| 14. Merokok di luar area kawasan merokok                          |  Tingkat 3  |",
                    "| 15. Melanggar peraturan/ ketentuan yang berlaku di Polinema baik  |  Tingkat 3  |",
                    "|     di Jurusan/ Program Studi                                     |             |",
                    "| 16. Makan atau minum di dalam ruang kuliah/ laboratorium/ bengkel |  Tingkat 4  |",
                    "| 17. Mahasiswa berambut dengan model punk, dicat selain hitam dan  |  Tingkat 4  |",
                    "|     atau skinned.                                                 |             |",
                    "| 18. Mahasiswa Iaki-laki berambut tidak rapi gondrong yaitu        |  Tingkat 4  |",
                    "|     panjang rambutnya melewati batas alis mata di bagian depan.   |             |",
                    "| 19. Berbusana tidak sopan dan tidak rapi, yaitu antara lain       |  Tingkat 4  |",
                    "|     adalah berpakaian ketat, transparan, memakai t-shirt.         |             |",
                    "| 20. Berkomunikasi dengan tidak sopan, baik tertulis atau tidak    |  Tingkat 5  |",
                    "|     tertulis kepada mahasiswa, dosen, karyawan, atau orang lain.  |             |",
                    "+=================================================================================+",
            }
    };

    static String[][] pembayaranTatib = {
            {
                    "+=================================================================================+",
                    "[                           Kategori Sanksi Pelanggaran                           ]",
                    "+=================================================================================+",
                    "| 1. Teguran lisan disertai surat pernyataan tidak mengulangi       |  Tingkat 5  |",
                    "|    perbuatan, dibubuhi materai, ditandatangani mahasiswa dan DPA  |             |",
                    "| 2. Teguran lisan disertai surat pernyataan tidak mengulangi       |  Tingkat 4  |",
                    "|    perbuatan, dibubuhi materai, ditandatangani mahasiswa dan DPA  |             |",
                    "| 3. Membuat surat pernyataan tidak mengulangi perbuatan tersebut   |  Tingkat 3  |",
                    "|    dibubuhi materai, ditandatangani mahasiswa dan DPA.            |             |",
                    "|    Melakukan tugas khusus, misalnya bertanggungjawab untuk        |             |",
                    "|    memperbaiki atau membersihkan kembali, dan tugas-tugas lainnya |             |",
                    "| 4. Dikenakan penggantian kerugian atau penggantian benda/barang,  |  Tingkat 2  |",
                    "|    Melakukan tugas layanan sosial dalam jangka waktu tertentu,    |             |",
                    "|    Diberikan nilai D pada mata kuliah terkait saat melakukan      |             |",
                    "|    pelanggaran.                                                   |             |",
                    "| 5. Dinonaktifkan (Cuti Akademik/ Terminal) selama dua semester,   |  Tingkat 1  |",
                    "|    Diberhentikan sebagai mahasiswa.                               |             |",
                    "+=================================================================================+",
                    " "
            }
    };
    static int indeksAkun =-1;
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        boolean run = true, loginAdmin = false, loginMahasiswa = false, loginDosen = false, paswordSalah = false,
                exitBoolean = false, logout = false, logoutDosen = false, logoutMahasiswa = false,
                logoutProgram = false, keluarKategori = false, keluarPelaporan = false, keluarTanggapan = false,
                keluarData = false, keluarDataDosen = false, keluarDataAdmin = false, keluarDataMahasiswa = false,
                keluarKompensasi = false, keluarKompensasiPembayaran = false;
        String feedbackDosen, exit, kompen;
        int poin = 0, jamAlfaK = 0, jamKompensasiK = 0, jatahKompen, jatahKompenSelesai;

        do {
            boolean iscont = true;

            System.out.println("============================================");
            System.out.println("[                  LOGIN                   ]");
            System.out.println("============================================");
            System.out.println("[ Pilih Login sebagai :                    ]");
            System.out.println("[ 1. Login Admin                           ]");
            System.out.println("[ 2. Login Mahasiswa                       ]");
            System.out.println("[ 3. Login Dosen                           ]");
            System.out.println("[ 4. Exit                                  ]");
            System.out.print("Pilih menu (1/2/3): ");
            int login = sc08.nextInt();

            if (login == 4) {
                System.out.println("Terimakasih anda telah menggunakan program ini!");
                logoutProgram = true;
                break;
            } else if (login > 4) {
                System.out.println("Peran Login yang anda pilih tidak valid");
                iscont = false;
                continue;
            }
            System.out.println();
            System.out.print("Masukkan Username: ");
            String inputuser = sc08.next();

            System.out.print("Masukkan Password: ");
            String inputpassword = sc08.next();

            System.out.println();

            if (login == 1) {
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
            } else if (login == 2) {
                for (int j = 0; j < mahasiswaAkun.length; j++) {
                    if (inputuser.equals(mahasiswaAkun[j][0])) {
                        if (inputpassword.equals(mahasiswaAkun[j][1])) {
                            loginMahasiswa = true;
                            paswordSalah = false;
                            indeksAkun = j;
                            break;
                        } else {
                            loginMahasiswa = false;
                            paswordSalah = true;
                        }
                    } else {
                        loginMahasiswa = false;
                    }
                }
            } else if (login == 3) {
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
                            tampilkanTatib();
                            tampilkanPembayaranTatib();
                            tampilkanKompen();
                            tampilkanPembayaranKompen();
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
                            tampilkanPembayaranKompen();
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
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.println("=======================================================");
                            System.out.print("Pilihan anda: ");
                            menu = sc08.nextInt();
                            if (menu == 1) {
                                System.out.println("Ingin mengedit password anda?");
                                mahasiswaAkun[indeksAkun][1] = sc08.next();
                            } else if (menu == 2) {
                                break;
                            }
                            break;
                        case 9:
                            if (menu == 9) {
                                System.out.println("Terimakasih telah menggunakan program ini!");
                                System.out.println();
                                exitBoolean = true;
                                loginAdmin = false;
                                break;
                            }
                    }
                } while (exitBoolean != true);
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
                            if (menu == 5) {
                                System.out.println("Terimakasih telah menggunakan program ini!");
                                System.out.println();
                                exitBoolean = true;
                                loginDosen = false;
                                break;
                            }
                    }
                } while (exitBoolean != true);

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
                    System.out.println("[ 6. Cek Data Mahasiswa                    ]");
                    System.out.println("[ 7. Riwayat                               ]");
                    System.out.println("[ 8. Logout                                ]");

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
                                System.out.println("[ 2. Kategori Kompensasi                   ]");
                                System.out.println("[ 3. Exit                                  ]");

                                System.out.print("Pilih menu (1/2/3?) : ");
                                int menuAdminTatib = sc08.nextInt();

                                switch (menuAdminTatib) {
                                    case 1:
                                        System.out.println();
                                        tampilkanTatib();
                                        tampilkanPembayaranTatib();
                                        System.out.print("Exit (true/false) : ");
                                        keluarKategori = sc08.nextBoolean();
                                        System.out.println();
                                        break;
                                    case 2:
                                        System.out.println();
                                        tampilkanKompen();
                                        tampilkanPembayaranKompen();
                                        System.out.print("Exit (true/false) : ");
                                        keluarKategori = sc08.nextBoolean();
                                        System.out.println();
                                        break;
                                    case 3:
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
                                int menuAdminData = sc08.nextInt();

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
                                            int menuAdminDataDosen = sc08.nextInt();

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
                                            int menuAdminDataMahasiswa = sc08.nextInt();

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
                                            int menuAdminDataAdmin = sc08.nextInt();

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
                                        System.out.println("======================================5======");
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
                                System.out.println("[ 2. Pembayaran Sanksi                     ]");
                                System.out.println("[ 3. Input Jam Alpha Mahasiswa             ]");
                                System.out.println("[ 4. Daftar Jam Kompensasi                 ]");
                                System.out.println("[ 5. Exit                                  ]");

                                System.out.print("Pilih menu (1/2/3?) : ");
                                int menuAdminKompensasi = sc08.nextInt();

                                switch (menuAdminKompensasi) {
                                    case 1:
                                        tambahkanPembayaranKompen(sc08);
                                        break;
                                    case 2:
                                        tambahkanPembayaranTatib(sc08);
                                        break;
                                    case 3:
                                        tambahkanJamAlpha(sc08);
                                        break;
                                    case 4:
                                        daftarKompensasiMahasiswa(sc08);
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
                            laporPelanggaran(sc08);
                            break;
                        case 5:
                            feedback(sc08);
                            break;
                        case 6:
                            tampilkanData();
                            break;
                        case 7:
                            tampilkanRiwayat();
                            break;
                        case 8:
                            if (menu == 8) {
                                System.out.println("Terimakasih telah menggunakan program ini!");
                                System.out.println();
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
            } else {
                System.out.println("Username Salah!");
            }
        } while ((logoutProgram != true));
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
                System.out.println();
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

    public static void tambahkanPembayaranKompen(Scanner sc08) {
        boolean keluarKompensasiPembayaran = false;
        do {
            System.out.println("============================================");
            System.out.println("[          Pembayaran Kompensasi           ]");
            System.out.println("============================================");
            System.out.println("[ Daftar Mahasiswa :                       ]");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println((i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("Pilih nomor mahasiswa (0 to exit): ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                break;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {
                tampilkanPembayaranKompen();

                System.out.print("Apakah ingin menambahkan Pembayaran Kompensasi (ya/tidak) : ");
                String inputKompen = sc08.next();

                switch (inputKompen) {
                    case "ya":
                        System.out.print("Pilih Salah Satu (1/2/3) : ");
                        int pilihan = sc08.nextInt();

                        if (pilihan >= 1 && pilihan <= 5) {
                            String[] inputPembayaranKompen = inputKategoriKompen(sc08, pilihan);
                            updateArray(dataMahasiswa, selectedMahasiswa - 1, inputPembayaranKompen);
                            System.out.println("Pembayaran Kompensasi berhasil ditambahkan.");
                        } else {
                            System.out.println("Pilihan yang Anda masukkan tidak valid!");
                        }
                        break;
                    case "tidak":
                        System.out.print("Apakah sudah menyelesaikan Pembayaran Kompen (sudah/belum)? : ");
                        String input = sc08.next();

                        if (input.equalsIgnoreCase("sudah")) {
                            String sudah = "Sudah Menyelesaikan Kompen";
                            String[] inputPembayaranKompen = { sudah };
                            updateArray(dataMahasiswa, selectedMahasiswa - 1, inputPembayaranKompen);
                            System.out.println("Pembayaran Sanksi Tata tertib telah di perbarui!");
                        } else {
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Input Anda tidak valid!");
                        break;
                }
            }
        } while (!keluarKompensasiPembayaran);
    }

    private static void updateArray(String[][] array, int rowIndex, String[] newData) {
        String[][] tempArray = new String[array.length][array[rowIndex].length + newData.length]; //
        String[][] tempArray2 = new String[riwayatTransaksi.length + 1][riwayatTransaksi[0].length]; //

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tempArray[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < riwayatTransaksi.length; i++) { //
            for (int j = 0; j < riwayatTransaksi[i].length; j++) { //
                tempArray2[i][j] = riwayatTransaksi[i][j]; //
            }
        }
        for (int index = 0; index < array.length; index++) { //
            if (index == rowIndex) {
                for (int j = 0; j <= 5; j++) {
                    tempArray2[riwayatTransaksi.length][j] = array[index][j];
                }
                break;
            }
        }
        tempArray[rowIndex][6] = newData[0];
        tempArray2[riwayatTransaksi.length][6] = newData[0]; //
        dataMahasiswa = tempArray;
        riwayatTransaksi = tempArray2; //
    }

    public static String[] inputKategoriKompen(Scanner scanner, int pilihan) {
        String[] kategori = null;
        switch (pilihan) {
            case 1:
                kategori = new String[] { "Membantu Dosen" };
                break;
            case 2:
                kategori = new String[] { "Membersihkan Ruangan" };
                break;
            case 3:
                kategori = new String[] { "Membantu Panitia" };
                break;
            case 4:
                kategori = new String[] { "Menjadi relawan sebagai petugas damkar" };
                break;
            case 5:
                kategori = new String[] { "Menjadi volunteer" };
                break;
        }
        return kategori;
    }

    private static void tampilkanData() {
        System.out.println("+=================================================================================+");
        System.out.println("[                                 Data Mahasiswa                                  ]");
        System.out.println("+=================================================================================+");

        for (int i = 0; i < dataMahasiswa.length; i++) {
            String[] mahasiswa = dataMahasiswa[i];

            System.out.println();
            System.out.println("| Nama Mahasiswa           : " + mahasiswa[0]);
            System.out.println("| NIM                      : " + mahasiswa[1]);
            System.out.println("| Jurusan                  : " + mahasiswa[2]);
            System.out.println("| Prodi                    : " + mahasiswa[3]);
            System.out.println("| Kelas                    : " + mahasiswa[4]);
            System.out.println("| Nomor Absen              : " + mahasiswa[5]);
            System.out.println("| Jam Alpha                : " + mahasiswa[10]);
            System.out.println("| Total Jam Kompensasi     : " + mahasiswa[8]);
            System.out.println("| Kategori Kompen          : " + mahasiswa[6]);
            System.out.println("| Pelanggaran Tata Tertib  : " + mahasiswa[9]);
            System.out.println("| Kategori Sanksi          : " + mahasiswa[7]);
            System.out.println("| Feedback / Tanggapan     : " + mahasiswa[11]);

            System.out.println("+=================================================================================+");

        }
    }

    private static void tampilkanRiwayat() {
        System.out.println("+=================================================================================+");
        System.out.println("[                                 Data Mahasiswa                                  ]");
        System.out.println("+=================================================================================+");

        for (int i = 1; i < riwayatTransaksi.length; i++) {
            String[] mahasiswa = riwayatTransaksi[i];

            System.out.println();
            System.out.println("| Nama Mahasiswa           : " + mahasiswa[0]);
            System.out.println("| NIM                      : " + mahasiswa[1]);
            System.out.println("| Jurusan                  : " + mahasiswa[2]);
            System.out.println("| Prodi                    : " + mahasiswa[3]);
            System.out.println("| Kelas                    : " + mahasiswa[4]);
            System.out.println("| Nomor Absen              : " + mahasiswa[5]);
            System.out.println("| Jam Alpha                : " + Objects.toString(mahasiswa[10], ""));
            System.out.println("| Pelanggaran Tata Tertib  : " + Objects.toString(mahasiswa[9], ""));
            System.out.println("| Kategori Kompen          : " + Objects.toString(mahasiswa[6], ""));
            System.out.println("| Kategori Sanksi          : " + Objects.toString(mahasiswa[7], ""));
            System.out.println("| Total Jam Kompensasi     : " + Objects.toString(mahasiswa[8], ""));
            System.out.println("| Feedback / Tanggapan     : " + Objects.toString(mahasiswa[11], ""));

            System.out.println("+=================================================================================+");
        }
    }

    public static void tampilkanKompen() {
        for (int i = 0; i < kompen.length; i++) {
            for (int j = 0; j < kompen[i].length; j++) {
                System.out.println(kompen[i][j]);
            }
        }
    }

    public static void tampilkanTatib() {
        for (int i = 0; i < tatib.length; i++) {
            for (int j = 0; j < tatib[i].length; j++) {
                System.out.println(tatib[i][j]);
            }
        }
    }

    public static void tampilkanPembayaranKompen() {
        for (int i = 0; i < pembayaranKompen.length; i++) {
            for (int j = 0; j < pembayaranKompen[i].length; j++) {
                System.out.println(pembayaranKompen[i][j]);
            }
        }
    }

    public static void tampilkanPembayaranTatib() {
        for (int i = 0; i < pembayaranTatib.length; i++) {
            for (int j = 0; j < pembayaranTatib[i].length; j++) {
                System.out.println(pembayaranTatib[i][j]);
            }
        }
    }

    public static void tambahkanPembayaranTatib(Scanner sc08) {
        boolean keluarTatibPembayaran = false;
        do {
            System.out.println("============================================");
            System.out.println("[             Pembayaran Sanksi            ]");
            System.out.println("============================================");
            System.out.println("[ Daftar Mahasiswa :                       ]");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println((i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("Pilih nomor mahasiswa (0 to exit): ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                break;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {
                tampilkanPembayaranTatib();

                System.out.print("Apakah ingin menambahkan Sanksi (ya/tidak) : ");
                String inputSanksi = sc08.next();

                switch (inputSanksi) {
                    case "ya":
                        System.out.print("Pilih Salah Satu (1/2/3) : ");
                        int pilihan = sc08.nextInt();

                        if (pilihan >= 1 && pilihan <= 5) {
                            String[] inputPembayaranSanksi = inputSanksiTatib(sc08, pilihan);
                            updateArraytatib(dataMahasiswa, selectedMahasiswa - 1, inputPembayaranSanksi);
                            System.out.println("Pembayaran Sanksi Tata tertib berhasil ditambahkan.");
                        } else {
                            System.out.println("Pilihan yang Anda masukkan tidak valid.");
                        }
                        break;
                    case "tidak":
                        System.out.print("Apakah sudah menyelesaikan Sanksi tatib (sudah/belum)? : ");
                        String input = sc08.next();

                        if (input.equalsIgnoreCase("sudah")) {
                            String sudah = "Sudah Menyelesaikan Sanksi";
                            String[] inputPembayaranSanksi = { sudah };
                            updateArraytatib(dataMahasiswa, selectedMahasiswa - 1, inputPembayaranSanksi);
                            System.out.println("Pembayaran Sanksi Tata tertib telah di perbarui!");
                        } else {
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Input Anda tidak valid!");
                        break;
                }
            }
        } while (!keluarTatibPembayaran);
    }

    private static void updateArraytatib(String[][] array, int rowIndex, String[] newData) {
        String[][] tempArray = new String[array.length][array[rowIndex].length + newData.length]; //
        String[][] tempArray2 = new String[riwayatTransaksi.length + 1][riwayatTransaksi[0].length]; //

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tempArray[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < riwayatTransaksi.length; i++) { //
            for (int j = 0; j < riwayatTransaksi[i].length; j++) { //
                tempArray2[i][j] = riwayatTransaksi[i][j]; //
            }
        }
        for (int index = 0; index < array.length; index++) { //
            if (index == rowIndex) {
                for (int j = 0; j <= 5; j++) {
                    tempArray2[riwayatTransaksi.length][j] = array[index][j];
                }
                break;
            }
        }
        tempArray[rowIndex][7] = newData[0];
        tempArray2[riwayatTransaksi.length][7] = newData[0]; //
        dataMahasiswa = tempArray;
        riwayatTransaksi = tempArray2; //
    }

    public static String[] inputSanksiTatib(Scanner scanner, int pilihan) {
        String[] kategori = null;
        switch (pilihan) {
            case 1:
                kategori = new String[] { "Teguran lisan disertai surat pernyataan tidak mengulangi\n" +
                        "                             perbuatan, dibubuhi materai, ditandatangani mahasiswa dan DPA" };
                break;
            case 2:
                kategori = new String[] { "Teguran lisan disertai surat pernyataan tidak mengulangi\n" +
                        "                             perbuatan, dibubuhi materai, ditandatangani mahasiswa dan DPA" };
                break;
            case 3:
                kategori = new String[] { "Membuat surat pernyataan tidak mengulangi perbuatan tersebut\n" +
                        "                             dibubuhi materai, ditandatangani mahasiswa dan DPA.\n" +
                        "                             Melakukan tugas khusus, misalnya bertanggung jawab untuk.\n" +
                        "                             Memperbaiki atau membersihkan kembali, dan tugas-tugas lainnya" };
                break;
            case 4:
                kategori = new String[] { "Dikenakan penggantian kerugian atau penggantian benda/barang. \n" +
                        "                             Melakukan tugas layanan sosial dalam jangka waktu tertentu.\n" +
                        "                             Diberikan nilai D pada mata kuliah terkait saat melakukan\n" +
                        "                             pelanggaran." };
                break;
            case 5:
                kategori = new String[] { "Dinonaktifkan (Cuti Akademik/ Terminal) selama dua semester.\n" +
                        "                             Atau diberhentikan sebagai mahasiswa." };
                break;
        }
        return kategori;
    }

    public static void tambahkanJamAlpha(Scanner sc08) {
        boolean keluar = false;
        // int totalAlpha = 0;

        do {
            System.out.println("============================================");
            System.out.println("[                 Jam Alpha                ]");
            System.out.println("============================================");
            System.out.println("[ Daftar Mahasiswa :                       ]");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println((i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("Pilih nomor mahasiswa (0 to exit): ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                keluar = true;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {
                System.out.print("Masukkan Jam Alpha  : ");
                int jamAlfaK = sc08.nextInt();

                // totalAlpha += jamAlfaK;

                int jamKompensasiK = jamAlfaK * 2;

                String[] inputJamAlpha = { String.valueOf(jamAlfaK) };
                updateArrayAlpha(dataMahasiswa, selectedMahasiswa - 1, inputJamAlpha);

                String[] inputSisaJamAlpha = { String.valueOf(jamKompensasiK) };
                updateArraySisaAlpha(dataMahasiswa, selectedMahasiswa - 1, inputSisaJamAlpha);
            }
        } while (!keluar);
    }

    private static void updateArrayAlpha(String[][] array, int rowIndex, String[] newData) {
        String[][] tempArray = new String[array.length][array[rowIndex].length + newData.length]; //
        String[][] tempArray2 = new String[riwayatTransaksi.length + 1][riwayatTransaksi[0].length]; //

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tempArray[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < riwayatTransaksi.length; i++) { //
            for (int j = 0; j < riwayatTransaksi[i].length; j++) { //
                tempArray2[i][j] = riwayatTransaksi[i][j]; //
            }
        }
        for (int index = 0; index < array.length; index++) { //
            if (index == rowIndex) {
                for (int j = 0; j <= 5; j++) {
                    tempArray2[riwayatTransaksi.length][j] = array[index][j];
                }
                break;
            }
        }
        tempArray[rowIndex][10] = newData[0];
        tempArray2[riwayatTransaksi.length][10] = newData[0]; //
        dataMahasiswa = tempArray;
        riwayatTransaksi = tempArray2;
    }

    public static void daftarKompensasiMahasiswa(Scanner sc08) {
        boolean keluar = false;
        do {
            System.out.println("============================================");
            System.out.println("[             Daftar Kompensasi            ]");
            System.out.println("============================================");
            System.out.println("[ Daftar Mahasiswa :                       ]");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println((i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("Pilih nomor mahasiswa (0 to exit): ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                keluar = true;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {

                System.out.print("Masukkan jam kompensasi yang sudah diselesaikan : ");
                int selesaiJamAlfaK = sc08.nextInt();
                int jatahKompen = Integer.parseInt(dataMahasiswa[selectedMahasiswa - 1][8]);

                if (selesaiJamAlfaK <= jatahKompen) {
                    jatahKompen -= selesaiJamAlfaK;
                    System.out.println();
                    // System.out.println("Sisa jam kompen yang belum diselesaikan: " +
                    // jatahKompen);
                } else {
                    System.out.println("Input Anda tidak valid!");
                }

                String[] inputJamAlpha = { String.valueOf(jatahKompen) };
                updateArraySisaAlpha(dataMahasiswa, selectedMahasiswa - 1, inputJamAlpha);
            }
        } while (!keluar);
    }

    private static void updateArraySisaAlpha(String[][] array, int rowIndex, String[] newData) {
        String[][] tempArray = new String[array.length][array[rowIndex].length + newData.length]; //
        String[][] tempArray2 = new String[riwayatTransaksi.length + 1][riwayatTransaksi[0].length]; //

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tempArray[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < riwayatTransaksi.length; i++) {
            for (int j = 0; j < riwayatTransaksi[i].length; j++) {
                tempArray2[i][j] = riwayatTransaksi[i][j];
            }
        }
        for (int index = 0; index < array.length; index++) {
            if (index == rowIndex) {
                for (int j = 0; j <= 5; j++) {
                    tempArray2[riwayatTransaksi.length][j] = array[index][j];
                }
                break;
            }
        }
        tempArray[rowIndex][8] = newData[0];
        tempArray2[riwayatTransaksi.length][8] = newData[0];
        dataMahasiswa = tempArray;
        riwayatTransaksi = tempArray2;
    }

    public static void laporPelanggaran(Scanner sc08) {
        boolean keluar = false;
        do {
            System.out.println("============================================");
            System.out.println("[           Pelaporan Pelanggaran          ]");
            System.out.println("============================================");
            System.out.println("[ Daftar Mahasiswa :                       ]");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println((i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("Pilih nomor mahasiswa (0 to exit): ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                keluar = true;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {
                tampilkanTatib();

                System.out.print("Apakah ingin menambahkan pelanggaran (ya/tidak) : ");
                String inputPelanggaran = sc08.next();

                switch (inputPelanggaran) {
                    case "ya":
                        System.out.print("Pilih Salah Satu (1/2/3): ");
                        int pilihan = sc08.nextInt();

                        if (pilihan >= 1 && pilihan <= 20) {
                            String[] inputLaporTatib = inputKategoriTatib(sc08, pilihan);
                            updateArrayLapor(dataMahasiswa, selectedMahasiswa - 1, inputLaporTatib);
                            System.out.println("Laporan pelanggaran tata tertib berhasil ditambahkan!");
                        } else {
                            System.out.println("Pilihan yang Anda masukkan tidak valid.");
                        }
                        break;
                    case "tidak":
                        System.out.print("Apakah ingin menghapus Pelanggaran Tatib (ya/tidak)? : ");
                        String input = sc08.next();

                        if (input.equalsIgnoreCase("ya")) {
                            String ya = " ";
                            String[] inputLapor = { ya };
                            updateArrayLapor(dataMahasiswa, selectedMahasiswa - 1, inputLapor);
                            System.out.println("Laporan pelanggaran tata tertib telah di perbarui!");
                        } else {
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Input Anda tidak valid!");
                        break;
                }
            }
        } while (!keluar);
    }

    private static void updateArrayLapor(String[][] array, int rowIndex, String[] newData) {
        String[][] tempArray = new String[array.length][array[rowIndex].length + newData.length];
        String[][] tempArray2 = new String[riwayatTransaksi.length + 1][riwayatTransaksi[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tempArray[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < riwayatTransaksi.length; i++) { //
            for (int j = 0; j < riwayatTransaksi[i].length; j++) { //
                tempArray2[i][j] = riwayatTransaksi[i][j]; //
            }
        }
        for (int index = 0; index < array.length; index++) { //
            if (index == rowIndex) {
                for (int j = 0; j <= 5; j++) {
                    tempArray2[riwayatTransaksi.length][j] = array[index][j];
                }
                break;
            }
        }
        tempArray[rowIndex][9] = newData[0];
        tempArray2[riwayatTransaksi.length][9] = newData[0];
        dataMahasiswa = tempArray;
        riwayatTransaksi = tempArray2;
    }

    public static String[] inputKategoriTatib(Scanner scanner, int pilihan) {
        String[] kategori = null;
        switch (pilihan) {
            case 1:
                kategori = new String[] { "Terlibat dalam tindakan kriminal dan dinyatakan bersalah oleh\n" +
                        "                             Pengadilan" };
                break;
            case 2:
                kategori = new String[] { "Mengedarkan serta menjual barang-barang psikotropika dan atau\n" +
                        "                             zat-zat Adiktif lainnya" };
                break;
            case 3:
                kategori = new String[] { "Menggunakan barang-barang psikotropika dan/ atau zat-zat\n" +
                        "                             Adiktif lainnya" };
                break;
            case 4:
                kategori = new String[] { "Melakukan kegiatan atau sejenisnya yang dapat menurunkan \n" +
                        "                             kehormatan atau martabat Negara, Bangsa dan Polinema." };
                break;
            case 5:
                kategori = new String[] { "Melakukan plagiasi (copy paste) dalam tugas-tugas atau karya\n" +
                        "                             ilmiah" };
                break;
            case 6:
                kategori = new String[] { "Melakukan pemalsuan data / dokumen / tanda tangan." };
                break;
            case 7:
                kategori = new String[] { "Melakukan pemerasan dan/atau penipuan." };
                break;
            case 8:
                kategori = new String[] { "Melakukan kecurangan dalam bidang akademik, administratif,\n" +
                        "                             dan keuangan" };
                break;
            case 9:
                kategori = new String[] { "Mengancam, baik tertulis atau tidak tertulis kepada mahasiswa \n" +
                        "                             dosen, dan/atau karyawan." };
                break;
            case 10:
                kategori = new String[] { "Melakukan tindakan kekerasan atau perkelahian di dalam \n" +
                        "                             kampus." };
                break;
            case 11:
                kategori = new String[] { "Membawa dan/atau menggunakan senjata tajam dan/atau senjata\n" +
                        "                             api untuk hal kriminal." };
                break;
            case 12:
                kategori = new String[] { "Melakukan pengotoran / pengrusakan barang milik orang lain\n" +
                        "                             termasuk milik Politeknik Negeri Malang" };
                break;
            case 13:
                kategori = new String[] { "Bertingkah laku kasar atau tidak sopan kepada mahasiswa,\n" +
                        "                             dosen, dan/atau karyawan." };
                break;
            case 14:
                kategori = new String[] { "Merokok di luar area kawasan merokok." };
                break;
            case 15:
                kategori = new String[] { "Melanggar peraturan/ ketentuan yang berlaku di Polinema baik\n" +
                        "                             di Jurusan/ Program Studi." };
                break;
            case 16:
                kategori = new String[] { "Makan atau minum di dalam ruang kuliah/ laboratorium/ bengkel" };
                break;
            case 17:
                kategori = new String[] { "Mahasiswa berambut dengan model punk, dicat selain hitam dan\n" +
                        "                             atau skinned." };
                break;
            case 18:
                kategori = new String[] { "Mahasiswa Iaki-laki berambut tidak rapi gondrong yaitu\n" +
                        "                             panjang rambutnya melewati batas alis mata di bagian depan." };
                break;
            case 19:
                kategori = new String[] { "Berbusana tidak sopan dan tidak rapi, yaitu antara lain\n" +
                        "                             adalah berpakaian ketat, transparan, memakai t-shirt." };
                break;
            case 20:
                kategori = new String[] { "Berkomunikasi dengan tidak sopan, baik tertulis atau tidak\n" +
                        "                             tertulis kepada mahasiswa, dosen, karyawan, atau orang lain. " };
                break;
        }
        return kategori;
    }

    public static void feedback(Scanner sc08) {
        boolean keluar = false;
        do {
            System.out.println("============================================");
            System.out.println("[           Feedback / Tanggapan          ]");
            System.out.println("============================================");
            System.out.println("[ Daftar Mahasiswa :                       ]");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println((i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("Pilih nomor mahasiswa (0 to exit): ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                keluar = true;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {
                System.out.print("Apakah ingin menambahkan Feedback / Tanggapan (ya/tidak) : ");
                String inputFeedback = sc08.next();

                // switch (inputFeedback) {
                // case "ya":
                // System.out.print("Feedback / tanggapan : ");
                // String feedback = sc08.next();

                // String[] inputTanggapan = {feedback};
                // updateArrayTanggapan(dataMahasiswa, selectedMahasiswa - 1, inputTanggapan);

                // System.out.println("Feedback / Tanggapan berhasil ditambahkan!");
                // break;
                // case "tidak":
                // System.out.print("Apakah ingin menghapus Feedback / Tanggapan (ya/tidak)? :
                // ");
                // String input = sc08.next();

                // if (input.equalsIgnoreCase("ya")) {
                // String ya = " ";
                // String[] inputTanggapan = {ya};
                // updateArrayTanggapan(dataMahasiswa, selectedMahasiswa - 1, inputTanggapan);
                // System.out.println("Feedback / Tanggapan telah di perbarui!");
                // } else {
                // continue;
                // }
                // break;
                // default:
                // System.out.println("Input Anda tidak valid!");
                // break;
                // }

                if (inputFeedback.equalsIgnoreCase("ya")) {
                    System.out.print("Feedback / tanggapan :  ");
                    String feedback = sc08.next();

                    String[] inputTanggapan = { feedback };
                    updateArrayTanggapan(dataMahasiswa, selectedMahasiswa - 1, inputTanggapan);

                    System.out.println("Feedback / Tanggapan berhasil ditambahkan!");
                    break;
                } else if (inputFeedback.equalsIgnoreCase("tidak")) {
                    System.out.print("Apakah ingin menghapus Feedback / Tanggapan (ya/tidak)? : ");
                    String input = sc08.next();

                    if (input.equalsIgnoreCase("ya")) {
                        String ya = " ";
                        String[] inputTanggapan = { ya };
                        updateArrayTanggapan(dataMahasiswa, selectedMahasiswa - 1, inputTanggapan);
                        System.out.println("Feedback / Tanggapan telah di perbarui!");
                    } else {
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Input Anda tidak valid!");
                    break;
                }
            }
        } while (!keluar);
    }

    private static void updateArrayTanggapan(String[][] array, int rowIndex, String[] newData) {
        String[][] tempArray = new String[array.length][array[rowIndex].length + newData.length]; //
        String[][] tempArray2 = new String[riwayatTransaksi.length + 1][riwayatTransaksi[0].length]; //

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tempArray[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < riwayatTransaksi.length; i++) {
            for (int j = 0; j < riwayatTransaksi[i].length; j++) {
                tempArray2[i][j] = riwayatTransaksi[i][j];
            }
        }
        for (int index = 0; index < array.length; index++) {
            if (index == rowIndex) {
                for (int j = 0; j <= 5; j++) {
                    tempArray2[riwayatTransaksi.length][j] = array[index][j];
                }
                break;
            }
        }
        tempArray[rowIndex][11] = newData[0];
        tempArray2[riwayatTransaksi.length][11] = newData[0];
        dataMahasiswa = tempArray;
        riwayatTransaksi = tempArray2;
    }
}
