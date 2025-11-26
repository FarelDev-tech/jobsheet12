public class PengunjungCafe08 {
    static void daftarPengunjung(String ...namaPengunjung) {
        System.out.print("Daftar Pengunjung Cafe: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("\nAndi");
        daftarPengunjung("\nDoni", "Eti", "Fahmi", "Galih");
    }
}