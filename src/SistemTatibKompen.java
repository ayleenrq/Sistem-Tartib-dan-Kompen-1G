import java.util.Scanner;

public class SistemTatibKompen {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        String[][] mahasiswaData = {
            {"Adham", "7890"},
            {"Ayleen", "1234"},
            {"Marsya", "5678"},
        };

        String[][] dosenData = {
            {"Dosen1", "abcd"},
            {"Dosen2", "efgh"}
        };

        String[][] adminData = {
            {"Admin1", "1111"},
            {"Admin2", "0000"}
        };

        String[][] dataMahasiswa = {
            {"Adham Baskara", "2341720199", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G", "02"},
            {"Ayleen Ruhul Qisthy", "2341720012", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G", "07"},
            {"Marsya Aurelia Sefira", "2341720011", "Teknologi Informasi", "D4 Teknik Informatika", "TI - 1G", "18"}
        };

        boolean loginAdmin = false, loginMahasiswa = false, loginDosen = false, paswordSalah = false, exitBoolean = false;
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

        if(login.equalsIgnoreCase("1")) {
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
            System.out.println("[ 7. Cetak Pelanggaran                     ]");
            System.out.println("[ 8. Manajemen Akun                        ]");
            System.out.println("[ 9. Keluar                                ]");
            System.out.print("Pilih menu (1/2/3/?): ");
            int menu = sc08.nextInt();

            switch (menu) {
                case 1:
        
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
                            System.out.println("[ Kelas          : "  + dataMahasiswa[i][4]);
                            System.out.println("[ Nomor Absen    : "  + dataMahasiswa[i][5]); 
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

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Pilihan Menu tidak tersedia, Silahkan coba lagi.");
                    break;
            }

            } while (true || exitBoolean != false);

        } else if (paswordSalah) {
            System.out.println("Password Salah");
        } else {
            System.out.println("Username Salah!");
        }
    }
}
