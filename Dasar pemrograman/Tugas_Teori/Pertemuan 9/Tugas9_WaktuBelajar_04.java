import java.util.Scanner;

public class Tugas9_WaktuBelajar_04 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hari = 1;
        double totalJam = 0;

        while (hari <= 7) {
            System.out.print("Jam Belajar Hari Ke-" + hari + ": ");
            double jam = sc.nextDouble();

            if (jam > 10) {
                System.out.println("Input Tidak Valid, Silahkan Ulangi!");
                continue;
            }

            totalJam += jam;
            hari++;
        }

        System.out.println("Total Jam Belajar Dalam Seminggu: " + totalJam + " jam");

        sc.close();
    }
}

