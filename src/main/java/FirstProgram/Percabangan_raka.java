package FirstProgram;

import java.util.Scanner;
public class Percabangan_raka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter password: ");
        var validPassword = "password";
        if (password.equals(validPassword)) System.out.println("Selamat datang bos!");
        else {
            System.out.println("Password Salah, coba lagi!");
        }
        System.out.println("Terimakasih sudah menggunakan aplikasi kami");
    }
    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}