import java.util.Scanner;

public class StudiKasus308 {
    // Fungsi untuk menampilkan seluruh data penjualan dalam bentuk tabel
    static void inputDataPenjualan(int penjualan[][], int jumlahMenu, int jumlahHari) {
        Scanner sc = new Scanner(System.in);
        String[] namaMenu = {"Kopi Hitam", "Teh Oolong", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

        // Menginputkan data penjualan untuk setiap menu dan setiap hari
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Masukkan data penjualan untuk menu " + namaMenu[i] + ":");
            // Menginputkan penjualan untuk setiap hari
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan dalam bentuk tabel agar mudah dibaca
    static void tampilDataPenjualan(int penjualan[][], int jumlahMenu, int jumlahHari) {
        String[] namaMenu = {"Kopi Hitam", "Teh Oolong", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

        System.out.println("\n=== Tabel Penjualan Kafe ===");
        System.out.print("Menu\\Hari\t");
        // Menampilkan hari
        for (int j = 0; j < jumlahHari; j++) {
            System.out.print("Hari " + (j + 1) + "\t");
        }
        System.out.println();

        // Menampilkan data penjualan
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(namaMenu[i] + "\t");
            // Menampilkan penjualan per hari untuk setiap menu
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMenu = 5;

        // jumlah hari penjualan dari pengguna
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = sc.nextInt();

        // Deklarasi array 2 dimensi untuk menyimpan data penjualan
        int penjualan[][] = new int[jumlahMenu][jumlahHari];

        // Memanggil fungsi untuk menginputkan data penjualan
        inputDataPenjualan(penjualan, jumlahMenu, jumlahHari);

        // Memanggil fungsi untuk menampilkan seluruh data penjualan
        tampilDataPenjualan(penjualan, jumlahMenu, jumlahHari);
    }
}
