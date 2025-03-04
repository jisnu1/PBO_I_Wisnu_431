import java.time.LocalDate;
import java.util.Scanner;

public class codelab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();


        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jkInput = scanner.next().toUpperCase();
        System.out.print("Masukkan tahun lahir: ");

        int tahunLahir = scanner.nextInt();
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;


        if (jkInput.equals("L")) {
            System.out.println("Jenis kelamin : Laki-Laki");
        } else if (jkInput.equals("P")) {
            System.out.println("jenis kelamin : perempuan");
        } else {
            System.out.println("input tidak valid");
        }

        System.out.println("\n=== Data Pengguna ===");
        System.out.println("Nama          : " + nama);
        System.out.println();
        System.out.println("Umur          : " + umur + " tahun");

        scanner.close();


    }
}