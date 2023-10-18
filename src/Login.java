import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String login, user, password, userSystem1, passwordSystem1, userSystem2, passwordSystem2, userSystem3, passwordSystem3;
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
        login = sc.nextLine();

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
        } while (true); 
            System.out.println("Login Berhasil!");

        sc.close();
    }
}
