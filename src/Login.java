import java.util.Arrays;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mahasiswa = {"ayleen", "marsya", "adham"};
        String[] dosen = {"dosen1", "dosen2"};
        String[] admin = {"admin1", "admin1"};
        String password = "1234";
        String login;

        System.out.println("Pilih Login sebagai: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Dosen");
        login = sc.nextLine();

<<<<<<< HEAD
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
=======
        boolean loggedIn = false;

        do {
            System.out.print("Masukkan Username: ");
            user = sc.nextLine();

            System.out.print("Masukkan Password: ");
            password = sc.nextLine();

            if (login.equals("Admin")) {
                if (user.equals(userSystem1) && password.equals(passwordSystem1)) {
                    System.out.println("Berhasil Login!");
                    loggedIn = true;
                    break; 
                } else {
                    System.out.println("Username atau Password Salah! Silakan coba lagi.");
                }
            } else if (login.equalsIgnoreCase("Mahasiswa")) {
                if (user.equals(userSystem2) && password.equals(passwordSystem2)) {
                    System.out.println("Berhasil Login!");
                    loggedIn = true;
                    break; 
                } else {
                    System.out.println("Username atau Password Salah! Silakan coba lagi.");
>>>>>>> main
                }
            } else if (login.equalsIgnoreCase("Dosen")) {
                if (user.equals(userSystem3) && password.equals(passwordSystem3)) {
                    System.out.println("Berhasil Login!");
                    loggedIn = true;
                    break; 
                } else {
                    System.out.println("Username atau Password Salah! Silakan coba lagi.");
                }
            } else {
                System.out.println("Peran yang anda pilih tidak valid");
                break; 
            }
<<<<<<< HEAD
            else {
                System.out.println("Username Salah!");
            }
        } else
            System.out.println("Peran yang anda pilih tidak valid");
=======
        } while (true); 
            System.out.println("Login Berhasil!");

        sc.close();
>>>>>>> main
    }
}
