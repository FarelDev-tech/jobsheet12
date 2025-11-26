import java.util.Scanner;

public class HitungBalok08 {
    static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    static int hitungVolume(int panjang, int lebar, int tinggi) {
        int volume = panjang * lebar * tinggi;
        return volume;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang balok: ");
        p = sc.nextInt();

        System.out.print("Masukkan lebar balok: ");
        l = sc.nextInt();

        System.out.print("Masukkan tinggi balok: ");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas alas balok: " + L);
        vol = hitungVolume(p, l, t);
        System.out.println("Volume balok: " + vol);
        sc.close();
    }
}
