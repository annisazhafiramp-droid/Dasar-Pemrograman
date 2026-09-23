package Project.Jobsheet04;

import java.util.Scanner;

public class TugasParkir04 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lamaParkir;
        System.out.print("Masukkan lama parkir (dalam jam) : ");
        lamaParkir = sc.nextInt();
        int jumlahTarif;

        if (lamaParkir <= 2) {
            jumlahTarif = 2000;            
        } else {
            jumlahTarif = 2000 + ((lamaParkir - 2) * 1000);
        }
        System.out.println("Biaya Parkir : " + jumlahTarif);

        sc.close();
    }
    
}
    