import java.util.Scanner;

public class DaftarKompensasi {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

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
            }
            else if (kompen.equalsIgnoreCase("belum")) {
                continue;
            }
        } while (jatahKompen > 0);
    }
}