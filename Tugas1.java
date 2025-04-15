import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String NimAkhir = "431";
        String Nama = "Wisnu";
        String NiM = "2024431";

        System.out.println("======SELAMAT DATANG==========");
        System.out.println("Pilih login:");
        System.out.println("1.Admin");
        System.out.println("2.Mahasiswa");
        System.out.print("Masukan pilihan :");

        String OpsiLogin = scanner.nextLine();

        if (OpsiLogin.equals("1")) {
            System.out.print("Masukan username:");
            String username = scanner.nextLine();
            System.out.print("Masukan password:");
            String password = scanner.nextLine();

            if (username.equals("Admin" + NimAkhir) && password.equals("password" + NimAkhir)) {
                System.out.println("Login Admin berhasil ✅");
            } else {
                System.out.println("Login gagal! Username atau password salah❌");

            }
        }else if (OpsiLogin.equals("2")) {
            System.out.print("Masukan username:");
            String nama = scanner.nextLine();
            System.out.print("Masukan password:");
            String NIM = scanner.nextLine();


            if (nama.equals(nama) && NIM.equals(NIM)) {
                System.out.println("Login mahasiswa berhasil ✅");
                System.out.println("nama:" + nama);
                System.out.println("Nim:" + NIM);
            } else {
                System.out.println("Login gagal! Username atau Nim salah❌");

            }
        }else{
            System.out.println("Pilihan tidak valid");
        }
        scanner.close();

        }
    }
