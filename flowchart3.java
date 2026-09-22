import java.util.Scanner;

public class flowchart3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String brand, category;
        int size;
        int harga = 0;

        System.out.print("Masukkan brand : ");
        brand = input.nextLine();
        System.out.print("Masukkan category : ");
        category = input.nextLine();
        System.out.print("Masukkan size : ");
        size = input.nextInt();

        if (brand.equalsIgnoreCase("Converse")) {
            if (category.equalsIgnoreCase("Slip On")) {
                harga = 800000;
            } else {
                harga = 1200000; // High Top
            }
        } else if (brand.equalsIgnoreCase("Sketcher")) {
            if (category.equalsIgnoreCase("Woman")) {
                harga = 1000000;
            } else {
                harga = 1800000; // Man
            }
        } else if (brand.equalsIgnoreCase("Nike")) {
            if (category.equalsIgnoreCase("Kids")) {
                harga = 750000;
            } else {
                System.out.println("Kategori untuk brand Nike ini belum ada harganya di flowchart");
            }
        } else {
            System.out.println("Brand tidak dikenali");
        }

        if (harga != 0) {
            System.out.println("Size = " + size);
            System.out.println("Total harga = " + harga);
        }
    }
}