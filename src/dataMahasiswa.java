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
        else if (poin <=30 && poin !=0)
        System.out.println("Peringatan Pelanggaran Tingkat V ");
        else if (poin > 30 && poin <=40)
        System.out.println("Peringatan Pelanggaran Tingkat IV ");
        else if (poin > 40 && poin <=60)
        System.out.println("Peringatan Pelanggaran Tingkat III");
        else if (poin > 60 && poin <= 70)
        System.out.println("Peringatan Pelanggaran Tingkat II");
        else 
        System.out.println("Peringatan Pelanggaran Berat Tingkat I");

        System.out.println("Feedback Dosen :   ");


    }
}
