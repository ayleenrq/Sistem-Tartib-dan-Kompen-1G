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

    static int indeksAkun = -1;

    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        boolean loginAdmin = false, loginMahasiswa = false, loginDosen = false, paswordSalah = false, menuAdmin = false,
                exitBoolean = false, logoutProgram = false, keluarKategori = false, menuMahasiswa = false, menuDosen = false,
                keluarData = false, keluarDataDosen = false, keluarDataAdmin = false, keluarDataMahasiswa = false,
                keluarKompensasi = false;
        do {
            boolean iscont = true;

            System.out.println("+=================================================================================+");
            System.out.println("[                                     LOGIN                                       ]");
            System.out.println("+=================================================================================+");
            System.out.println("| Pilih Login sebagai :                                                           |");
            System.out.println("| 1. Login Admin                                                                  |");
            System.out.println("| 2. Login Mahasiswa                                                              |");
            System.out.println("| 3. Login Dosen                                                                  |");
            System.out.println("| 4. Exit                                                                         |");
            System.out.print("| Pilih menu (1/2/3): ");
            int login = sc08.nextInt();

            if (login == 4) {
                System.out.println("+=================================================================================+");
                System.out.println("+-------------------------------------------------+");
                System.out.println("| Terimakasih anda telah menggunakan program ini! |");
                System.out.println("+-------------------------------------------------+");
                logoutProgram = true;
                break;
            } else if (login > 4) {
                System.out.println("+=================================================================================+");
                System.out.println("+------------------------------------+");
                System.out.println("| Peran yang anda pilih tidak valid! |");
                System.out.println("+------------------------------------+");
                iscont = false;
                continue;
            }

            System.out.println("+=================================================================================+");
            System.out.print("| Masukkan Username : ");
            String inputuser = sc08.next();

            System.out.print("| Masukkan Password : ");
            String inputpassword = sc08.next();

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
                        paswordSalah = true;
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
                        paswordSalah = true;
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
                        paswordSalah = true;
                    }
                }
            } else {
                System.out.println("+=================================================================================+");
                System.out.println("+------------------------------------+");
                System.out.println("| Peran yang anda pilih tidak valid! |");
                System.out.println("+------------------------------------+");
            }

            if (loginMahasiswa) {
                System.out.println("+=================================================================================+");
                System.out.println("+-----------------------------------+");
                System.out.println("| Berhasil Login Sebagai Mahasiswa! |");
                System.out.println("+-----------------------------------+");

                do {
                    System.out.println("+=================================================================================+");
                    System.out.println("[                                   Mahasiswa                                     ]");
                    System.out.println("+=================================================================================+");
                    System.out.println("| MENU :                                                                          |");
                    System.out.println("| 1. Kategori Tata Tertib                                                         |");
                    System.out.println("| 2. Kategori Kompensansi                                                         |");
                    System.out.println("| 3. Data Mahasiswa                                                               |");
                    System.out.println("| 4. Kompensasi dan Pelanggaran Tata Tertib                                       |");
                    System.out.println("| 5. Cetak Info Mahasiswa                                                         |");
                    System.out.println("| 6. Manajemen Akun                                                               |");
                    System.out.println("| 7. Keluar                                                                       |");
                    System.out.print("| Pilih menu (1/2/3/?): ");
                    int menu = sc08.nextInt();

                    switch (menu) {
                        case 1:
                            tampilkanTatib();
                            tampilkanPembayaranTatib();
                            break;
                        case 2:
                            tampilkanKompen();
                            tampilkanPembayaranKompen();
                            break;
                        case 3:
                            for (int i = 0; i < dataMahasiswa.length; i++) {
                                if (inputuser.equals(mahasiswaAkun[i][0])) {
                                    System.out.println();
                                    System.out.println("+=================================================================================+");
                                    System.out.println("[                                  Data Mahasiswa                                 ]");
                                    System.out.println("+=================================================================================+");
                                    System.out.println("| Nama Mahasiswa           : " + dataMahasiswa[i][0]);
                                    System.out.println("| NIM                      : " + dataMahasiswa[i][1]);
                                    System.out.println("| Jurusan                  : " + dataMahasiswa[i][2]);
                                    System.out.println("| Prodi                    : " + dataMahasiswa[i][3]);
                                    System.out.println("| Kelas                    : " + dataMahasiswa[i][4]);
                                    System.out.println("| Nomor Absen              : " + dataMahasiswa[i][5]);
                                }
                            }
                            break;
                        case 4:
                            for (int i = 0; i < dataMahasiswa.length; i++) {
                                if (inputuser.equals(mahasiswaAkun[i][0])) {
                                    System.out.println("+=================================================================================+");
                                    System.out.println("[                      Kompensasi dan Pelanggaran Tata Tertib                     ]");
                                    System.out.println("+=================================================================================+");
                                    System.out.println("| Jam Alpha                : " + dataMahasiswa[i][10]);
                                    System.out.println("| Total Jam Kompensasi     : " + dataMahasiswa[i][8]);
                                    System.out.println("| Kategori Kompen          : " + dataMahasiswa[i][6]);
                                    System.out.println("| Pelanggaran Tata Tertib  : " + dataMahasiswa[i][9]);
                                    System.out.println("| Kategori Sanksi          : " + dataMahasiswa[i][7]);
                                }
                            }
                            break;
                        case 5:
                            for (int i = 0; i < dataMahasiswa.length; i++) {
                                if (inputuser.equals(mahasiswaAkun[i][0])) {
                                    System.out.println("+=================================================================================+");
                                    System.out.println("[                                 Info Mahasiswa                                  ]");
                                    System.out.println("+=================================================================================+");
                                    System.out.println("| Nama Mahasiswa           : " + dataMahasiswa[i][0]);
                                    System.out.println("| NIM                      : " + dataMahasiswa[i][1]);
                                    System.out.println("| Jurusan                  : " + dataMahasiswa[i][2]);
                                    System.out.println("| Prodi                    : " + dataMahasiswa[i][3]);
                                    System.out.println("| Kelas                    : " + dataMahasiswa[i][4]);
                                    System.out.println("| Nomor Absen              : " + dataMahasiswa[i][5]);
                                    System.out.println("| Jam Alpha                : " + dataMahasiswa[i][10]);
                                    System.out.println("| Total Jam Kompensasi     : " + dataMahasiswa[i][8]);
                                    System.out.println("| Kategori Kompen          : " + dataMahasiswa[i][6]);
                                    System.out.println("| Pelanggaran Tata Tertib  : " + dataMahasiswa[i][9]);
                                    System.out.println("| Kategori Sanksi          : " + dataMahasiswa[i][7]);
                                    System.out.println("| Feedback / Tanggapan     : " + dataMahasiswa[i][11]);
                                }
                            }
                            break;
                        case 6:
                            System.out.println("+=================================================================================+");
                            System.out.println("[                                 Manajemen Akun                                  ]");
                            System.out.println("+=================================================================================+");
                            System.out.println("| Apakah anda ingin mengedit info akun anda?                                      |");
                            System.out.println("| 1. Ya                                                                           |");
                            System.out.println("| 2. Tidak                                                                        |");
                            System.out.println("+=================================================================================+");
                            System.out.print("| Pilihan anda : ");
                            menu = sc08.nextInt();
                            if (menu == 1) {
                                System.out.println("+=================================================================================+");
                                System.out.println("| Ingin mengedit password anda?");
                                mahasiswaAkun[indeksAkun][1] = sc08.next();
                            } else if (menu == 2) {
                                break;
                            }
                            break;
                        case 7:
                            if (menu == 7) {
                                System.out.println("+=================================================================================+");
                                System.out.println("+--------------------------------------------+");
                                System.out.println("| Terimakasih telah menggunakan program ini! |");
                                System.out.println("+--------------------------------------------+");
                                System.out.println();
                                exitBoolean = true;
                                loginMahasiswa = false;
                                menuMahasiswa = true;
                                break;
                            }
                        default:
                            System.out.println("+=================================================================================+");
                            System.out.println("| Pilihan anda tidak valid!                                                       |");
                            System.out.println("| Silahkan masukkan menu yang valid!                                              |");
                            System.out.println("+=================================================================================+");
                            exitBoolean = false;
                            break;
                    }
                } while (!menuMahasiswa);
            } else if (loginDosen) {
                System.out.println("+=================================================================================+");
                System.out.println("+-------------------------------+");
                System.out.println("| Berhasil Login Sebagai Dosen! |");
                System.out.println("+-------------------------------+");

                do {
                    System.out.println("+=================================================================================+");
                    System.out.println("[                                      Dosen                                      ]");
                    System.out.println("+=================================================================================+");
                    System.out.println("| MENU :                                                                          |");
                    System.out.println("| 1. Pelaporan Pelanggaran                                                        |");
                    System.out.println("| 2. Input Jam Alpa Mahasiswa                                                     |");
                    System.out.println("| 3. Daftar Jam Kompensasi                                                        |");
                    System.out.println("| 4. Pembayaran Kompensasi                                                        |");
                    System.out.println("| 5. Pembayaran Sanksi                                                            |");
                    System.out.println("| 6. Feedback / Tanggapan                                                         |");
                    System.out.println("| 7. Cek Data Mahasiswa                                                           |");
                    System.out.println("| 8. Keluar                                                                       |");
                    System.out.print("| Pilih menu (1/2/3?): ");
                    int menu = sc08.nextInt();
                    

                    switch (menu) {
                        case 1:
                            laporPelanggaran(sc08);
                            break;
                        case 2:
                            tambahkanJamAlpha(sc08);
                            break;
                        case 3:
                            daftarKompensasiMahasiswa(sc08);
                            break;
                        case 4:
                            tambahkanPembayaranKompen(sc08);
                            break;
                        case 5:
                            tambahkanPembayaranTatib(sc08);
                            break;
                        case 6:
                            feedback(sc08);
                            break;
                        case 7:
                            tampilkanData();
                            break;
                        case 8:
                            if (menu == 8) {
                                System.out.println("+=================================================================================+");
                                System.out.println("+--------------------------------------------+");
                                System.out.println("| Terimakasih telah menggunakan program ini! |");
                                System.out.println("+--------------------------------------------+");
                                System.out.println();
                                exitBoolean = true;
                                loginDosen = false;
                                menuDosen = true;
                                break;
                            }
                        default:
                            System.out.println("+=================================================================================+");
                            System.out.println("| Pilihan anda tidak valid!                                                       |");
                            System.out.println("| Silahkan masukkan menu yang valid!                                              |");
                            System.out.println("+=================================================================================+");
                            exitBoolean = false;
                            break;
                    }
                } while (!menuDosen);

            } else if (loginAdmin) {
                System.out.println("+=================================================================================+");
                System.out.println("+-------------------------------+");
                System.out.println("| Berhasil Login Sebagai Admin! |");
                System.out.println("+-------------------------------+");

                do {
                    System.out.println("+=================================================================================+");
                    System.out.println("[                                      Admin                                      ]");
                    System.out.println("+=================================================================================+");
                    System.out.println("| MENU :                                                                          |");
                    System.out.println("| 1. Kategori Tata Tertib dan Kompensasi                                          |");
                    System.out.println("| 2. Manajemen Akun                                                               |");
                    System.out.println("| 3. Kompensasi Mahasiswa                                                         |");
                    System.out.println("| 4. Pelaporan Pelanggaran                                                        |");
                    System.out.println("| 5. Feedback/Tanggapan                                                           |");
                    System.out.println("| 6. Cek Data Mahasiswa                                                           |");
                    System.out.println("| 7. Riwayat                                                                      |");
                    System.out.println("| 8. Logout                                                                       |");
                    System.out.print("| Pilih menu (1/2/3?) : ");
                    int menu = sc08.nextInt();

                    switch (menu) {
                        case 1:
                            do {
                                System.out.println("+=================================================================================+");
                                System.out.println("[                        Kategori Tata Tertib & Kompensasi                        ]");
                                System.out.println("+=================================================================================+");
                                System.out.println("| MENU :                                                                          |");
                                System.out.println("| 1. Kategori Tata Tertib                                                         |");
                                System.out.println("| 2. Kategori Kompensasi                                                          |");
                                System.out.println("| 3. Exit                                                                         |");
                                System.out.print("| Pilih menu (1/2/3?) : ");
                                int menuAdminTatib = sc08.nextInt();

                                switch (menuAdminTatib) {
                                    case 1:
                                        System.out.println();
                                        tampilkanTatib();
                                        tampilkanPembayaranTatib();
                                        break;
                                    case 2:
                                        System.out.println();
                                        tampilkanKompen();
                                        tampilkanPembayaranKompen();
                                        break;
                                    case 3:
                                        System.out.println();
                                        keluarKategori = true;
                                        break;
                                    default:
                                        System.out.println();
                                        System.out.println("+=================================================================================+");
                                        System.out.println("| Pilihan anda tidak valid!                                                       |");
                                        System.out.println("| Silahkan masukkan menu yang valid!                                              |");
                                        System.out.println("+=================================================================================+");
                                        System.out.println();
                                        keluarKategori = false;
                                        break;
                                }
                            } while (!keluarKategori);
                            break;
                        case 2:
                            do {
                                System.out.println("+=================================================================================+");
                                System.out.println("[                                  Manajemen Akun                                 ]");
                                System.out.println("+=================================================================================+");
                                System.out.println("| MENU :                                                                          |");
                                System.out.println("| 1. Akun Dosen                                                                   |");
                                System.out.println("| 2. Akun Mahasiswa                                                               |");
                                System.out.println("| 3. Akun Admin                                                                   |");
                                System.out.println("| 4. Exit                                                                         |");
                                System.out.print("| Pilih menu (1/2/3?) : ");
                                int menuAdminData = sc08.nextInt();

                                switch (menuAdminData) {
                                    case 1:
                                        do {
                                            System.out.println("+=================================================================================+");
                                            System.out.println("[                                   Akun Dosen                                    ]");
                                            System.out.println("+=================================================================================+");
                                            System.out.println("| MENU :                                                                          |");
                                            System.out.println("| 1. Tampilkan Akun Dosen                                                         |");
                                            System.out.println("| 2. Ubah Akun Dosen                                                              |");
                                            System.out.println("| 3. Tambahkan Akun Dosen                                                         |");
                                            System.out.println("| 4. Exit                                                                         |");
                                            System.out.print("| Pilih menu (1/2/3?) : ");
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
                                                    System.out.println("+=================================================================================+");
                                                    System.out.println("| Pilihan anda tidak valid!                                                       |");
                                                    System.out.println("| Silahkan masukkan menu yang valid!                                              |");
                                                    System.out.println("+=================================================================================+");
                                                    System.out.println();
                                                    keluarDataDosen = false;
                                                    break;
                                            }
                                        } while (!keluarDataDosen);
                                        break;
                                    case 2:
                                        do {
                                            System.out.println("+=================================================================================+");
                                            System.out.println("[                                   Akun Mahasiswa                                |");
                                            System.out.println("+=================================================================================+");
                                            System.out.println("| MENU :                                                                          |");
                                            System.out.println("| 1. Ubah Akun Mahasiswa                                                          |");
                                            System.out.println("| 2. Ubah Data Mahasiswa                                                          |");
                                            System.out.println("| 3. Tambahkan Akun Mahasiswa                                                     |");
                                            System.out.println("| 4. Tambahkan Data Mahasiswa                                                     |");
                                            System.out.println("| 5. Tampilkan Akun Mahasiswa                                                     |");
                                            System.out.println("| 6. Tampilkan Data Mahasiswa                                                     |");
                                            System.out.println("| 7. Hapus Data Mahasiswa                                                         |");
                                            System.out.println("| 8. Exit                                                                         |");
                                            System.out.print("| Pilih menu (1/2/3?) : ");
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
                                                    deleteMahasiswa();
                                                    break;
                                                case 8:
                                                    keluarDataMahasiswa = true;
                                                    break;
                                                default:
                                                    System.out.println();
                                                    System.out.println("+=================================================================================+");
                                                    System.out.println("| Pilihan anda tidak valid!                                                       |");
                                            	    System.out.println("| Silahkan masukkan menu yang valid!                                              |");
                                                    System.out.println("+=================================================================================+");
                                                    System.out.println();
                                                    keluarDataMahasiswa = false;
                                                    break;
                                            }
                                        } while (!keluarDataMahasiswa);
                                        break;
                                    case 3:
                                        do {
                                            System.out.println("+=================================================================================+");
                                            System.out.println("[                                   Akun Admin                                    ]");
                                            System.out.println("+=================================================================================+");
                                            System.out.println("| MENU :                                                                          |");
                                            System.out.println("| 1. Tampilkan Akun Admin                                                         |");
                                            System.out.println("| 2. Ubah Akun Admin                                                              |");
                                            System.out.println("| 3. Tambahkan Akun Admin                                                         |");
                                            System.out.println("| 4. Exit                                                                         |");
                                            System.out.print("| Pilih menu (1/2/3?) : ");
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
                                                    System.out.println("+=================================================================================+");
                                                    System.out.println("| Pilihan anda tidak valid!                                                       |");
                                                    System.out.println("| Silahkan masukkan menu yang valid!                                              |");
                                                    System.out.println("+=================================================================================+");
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
                                        System.out.println("+=================================================================================+");
                                        System.out.println("| Pilihan anda tidak valid!                                                       |");
                                        System.out.println("| Silahkan masukkan menu yang valid!                                              |");
                                        System.out.println("+=================================================================================+");
                                        System.out.println();
                                        keluarData = false;
                                        break;
                                }
                            } while (!keluarData);
                            break;
                        case 3:
                            do {
                                System.out.println("+=================================================================================+");
                                System.out.println("[                              Kompensasi Mahasiswa                               ]");
                                System.out.println("+=================================================================================+");
                                System.out.println("| MENU :                                                                          |");
                                System.out.println("| 1. Pembayaran Kompensasi                                                        |");
                                System.out.println("| 2. Pembayaran Sanksi                                                            |");
                                System.out.println("| 3. Input Jam Alpha Mahasiswa                                                    |");
                                System.out.println("| 4. Daftar Jam Kompensasi                                                        |");
                                System.out.println("| 5. Exit                                                                         |");
                                System.out.print("| Pilih menu (1/2/3?) : ");
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
                                        System.out.println("+=================================================================================+");
                                        System.out.println("| Pilihan anda tidak valid!                                                       |");
                                        System.out.println("| Silahkan masukkan menu yang valid!                                              |");
                                        System.out.println("+=================================================================================+");
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
                                System.out.println("+=================================================================================+");
                                System.out.println("+--------------------------------------------+");
                                System.out.println("| Terimakasih telah menggunakan program ini! |");
                                System.out.println("+--------------------------------------------+");
                                System.out.println();
                                exitBoolean = true;
                                loginAdmin = false;
                                menuAdmin = true;
                                break;
                            }
                        default:
                            System.out.println("+=================================================================================+");
                            System.out.println("| Pilihan anda tidak valid!                                                       |");
                            System.out.println("| Silahkan masukkan menu yang valid!                                              |");
                            System.out.println("+=================================================================================+");
                            exitBoolean = false;
                            break;
                    }
                } while (!menuAdmin);
            } else if (!paswordSalah){
                System.out.println("+=================================================================================+");
                System.out.println("+-------------------------------+");
                System.out.println("| Password atau Username Salah! |");
                System.out.println("+-------------------------------+");
            } else {
                System.out.println("+=================================================================================+");
                System.out.println("+-------------------------------+");
                System.out.println("| Password atau Username Salah! |");
                System.out.println("+-------------------------------+");
            }
        } while ((logoutProgram != true));
    } 

    public static void tampilkanAkunDosen() {
        System.out.println("+=================================================================================+");
        System.out.println("[                             Tampilkan Akun Dosen                                ]");
        System.out.println("+=================================================================================+");

        for (String[] dosen : dosenAkun) {
            displayAkunDosen(dosen);
        }
    }

    public static void displayAkunDosen(String[] dosen) {
        System.out.println("+=================================================================================+");
        System.out.println("| Username : " + dosen[0] + "              ");
        System.out.println("| Password : " + dosen[1] + "              ");
    }

    public static void ubahAkunDosen(Scanner scanner) {
        System.out.println("+=================================================================================+");
        System.out.print("| Masukkan username Dosen yang ingin diubah : ");
        String username = scanner.next();

        boolean found = false;
        for (String[] dosen : dosenAkun) {
            if (username.equals(dosen[0])) {
                found = true;
                System.out.print("| Masukkan password baru : ");
                String newPassword = scanner.next();
                dosen[1] = newPassword;
                System.out.println("+=================================================================================+");
                System.out.println("+-----------------------------+");
                System.out.println("| Akun Dosen berhasil diubah! |");
                System.out.println("+-----------------------------+");
                break;
            }
        }
        if (!found) {
            System.out.println("+=================================================================================+");
            System.out.println("+---------------------------------+");
            System.out.println("| Username Dosen tidak ditemukan! |");
            System.out.println("+---------------------------------+");
        }
    }

    public static void tambahkanAkunDosen(Scanner scanner) {
        System.out.println("+=================================================================================+");
        System.out.print("| Masukkan username Dosen baru : ");
        String newUsername = scanner.next();
        System.out.print("| Masukkan password Dosen baru : ");
        String newPassword = scanner.next();

        String[][] newDosen = { { newUsername, newPassword } };
        dosenAkun = concatArraysDosen(dosenAkun, newDosen);

        System.out.println("+=================================================================================+");
        System.out.println("+---------------------------------------+");
        System.out.println("| Data Dosen baru berhasil ditambahkan! |");
        System.out.println("+---------------------------------------+");
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
        System.out.println("+=================================================================================+");
        System.out.println("[                             Tampilkan Akun Admin                                ]");
        System.out.println("+=================================================================================+");

        for (String[] admin : adminAkun) {
            displayAkunAdmin(admin);
        }
    }

    public static void displayAkunAdmin(String[] admin) {
        System.out.println("+=================================================================================+");
        System.out.println("| Username: " + admin[0] + "              ");
        System.out.println("| Password: " + admin[1] + "              ");
    }

    public static void ubahAkunAdmin(Scanner scanner) {
        System.out.println("+=================================================================================+");
        System.out.print("| Masukkan username Admin yang ingin diubah : ");
        String username = scanner.next();

        boolean found = false;
        for (String[] admin : adminAkun) {
            if (username.equals(admin[0])) {
                found = true;
                System.out.print("| Masukkan password baru: ");
                String newPassword = scanner.next();
                admin[1] = newPassword;
                System.out.println("+=================================================================================+");
                System.out.println("+-----------------------------+");
                System.out.println("| Akun Admin berhasil diubah! |");
                System.out.println("+-----------------------------+");
                break;
            }
        }
        if (!found) {
            System.out.println("+=================================================================================+");
            System.out.println("+---------------------------------+");
            System.out.println("| Username Admin tidak ditemukan! |");
            System.out.println("+---------------------------------+");
        }
    }

    public static void tambahkanAkunAdmin(Scanner scanner) {
        System.out.println("+=================================================================================+");
        System.out.print("| Masukkan username Admin baru : ");
        String newUsername = scanner.next();
        System.out.print("| Masukkan password Admin baru : ");
        String newPassword = scanner.next();

        String[][] newAdmin = { { newUsername, newPassword } };
        adminAkun = concatArraysAdmin(adminAkun, newAdmin);

        System.out.println("+=================================================================================+");
        System.out.println("+---------------------------------------+");
        System.out.println("| Data Admin baru berhasil ditambahkan! |");
        System.out.println("+---------------------------------------+");
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
        System.out.println("+=================================================================================+");
        System.out.print("| Masukkan username Mahasiswa yang ingin diubah : ");
        String username = scanner.next();

        boolean found = false;
        for (String[] mahasiswa : mahasiswaAkun) {
            if (username.equals(mahasiswa[0])) {
                found = true;
                System.out.print("| Masukkan password baru : ");
                String newPassword = scanner.next();
                mahasiswa[1] = newPassword;
                System.out.println("+=================================================================================+");
                System.out.println("+---------------------------------+");
                System.out.println("| Akun Mahasiswa berhasil diubah! |");
                System.out.println("+---------------------------------+");
                break;
            }
        }
        if (!found) {
            System.out.println("+=================================================================================+");
            System.out.println("+-------------------------------------+");
            System.out.println("| Username Mahasiswa tidak ditemukan! |");
            System.out.println("+-------------------------------------+");
        }
    }

    public static void tambahkanAkunMahasiswa(Scanner scanner) {
        System.out.println("+=================================================================================+");
        System.out.print("| Masukkan username Mahasiswa baru : ");
        String newUsername = scanner.next();
        System.out.print("| Masukkan password Mahasiswa baru : ");
        String newPassword = scanner.next();

        String[][] newMahasiswa = { { newUsername, newPassword } };
        mahasiswaAkun = concatArrays(mahasiswaAkun, newMahasiswa);

        System.out.println("+=================================================================================+");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Akun Mahasiswa baru berhasil ditambahkan! |");
        System.out.println("+-------------------------------------------+");
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
        System.out.println("+=================================================================================+");
        System.out.print("| Masukkan Nama Mahasiswa yang ingin diubah : ");
        scanner.nextLine();
        String nama = scanner.nextLine();

        boolean found = false;
        for (String[] mahasiswa : dataMahasiswa) {
            if (nama.equalsIgnoreCase(mahasiswa[0])) {
                found = true;

                System.out.println("+=================================================================================+");
                System.out.println("| Data Mahasiswa sebelum diubah                                                   |");
                displayDataMahasiswa(mahasiswa);

                System.out.println("+=================================================================================+");
                System.out.print("| Masukkan NIM baru : ");
                mahasiswa[1] = scanner.nextLine();

                System.out.print("| Masukkan Prodi baru : ");
                mahasiswa[2] = scanner.nextLine();

                System.out.print("| Masukkan Jurusan baru : ");
                mahasiswa[3] = scanner.nextLine();

                System.out.print("| Masukkan Kelas baru : ");
                mahasiswa[4] = scanner.nextLine();

                System.out.print("| Masukkan Absen baru : ");
                mahasiswa[5] = scanner.nextLine();

                System.out.println("+=================================================================================+");
                System.out.println("+---------------------------------+");
                System.out.println("| Akun Mahasiswa berhasil diubah! |");
                System.out.println("+---------------------------------+");

                System.out.println("+=================================================================================+");
                System.out.println("| Data Mahasiswa setelah diubah                                                   |");
                displayDataMahasiswa(mahasiswa);
                break;
            }
        }
        if (!found) {
            System.out.println("+=================================================================================+");
            System.out.println("+---------------------------------+");
            System.out.println("| Nama Mahasiswa tidak ditemukan! |");
            System.out.println("+---------------------------------+");
        }
    }

    public static void tambahkanDataMahasiswa(Scanner scanner) {
        System.out.println("+=================================================================================+");
        System.out.print("| Masukkan NIM Mahasiswa baru : ");
        int nim = scanner.nextInt();
        scanner.nextLine();

        String nimBaru = String.valueOf(nim);

        boolean found = false;
        for (String[] mahasiswa : dataMahasiswa) {
            if (nimBaru.equals(mahasiswa[1])) {
                found = true;
                System.out.println("+=================================================================================+");
                System.out.println("+--------------------------+");
                System.out.println("| NIM Mahasiswa sudah ada! |");
                System.out.println("+--------------------------+");
                break;
            }
        }
        if (!found) {
            String[] newMahasiswa = new String[12];
            newMahasiswa[1] = nimBaru;

            System.out.print("| Masukkan Nama Mahasiswa : ");
            newMahasiswa[0] = scanner.nextLine();

            System.out.print("| Masukkan Prodi Mahasiswa : ");
            newMahasiswa[2] = scanner.nextLine();

            System.out.print("| Masukkan Jurusan Mahasiswa : ");
            newMahasiswa[3] = scanner.nextLine();

            System.out.print("| Masukkan Kelas Mahasiswa : ");
            newMahasiswa[4] = scanner.nextLine();

            System.out.print("| Masukkan Absen Mahasiswa : ");
            newMahasiswa[5] = scanner.nextLine();

            dataMahasiswa = concatArrays(dataMahasiswa, new String[][] { newMahasiswa });

            System.out.println("+=================================================================================+");
            System.out.println("+-------------------------------------------+");
            System.out.println("| Data Mahasiswa baru berhasil ditambahkan! |");
            System.out.println("+-------------------------------------------+");
        }
    }

    public static void tampilkanDataMahasiswa() {
        System.out.println("+=================================================================================+");
        for (String[] mahasiswa : dataMahasiswa) {
            displayDataMahasiswa(mahasiswa);
            System.out.println("+=================================================================================+");
        }
    }

    public static void displayDataMahasiswa(String[] mahasiswa) {
        System.out.println("+=================================================================================+");
        System.out.println("| Nama Mahasiswa           : " + mahasiswa[0] + "       ");
        System.out.println("| NIM                      : " + mahasiswa[1] + "       ");
        System.out.println("| Jurusan                  : " + mahasiswa[2] + "       ");
        System.out.println("| Prodi                    : " + mahasiswa[3] + "       ");
        System.out.println("| Kelas                    : " + mahasiswa[4] + "       ");
        System.out.println("| Nomor Absen              : " + mahasiswa[5] + "       ");
        System.out.println("+=================================================================================+");
    }

    public static void tampilkanAkunMahasiswa() {
        System.out.println("+=================================================================================+");
        System.out.println("[                            Tampilkan Akun Mahasiswa                             ]");
        System.out.println("+=================================================================================+");

        for (String[] mahasiswa : mahasiswaAkun) {
            displayAkunMahasiswa(mahasiswa);
        }
    }

    public static void displayAkunMahasiswa(String[] mahasiswa) {
        System.out.println("+=================================================================================+");
        System.out.println("| Nama : " + mahasiswa[0] + "              ");
        System.out.println("| Password : " + mahasiswa[1] + "          ");
        System.out.println("+=================================================================================+");
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
            System.out.println("+=================================================================================+");
            System.out.println("[                             Pembayaran Kompensasi                               ]");
            System.out.println("+=================================================================================+");
            System.out.println("| Daftar Mahasiswa :                                                              |");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println("| " + (i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("| Pilih nomor mahasiswa (0 to exit) : ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                break;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {
                tampilkanPembayaranKompen();

                System.out.print("| Apakah ingin menambahkan Pembayaran Kompensasi (ya/tidak) : ");
                String inputKompen = sc08.next();

                switch (inputKompen) {
                    case "ya":
                        System.out.print("| Pilih Salah Satu (1/2/3) : ");
                        int pilihan = sc08.nextInt();

                        if (pilihan >= 1 && pilihan <= 5) {
                            String[] inputPembayaranKompen = inputKategoriKompen(sc08, pilihan);
                            updateArray(dataMahasiswa, selectedMahasiswa - 1, inputPembayaranKompen);
                            System.out.println("Pembayaran Kompensasi berhasil ditambahkan.");
                        } else {
                            System.out.println("+=================================================================================+");
                            System.out.println("+---------------------------+");
                            System.out.println("| Pilihan anda tidak valid! |");
                            System.out.println("+---------------------------+");
                            System.out.println("+=================================================================================+");
                        }
                        break;
                    case "tidak":
                        System.out.print("| Apakah sudah menyelesaikan Pembayaran Kompen (sudah/belum)? : ");
                        String input = sc08.next();

                        if (input.equalsIgnoreCase("sudah")) {
                            String sudah = "Sudah Menyelesaikan Kompen";
                            String[] inputPembayaranKompen = { sudah };
                            updateArray(dataMahasiswa, selectedMahasiswa - 1, inputPembayaranKompen);
                            System.out.println("+--------------------------------------------------+");
                            System.out.println("| Pembayaran Sanksi Tata tertib telah di perbarui! |");
                            System.out.println("+--------------------------------------------------+");
                        } else {
                            continue;
                        }
                        break;
                    default:
                        System.out.println("+=================================================================================+");
                            System.out.println("+-------------------------+");
                            System.out.println("| Input anda tidak valid! |");
                            System.out.println("+-------------------------+");
                            System.out.println("+=================================================================================+");
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
            System.out.println("| Jam Alpha                : " + Objects.toString(mahasiswa[10], "-"));
            System.out.println("| Total Jam Kompensasi     : " + Objects.toString(mahasiswa[8], "-"));
            System.out.println("| Kategori Kompen          : " + Objects.toString(mahasiswa[6], "-"));
            System.out.println("| Pelanggaran Tata Tertib  : " + Objects.toString(mahasiswa[9], "-"));
            System.out.println("| Kategori Sanksi          : " + Objects.toString(mahasiswa[7], "-"));
            System.out.println("| Feedback / Tanggapan     : " + Objects.toString(mahasiswa[11], "-"));
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
            System.out.println("| Jam Alpha                : " + Objects.toString(mahasiswa[10], "-"));
            System.out.println("| Total Jam Kompensasi     : " + Objects.toString(mahasiswa[8], "-"));
            System.out.println("| Kategori Kompen          : " + Objects.toString(mahasiswa[6], "-"));
            System.out.println("| Pelanggaran Tata Tertib  : " + Objects.toString(mahasiswa[9], "-"));
            System.out.println("| Kategori Sanksi          : " + Objects.toString(mahasiswa[7], "-"));
            System.out.println("| Feedback / Tanggapan     : " + Objects.toString(mahasiswa[11], "-"));
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
            System.out.println("+=================================================================================+");
            System.out.println("[                                Pembayaran Sanksi                                ]");
            System.out.println("+=================================================================================+");
            System.out.println("| Daftar Mahasiswa :                                                              |");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println("| " + (i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("| Pilih nomor mahasiswa (0 to exit) : ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                break;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {
                tampilkanPembayaranTatib();

                System.out.print("| Apakah ingin menambahkan Sanksi (ya/tidak) : ");
                String inputSanksi = sc08.next();

                switch (inputSanksi) {
                    case "ya":
                        System.out.print("| Pilih Salah Satu (1/2/3) : ");
                        int pilihan = sc08.nextInt();

                        if (pilihan >= 1 && pilihan <= 5) {
                            String[] inputPembayaranSanksi = inputSanksiTatib(sc08, pilihan);
                            updateArraytatib(dataMahasiswa, selectedMahasiswa - 1, inputPembayaranSanksi);
                            System.out.println("+=================================================================================+");
                            System.out.println("+-----------------------------------------------------+");
                            System.out.println("| Pembayaran Sanksi Tata tertib berhasil ditambahkan! |");
                            System.out.println("+-----------------------------------------------------+");
                            System.out.println("+=================================================================================+");
                        } else {
                            System.out.println("+=================================================================================+");
                            System.out.println("+---------------------------+");
                            System.out.println("| Pilihan anda tidak valid! |");
                            System.out.println("+---------------------------+");
                            System.out.println("+=================================================================================+");

                        }
                        break;
                    case "tidak":
                        System.out.print("| Apakah sudah menyelesaikan Sanksi tatib (sudah/belum)? : ");
                        String input = sc08.next();

                        if (input.equalsIgnoreCase("sudah")) {
                            String sudah = "Sudah Menyelesaikan Sanksi";
                            String[] inputPembayaranSanksi = { sudah };
                            updateArraytatib(dataMahasiswa, selectedMahasiswa - 1, inputPembayaranSanksi);
                            System.out.println("+=================================================================================+");
                            System.out.println("+--------------------------------------------------+");
                            System.out.println("| Pembayaran Sanksi Tata tertib telah di perbarui! |");
                            System.out.println("+--------------------------------------------------+");
                            System.out.println("+=================================================================================+");
                        } else {
                            continue;
                        }
                        break;
                    default:
                        System.out.println("+=================================================================================+");
                        System.out.println("+-------------------------+");
                        System.out.println("| Input anda tidak valid! |");
                        System.out.println("+-------------------------+");
                        System.out.println("+=================================================================================+");
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
            System.out.println("+=================================================================================+");
            System.out.println("[                                    Jam Alpha                                    ]");
            System.out.println("+=================================================================================+");
            System.out.println("| Daftar Mahasiswa :                                                              |");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println("| " + (i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("| Pilih nomor mahasiswa (0 to exit) : ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                keluar = true;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {
                System.out.print("| Masukkan Jam Alpha : ");
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
            System.out.println("+=================================================================================+");
            System.out.println("[                                Daftar Kompensasi                                ]");
            System.out.println("+=================================================================================+");
            System.out.println("| Daftar Mahasiswa :                                                              |");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println((i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("| Pilih nomor mahasiswa (0 to exit) : ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                keluar = true;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {

                System.out.print("| Masukkan jam kompensasi yang sudah diselesaikan : ");
                int selesaiJamAlfaK = sc08.nextInt();
                int jatahKompen = Integer.parseInt(dataMahasiswa[selectedMahasiswa - 1][8]);

                if (selesaiJamAlfaK <= jatahKompen) {
                    jatahKompen -= selesaiJamAlfaK;
                    System.out.println();
                    // System.out.println("Sisa jam kompen yang belum diselesaikan: " +
                    // jatahKompen);
                } else {
                    System.out.println("+=================================================================================+");
                        System.out.println("+-------------------------+");
                        System.out.println("| Input anda tidak valid! |");
                        System.out.println("+-------------------------+");
                        System.out.println("+=================================================================================+");
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
            System.out.println("+=================================================================================+");
            System.out.println("[                              Pelaporan Pelanggaran                              ]");
            System.out.println("+=================================================================================+");
            System.out.println("| Daftar Mahasiswa :                                                              |");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println((i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("| Pilih nomor mahasiswa (0 to exit) : ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                keluar = true;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {
                tampilkanTatib();

                System.out.print("| Apakah ingin menambahkan pelanggaran (ya/tidak) : ");
                String inputPelanggaran = sc08.next();

                switch (inputPelanggaran) {
                    case "ya":
                        System.out.print("| Pilih Salah Satu (1/2/3) : ");
                        int pilihan = sc08.nextInt();

                        if (pilihan >= 1 && pilihan <= 20) {
                            String[] inputLaporTatib = inputKategoriTatib(sc08, pilihan);
                            updateArrayLapor(dataMahasiswa, selectedMahasiswa - 1, inputLaporTatib);
                            System.out.println("+=================================================================================+");
                            System.out.println("+-------------------------------------------------------+");
                            System.out.println("| Laporan Pelanggaran Tata tertib berhasil ditambahkan! |");
                            System.out.println("+-------------------------------------------------------+");
                            System.out.println("+=================================================================================+");
                        } else {
                            System.out.println("+=================================================================================+");
                            System.out.println("+---------------------------+");
                            System.out.println("| Pilihan anda tidak valid! |");
                            System.out.println("+---------------------------+");
                            System.out.println("+=================================================================================+");
                        }
                        break;
                    case "tidak":
                        System.out.print("| Apakah ingin menghapus Pelanggaran Tatib (ya/tidak)? : ");
                        String input = sc08.next();

                        if (input.equalsIgnoreCase("ya")) {
                            String ya = " ";
                            String[] inputLapor = { ya };
                            updateArrayLapor(dataMahasiswa, selectedMahasiswa - 1, inputLapor);
                            System.out.println("+=================================================================================+");
                            System.out.println("+----------------------------------------------------+");
                            System.out.println("| Laporan Pelanggaran Tata tertib telah di perbarui! |");
                            System.out.println("+----------------------------------------------------+");
                            System.out.println("+=================================================================================+");
                        } else {
                            continue;
                        }
                        break;
                    default:
                        System.out.println("+=================================================================================+");
                        System.out.println("+-------------------------+");
                        System.out.println("| Input anda tidak valid! |");
                        System.out.println("+-------------------------+");
                        System.out.println("+=================================================================================+");
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
            System.out.println("+=================================================================================+");
            System.out.println("[                                Feedback / Tanggapan                             ]");
            System.out.println("+=================================================================================+");
            System.out.println("| Daftar Mahasiswa :                                                              |");

            for (int i = 0; i < dataMahasiswa.length; i++) {
                System.out.println((i + 1) + ". " + dataMahasiswa[i][0]);
            }

            System.out.print("| Pilih nomor mahasiswa (0 to exit) : ");
            int selectedMahasiswa = sc08.nextInt();

            if (selectedMahasiswa == 0) {
                keluar = true;
            } else if (selectedMahasiswa >= 1 && selectedMahasiswa <= dataMahasiswa.length) {
                System.out.print("| Apakah ingin menambahkan Feedback / Tanggapan (ya/tidak) : ");
                String inputFeedback = sc08.next();

                if (inputFeedback.equalsIgnoreCase("ya")) {
                    System.out.print("| Feedback / tanggapan : ");
                    sc08.nextLine();
                    String feedback = sc08.nextLine();

                    String[] inputTanggapan = { feedback };
                    updateArrayTanggapan(dataMahasiswa, selectedMahasiswa - 1, inputTanggapan);

                    sc08.next();
                    System.out.println("+=================================================================================+");
                    System.out.println("+--------------------------------------------+");
                    System.out.println("| Feedback / tanggapan berhasil ditambahkan! |");
                    System.out.println("+--------------------------------------------+");
                    System.out.println("+=================================================================================+");
                    break;
                } else if (inputFeedback.equalsIgnoreCase("tidak")) {
                    System.out.print("| Apakah ingin menghapus Feedback / Tanggapan (ya/tidak)? : ");
                    String input = sc08.next();

                    if (input.equalsIgnoreCase("ya")) {
                        String ya = " ";
                        String[] inputTanggapan = { ya };
                        updateArrayTanggapan(dataMahasiswa, selectedMahasiswa - 1, inputTanggapan);
                        System.out.println("+=================================================================================+");
                            System.out.println("+-----------------------------------------+");
                            System.out.println("| Feedback / tanggapan telah di perbarui! |");
                            System.out.println("+-----------------------------------------+");
                            System.out.println("+=================================================================================+");
                    } else {
                        continue;
                    }
                    break;
                } else {
                    System.out.println("+=================================================================================+");
                    System.out.println("+-------------------------+");
                    System.out.println("| Input anda tidak valid! |");
                    System.out.println("+-------------------------+");
                    System.out.println("+=================================================================================+");
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
    public static void deleteMahasiswa() {
        Scanner sc08 = new Scanner(System.in);

        System.out.println("+=================================================================================+");
        System.out.println("|                                 HAPUS MAHASISWA                                 |");
        System.out.println("+=================================================================================+");
        System.out.print("| Masukkan NIM Mahasiswa yang akan dihapus : ");
        String nimToDelete = sc08.nextLine();

        boolean mahasiswaFound = false;

        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (nimToDelete.equals(dataMahasiswa[i][1])) {
                mahasiswaFound = true;
                for (int j = 0; j < dataMahasiswa[i].length; j++) {
                    dataMahasiswa[i][j] = "";
                }
                System.out.println("+=================================================================================+");
                System.out.println("+----------------------------------+");
                System.out.println("| Data Mahasiswa berhasil dihapus! |");
                System.out.println("+----------------------------------+");
                System.out.println("+=================================================================================+");
                break;
            }
        }

        if (!mahasiswaFound) {
            System.out.println("+=================================================================================+");
            System.out.println("| Mahasiswa dengan NIM " + nimToDelete + " tidak ditemukan.                         |");
            System.out.println("+=================================================================================+");
        }
    }
}
