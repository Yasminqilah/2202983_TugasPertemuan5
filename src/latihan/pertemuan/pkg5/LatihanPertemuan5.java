package latihan.pertemuan.pkg5;
import java.util.Scanner;
public class LatihanPertemuan5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        int hasil = penjumlahanDeret(N);
        
        System.out.println("Hasil penjumlahan deret 1+2+3+...+" + N + " = " + hasil);
    }

    // Method untuk melakukan penjumlahan deret
    public static int penjumlahanDeret(int N) {
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        return total;
    }
    
}
