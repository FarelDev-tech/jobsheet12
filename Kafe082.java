public class Kafe082 {
    // Percobaan 2: Membuat fungsi menu() dengan parameter
    public static void menu(String namaPelanggan, boolean isMember,  String kodePromo) { // Penambahan parameter kodePromo
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda mendapatkan diskon khusus 10% untuk member!");
        } 

        // Penambahan kode promo
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

    public static void main(String[] args) {
        menu("Andi", true, "DISKON50%");
        menu("Budi", true, "DISKON30%"); // Kode promo valid dan member
        menu("Citra", false, "DISKON10%"); // Kode promo invalid
    }
}