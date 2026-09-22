import java.util.Scanner;

public class flowchart2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String jenis_buku;
        int jumlah_buku;
        double diskon;

        System.out.print("Masukkan jenis buku : ");
        jenis_buku = input.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlah_buku = input.nextInt();

        if (jenis_buku.equalsIgnoreCase("kamus")) {
            if (jumlah_buku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.10;
            }
        } else if (jenis_buku.equalsIgnoreCase("novel")) {
            if (jumlah_buku > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else {
            if (jumlah_buku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0.0;
            }
        }

        System.out.println("Diskon = " + (diskon * 100) + "%");
    }
}