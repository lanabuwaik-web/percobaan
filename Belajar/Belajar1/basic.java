import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        input.nextLine(); // membersihkan Enter

        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();

        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Alamat : " + alamat);

        if (umur >= 17) {
            System.out.println("Status : Sudah cukup umur");
        } else {
            System.out.println("Status : Belum cukup umur");
        }

        input.close();
    }
}