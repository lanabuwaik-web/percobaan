import java.util.Scanner;

public class Belajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");

        if (umur >= 17) {
            System.out.println("Status: Sudah cukup umur");
        } else {
            System.out.println("Status: Belum cukup umur");
        }

        input.close();
    }
}