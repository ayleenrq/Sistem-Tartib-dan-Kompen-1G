import java.util.Scanner;

public class LoginArray {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        String[][] mahasiswaData = {
            {"Ayleen", "1234"},
            {"Marsya", "5678"},
            {"Adham", "7890"}
        };

        String[][] dosenData = {
            {"Dosen1", "abcd"},
            {"Dosen2", "efgh"}
        };

        String[][] adminData = {
            {"Admin1", "1111"},
            {"Admin2", "0000"}
        };

        boolean loggedIn = false, paswordSalah = false;

        System.out.println("Pilih Login sebagai: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Dosen");
        String login = sc08.nextLine();

        System.out.print("Masukkan Username: ");
        String inputuser = sc08.nextLine();
        
        System.out.print("Masukkan Password: ");
        String inputpassword = sc08.nextLine();


        if(login.equalsIgnoreCase("Admin")) {
            for (int i = 0; i < adminData.length; i++) {
                if (inputuser.equals(adminData[i][0])) {
                    if (inputpassword.equals(adminData[i][1])) {
                        loggedIn = true;
                    } else {
                        paswordSalah = true;
                    }
                }
            }
        } else if (login.equalsIgnoreCase("Mahasiswa")) {
            for (int j = 0; j < mahasiswaData.length; j++) {
                if (inputuser.equals(mahasiswaData[j][0])) {
                    if (inputpassword.equals(mahasiswaData[j][1])) {
                        loggedIn = true;
                    } else {
                        paswordSalah = true;
                    }
                }
            }
        } else if (login.equalsIgnoreCase("Dosen")) {
            for (int k = 0; k < dosenData.length; k++) {
                if (inputuser.equals(dosenData[k][0])) {
                    if (inputpassword.equals(dosenData[k][1])) {
                        loggedIn = true;
                    } else {
                        paswordSalah = true;
                    }
                }
            }
        } else {
            System.out.println("Peran yang anda pilih tidak valid");
        }

        if (loggedIn) {
            System.out.println("Berhasil Login!");
        } else if (paswordSalah) {
            System.out.println("Password Salah");
        } else {
            System.out.println("Username Salah!");
        }
    }
}
