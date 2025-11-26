import java.util.Scanner;

public class StudiKasus208 {
    // Fungsi untuk mengisi array dengan nilai mahasiswa
    static void isianArray(int nilaiMahasiswa[], int n) {
        Scanner sc = new Scanner(System.in);

        // Mengisi nilai mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
    }

    // Fungsi untuk menampilkan isi array
    static void tampilArray(int nilaiMahasiswa[], int n) {
        System.out.println("Nilai mahasiswa:");
        // Menampilkan semua nilai dalam array
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
    }

    // Fungsi untuk menghitung total nilai mahasiswa
    static int hitTot(int nilaiMahasiswa[], int n) {
        int total = 0;
        // Menjumlahkan semua nilai dalam array
        for (int i = 0; i < n; i++) {
            total += nilaiMahasiswa[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, totalNilai;

        // Membaca jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        n =  sc.nextInt();
        int nilaiMahasiswa[] = new int[n];

        // Mengisi nilai mahasiswa dengan memanggil fungsi isianArray
        isianArray(nilaiMahasiswa, n);

        // Menampilkan nilai mahasiswa dengan memanggil fungsi tampilArray
        tampilArray(nilaiMahasiswa, n);

        // Menghitung total nilai mahasiswa dengan memanggil fungsi hitTot
        totalNilai = hitTot(nilaiMahasiswa, n);

        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai); // Menampilkan total nilai
    }
}
