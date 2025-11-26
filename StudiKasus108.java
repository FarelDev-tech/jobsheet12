import java.util.Scanner;

public class StudiKasus108 {
    // Fungsi untuk menghitung volume kubus
    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi, volume, luasPermukaan;

        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = sc.nextInt();

        volume = hitungVolume(sisi); // Memanggil fungsi hitungVolume
        System.out.println("Volume kubus: " + volume);

        luasPermukaan = hitungLuasPermukaan(sisi); // Memanggil fungsi hitungLuasPermukaan
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}
