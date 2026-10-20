import java.util.Scanner;

public class Tugas9_Bonus_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jamKerja;

        do {
            System.out.print("Jam kerja : ");
            jamKerja = sc.nextDouble();

            if (jamKerja >= 0) {
                System.out.print("Gaji harian: ");
                double gaji = sc.nextDouble();

                double bonus = 0;
                if (jamKerja > 8) {
                    bonus = 0.2 * gaji;
                }

                System.out.println("Bonus : " + bonus);
            }
        } while (jamKerja >= 0);

        System.out.println("Program selesai.");

        sc.close();
    }
}

