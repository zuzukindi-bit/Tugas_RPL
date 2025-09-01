package Zunanda_rpl2;

import java.util.Scanner;

public class Zunanda_rpl2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menu Paket Makanan ===");
        System.out.println("1. Paket Ayam - Rp. 15.000");
        System.out.println("2. Paket Ikan - Rp. 20.000");
        System.out.println("3. Paket Daging - Rp. 30.000");
        System.out.println("4. Paket Sayur - Rp. 10.000");
        System.out.print("Pilih paket (1-4): ");
        int pilihan = input.nextInt();

        int harga = 0;
        String paket = "";

        switch (pilihan) {
            case 1:
                paket = "Paket Ayam";
                harga = 15000;
                break;
            case 2:
                paket = "Paket Ikan";
                harga = 20000;
                break;
            case 3:
                paket = "Paket Daging";
                harga = 30000;
                harga -= 5000; // potongan harga Rp.5000
                break;
            case 4:
                paket = "Paket Sayur";
                harga = 10000;
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
                return; // keluar dari program jika pilihan tidak valid
        }

        System.out.println("Anda memilih: " + paket);
        System.out.println("Total Harga: Rp. " + harga);
    }
}
