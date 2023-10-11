import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        String login, admin, mahasiswa, dosen, user, password, userSystem1, passwordSystem1, userSystem2, passwordSystem2, userSystem3, passwordSystem3;
        userSystem1 = "admin";
        passwordSystem1 = "1234";
        userSystem2 = "Ayleen Ruhul Qisthy";
        passwordSystem2 = "1234";
        userSystem3 = "Mamluatul Haniah";
        passwordSystem3 = "1234";

        System.out.println("Pilih Login sebagai: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Dosen");
        login = sc08.nextLine();

        System.out.println("Masukkan Username: ");
        user = sc08.nextLine();
        
        System.out.println("Masukkan Password: ");
        password = sc08.nextLine();

        if(login.equals("Admin")) {
            if (user.equals(userSystem1)) {
                if (password.equals(passwordSystem1)) {
                    System.out.println("Berhasil Login1");
                }
                else {
                    System.out.println("Password Salah!");
                }
            }
            else {
                System.out.println("Username Salah!");
            }
        }
        else if (login.equals("Mahasiswa")) {
            if (user.equals(userSystem2)) {
                if (password.equals(passwordSystem2)) {
                    System.out.println("Berhasil Login!");
                }
                else {
                    System.out.println("Password Salah!");
                }
            }
            else {
                System.out.println("Password Salah!");
            }
        }
        else {
            if (user.equals(userSystem3)) {
                if (password.equals(passwordSystem3)) {
                    System.out.println("Berhasil Login!");
                }
                else {
                    System.out.println("Password Salah!");
                }
            }
            else {
                System.out.println("Password Salah!");
            }
        }
    }
}
