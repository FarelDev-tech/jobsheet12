public class Kafe082 {
    // Percobaan 2: Membuat fungsi menu() dengan parameter
    public static void menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda mendapatkan diskon khusus 10% untuk member!");
        } 

        System.out.println("=== Kafe Menu ===");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Cappucino - Rp 20000");
        System.out.println("3. Latte - Rp 22000");
        System.out.println("4. Teh Tarik - Rp 12000");
    }

    public static void main(String[] args) {
        menu("Andi", true);
    }
}