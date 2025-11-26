import java.util.Scanner;

public class Kafe083 {
    public static void menu(String namaPelanggan, boolean isMember,  String kodePromo) { 
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda mendapatkan diskon khusus 10% untuk member!");
        } 

        if (kodePromo.equalsIgnoreCase("DISKON50%")) {
            System.out.println("Anda mendapatkan diskon tambahan 50% dengan kode promo!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30%")) {
            System.out.println("Anda mendapatkan diskon tambahan 20% dengan kode promo!");
        } else {
            System.out.println("Kode Promo Invalid.");
        }

        System.out.println("=== Kafe Menu ===");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Cappucino - Rp 20000");
        System.out.println("3. Latte - Rp 22000");
        System.out.println("4. Teh Tarik - Rp 12000");
    }

    // Percobaan 3: Membuat fungsi hitungTotalHarga() dengan return value
    public static int hitungTotalHarga083(int pilihanMenu, int banyakItem, String kodePromo) {
        int hargaItems[] = {15000, 20000, 22000, 12000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50%")) {
            hargaTotal = (int)(hargaTotal * 0.5);
        } else if (kodePromo.equalsIgnoreCase("DISKON30%")) {
            hargaTotal = (int)(hargaTotal * 0.7);
        } else {
            System.out.println("Kode Promo Invalid.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihanMenu, banyakItem, totalHarga;

        menu("Andi", true, "DISKON50%");
        menu("Budi", true, "DISKON30%"); // Kode promo valid dan member
        menu("Citra", false, "DISKON10%"); // Kode promo invalid

        System.out.println("\n=== Contoh Perhitungan Total Harga ===");
        System.out.print("Masukkan pilihan menu (1-4): ");
        pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah yang ingin dipesan: ");
        banyakItem = sc.nextInt();

        sc.nextLine(); // buffering
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        totalHarga = hitungTotalHarga083(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
    }
}