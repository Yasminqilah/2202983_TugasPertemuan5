package latihan.pertemuan.pkg5;
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("n harus lebih besar dari atau sama dengan 0");
            return;
        }

        long hasil = hitungFaktorial(n);
        
        System.out.println(n + "! = " + cetakFaktorial(n) + " = " + hasil);
    }

    // Method untuk menghitung nilai faktorial n!
    public static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long faktorial = 1;
            for (int i = 2; i <= n; i++) {
                faktorial *= i;
            }
            return faktorial;
        }
    }

    // Method untuk mencetak faktorial secara terperinci
    public static String cetakFaktorial(int n) {
        String hasil = "";
        for (int i = n; i >= 1; i--) {
            hasil += i;
            if (i != 1) {
                hasil += "*";
            }
        }
        return hasil;
    }
    
}
