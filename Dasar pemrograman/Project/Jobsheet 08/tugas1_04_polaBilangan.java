
import java.util.Scanner;

public class tugas1_04_polaBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n minimal 1.");
        } else {
            int total = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int nilai = i * j;
                    System.out.printf("%4d", nilai);
                    total += nilai;
                }
                System.out.println();
            }
            System.out.println("Jumlah Seluruh Angka : " + total);
        }
        sc.close();
    }
    
}
