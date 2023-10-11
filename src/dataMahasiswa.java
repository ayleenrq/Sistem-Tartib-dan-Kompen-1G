import java.util.Scanner;

public class dataMahasiswa {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        String namaMahasiswa, NIM, jurusan, prodi, kelas, feedbackDosen;
        int poin;
        
        System.out.println("========== Data Mahasiswa ==========");
        System.out.println("Nama Mahasiswa : Marsya Aurelia Sefira ");
        System.out.println("NIM : 2341720011 ");
        System.out.println("Jurusan : Teknologi Informasi ");
        System.out.println("Prodi : D4 Teknik Informatika ");
        System.out.println("Kelas : TI 1G ");
        System.out.print("Masukkan Poin Pelanggaran Anda : ");
        poin = sc08.nextInt();
        
        if (poin <=0)
        System.out.println("Tidak ada pelanggaran ");
        else if (poin >=30)
        System.out.println("Peringatan Pelanggaran Berat! ");
        else
        System.out.println("Peringatan Pelanggaran Ringan ");

        System.out.println("Feedback Dosen :   ");


    }
}
