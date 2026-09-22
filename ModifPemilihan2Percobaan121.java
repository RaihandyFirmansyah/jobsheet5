import java.util.Scanner;

public class ModifPemilihan2Percobaan121 {
    public static void main(String[] args) {
        Scanner absen = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = absen.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else {

                if ((tahun % 400) == 0)
                    System.out.println("Tahun Kabisat");
                else
                    System.out.println("Bukan Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}