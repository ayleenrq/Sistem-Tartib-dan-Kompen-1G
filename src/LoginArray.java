import java.util.Arrays;
import java.util.Scanner;

public class LoginArray {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        String[] mahasiswa = {"ayleen", "marsya", "adham"};
        String[] dosen = {"dosen1", "dosen2"};
        String[] admin = {"admin1", "admin1"};
        String password = "1234";
        String login;

        System.out.println("Pilih Login sebagai: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Dosen");
        login = sc08.nextLine();

        System.out.print("Masukkan Username: ");
        String inputuser = sc08.nextLine();
        
        System.out.print("Masukkan Password: ");
        String inputpassword = sc08.nextLine();


        if(login.equalsIgnoreCase("Admin")) {
            if (Arrays.stream(admin).anyMatch(inputuser::equals)) {
                if (inputpassword.equals(password)) {
                    System.out.println("Berhasil Login1");
                }
                else {
                    System.out.println("Password Salah!");
                }
            }
            else {
                System.out.println("Username Salah!");
            }
        } else if (Arrays.stream(mahasiswa).anyMatch(inputuser::equals)){
            if (inputuser.equals(mahasiswa)) {
                if (inputpassword.equals(password)) {
                    System.out.println("Berhasil Login1");
                }
                else {
                    System.out.println("Password Salah!");
                }
            }
            else {
                System.out.println("Username Salah!");
            }
        } else if (Arrays.stream(dosen).anyMatch(inputuser::equals)) {
            if (inputuser.equals(dosen)) {
                if (inputpassword.equals(password)) {
                    System.out.println("Berhasil Login1");
                }
                else {
                    System.out.println("Password Salah!");
                }
            }
            else {
                System.out.println("Username Salah!");
            }
        } else
            System.out.println("Peran yang anda pilih tidak valid");
    }
}
