import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        String[][] mahasiswaData = {
                { "Adham", "7890" },
                { "Ayleen", "1234" },
                { "Marsya", "5678" },
        };

        String[][] dosenData = {
                { "Dosen1", "abcd" },
                { "Dosen2", "efgh" }
        };

        String[][] adminData = {
                { "Admin1", "1111" },
                { "Admin2", "0000" }
        };

        String[][] dataMahasiswa = {
                { "Adham Baskara", "2341720199", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G", "02" },
                { "Ayleen Ruhul Qisthy", "2341720012", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G",
                        "07" },
                { "Marsya Aurelia Sefira", "2341720011", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G",
                        "18" }
        };

        boolean loginAdmin = false, loginMahasiswa = false, loginDosen = false, paswordSalah = false,
                exitBoolean = false;
        String feedbackDosen, exit;
        int poin = 0;

        System.out.println("============================================");
        System.out.println("[                  LOGIN                   ]");
        System.out.println("============================================");
        System.out.println("[ Pilih Login sebagai :                    ]");
        System.out.println("[ 1. Admin                                 ]");
        System.out.println("[ 2. Mahasiswa                             ]");
        System.out.println("[ 3. Dosen                                 ]");
        System.out.print("Pilih menu (1/2/3): ");
        String login = sc08.nextLine();

        System.out.print("Masukkan Username: ");
        String inputuser = sc08.nextLine();

        System.out.print("Masukkan Password: ");
        String inputpassword = sc08.nextLine();

        System.out.println();

        if (login.equalsIgnoreCase("1")) {
            for (int i = 0; i < adminData.length; i++) {
                if (inputuser.equals(adminData[i][0])) {
                    if (inputpassword.equals(adminData[i][1])) {
                        loginAdmin = true;
                    } else {
                        paswordSalah = true;
                    }
                }
            }
        } else if (login.equalsIgnoreCase("2")) {
            for (int j = 0; j < mahasiswaData.length; j++) {
                if (inputuser.equals(mahasiswaData[j][0])) {
                    if (inputpassword.equals(mahasiswaData[j][1])) {
                        loginMahasiswa = true;
                    } else {
                        paswordSalah = true;
                    }
                }
            }
        } else if (login.equalsIgnoreCase("3")) {
            for (int k = 0; k < dosenData.length; k++) {
                if (inputuser.equals(dosenData[k][0])) {
                    if (inputpassword.equals(dosenData[k][1])) {
                        loginDosen = true;
                    } else {
                        paswordSalah = true;
                    }
                }
            }
        } else {
            System.out.println("Peran yang anda pilih tidak valid");
        }

        if (loginMahasiswa) {
            System.out.println("Berhasil Login!");
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
                        System.out.println("=============================================================");
                        System.out.println("[         Kategori Tata Tertib dan Kompensasi               ]");
                        System.out.println("=============================================================");
                        System.out
                                .println("1. Berkomunikasi dengan tidak sopan, baik tertulis atau tidak tertulis\r\n" + //
                                        "kepada mahasiswa, dosen, karyawan, atau orang lain : Tingkat V");
                        System.out.println();
                        System.out.println("2 Berbusana tidak sopan dan tidak rapi. Yaitu antara lain adalah:\r\n" + //
                                "berpakaian ketat, transparan, memakai t-shirt (baju kaos tidak\r\n" + //
                                "berkerah), tank top, hipster, you can see, rok mini, backless, celana\r\n" + //
                                "pendek, celana tiga per empat, legging, model celana atau baju\r\n" + //
                                "koyak, sandal, sepatu sandal di lingkungan kampus : Tingkat IV");
                        System.out.println();
                        System.out.println("3. Mahasiswa Iaki-laki berambut tidak rapi, gondrong yaitu panjang\r\n" + //
                                "rarnbutnya melewati batas alis mata di bagian depan, telinga di\r\n" + //
                                "bagian sarnping atau menyentuh kerah baju di bagian leher : Tingkat IV");
                        System.out.println();
                        System.out.println("4. Mahasiswa berarnbut dengan model punk, dicat selain hitam dan/\r\n" + //
                                "atau skinned. : Tingkat IV");
                        System.out.println();
                        System.out.println(
                                "5. Makan, atau minum di dalam ruang kuliah/ laboratorium/ bengkel. : Tingkat IV");
                        System.out.println();
                        System.out.println("6. Melanggar peraturan/ ketentuan yang berlaku di Polinema baik di\r\n" + //
                                "Jurusan/ Program Studi : Tingkat III");
                        System.out.println();
                        System.out.println("7. Tidak menjaga kebersihan di seluruh area Polinema : Tingkat III");
                        System.out.println();
                        System.out.println("8. Membuat kegaduhan yang mengganggu pelaksanaan perkuliahan\r\n" + //
                                "atau praktikum yang sedang berlangsung. : Tingkat III");
                        System.out.println();
                        System.out.println("9. Merokok di luar area kawasan merokok : Tingkat III");
                        System.out.println();
                        System.out.println("10. Bermain kartu, game online di area kampus : Tingkat III");
                        System.out.println();
                        System.out
                                .println("11. Mengotori atau mencoret-coret meja, kursi, tembok, dan lain-lain di\r\n" + //
                                        "lingkungan Polinema : Tingkat III");
                        System.out.println();
                        System.out.println("12. Bertingkah laku kasar atau tidak sopan kepada mahasiswa, dosen,\r\n" + //
                                "dan/atau karyawan. : Tingkat III");
                        System.out.println();
                        System.out.println("13. Merusak sarana dan prasarana yang ada di area Polinema : Tingkat III");
                        System.out.println();
                        System.out.println("14. Tidak menjaga ketertiban dan keamanan di seluruh area Polinema\r\n" + //
                                "(misalnya: parkir tidak pada tempatnya, konvoi selebrasi wisuda\r\n" + //
                                "dll) : Tingkat II");

                        break;
                    case 2:
                        for (int i = 0; i < dataMahasiswa.length; i++) {
                            if (inputuser.equals(mahasiswaData[i][0])) {
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
                                exit = exitBoolean ? "yes" : "no";
                                if (exit.equalsIgnoreCase("yes")) {
                                    exitBoolean = true;
                                }
                                System.out.println();
                                break;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("======================================================");
                        System.out.println("[                    Kompensasi                      ]");
                        System.out.println("======================================================");
                        System.out.print("Masukkan jam alfa  : ");
                        int jamAlfaK = sc08.nextInt();
                        System.out.print("Masukkan poin pelanggaran   : ");
                        int poinPelanggaran = sc08.nextInt();

                        int jamKompensasiK = jamAlfaK * 2;

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
                        else
                            System.out.println("Peringatan Pelanggaran Sangat Berat Tingkat I");

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
                        System.out.println("Terima kasih telah berpartisipasi!");
                        break;
                    case 5:
                        System.out.println("===========================================");
                        System.out.println("[       Daftar Kompensasi Mahasiswa       ]");
                        System.out.println("===========================================");
                        System.out.println("========Jumlah Alpha : 5jam ===============");
                        System.out.println("======= Jumlah Kompensasi : 10jam =========\n");
                        System.out.println("===========================================");
                        System.out.println("[            Riwayat Kompensasi           ]");
                        System.out.println("===========================================");
                        System.out.println("  Tanggal 2 September 2023 | alpha = 2jam  ");
                        System.out.println("  Tanggal 9 Oktober 2023   | alpha = 3jam  ");
                        System.out.println("===========================================\n");

                        String kompen;
                        int jatahKompen, jatahKompenSelesai;

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
                        System.out.println("======================================================");
                        System.out.println("[                   Manajemen Akun                    ]");
                        System.out.println("======================================================");
                        break;

                    case 9:
                        System.out.print("Keluar dari sistem? (y/t): ");
                        String keluar = sc08.next();
                        if (keluar.equalsIgnoreCase("y")) {
                            break;
                        } else {

                        }
                }
            } while (true);
        }
    }
}
