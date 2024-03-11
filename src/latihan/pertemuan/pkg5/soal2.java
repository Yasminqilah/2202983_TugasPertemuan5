package latihan.pertemuan.pkg5;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        int jumlahGanjil = hitungBilanganGanjil(batasAwal, batasAkhir);
        
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + jumlahGanjil);
    }

    // Method untuk menghitung banyaknya bilangan ganjil
    public static int hitungBilanganGanjil(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlah++;
            }
        }
        return jumlah;
    }
}
