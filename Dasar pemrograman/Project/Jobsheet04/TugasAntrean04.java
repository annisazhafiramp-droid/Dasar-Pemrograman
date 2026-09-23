package Project.Jobsheet04;

import java.util.Scanner;

public class TugasAntrean04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          int kode;
        System.out.print("Masukkan jumlah antrean: ");
        kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Layanan : Legalisir Ijazah");
                System.out.println("Loket : A");
                break;
            case 2:
                System.out.println("Layanan : Surat keterangan akif kuliah");
                System.out.println("Loket : B");
                break;
            case 3:
                System.out.println("Layanan : Pembayaran UKT");
                System.out.println("Loket : C");
                break;
            case 4:
                System.out.println("Layanan : Pengajuan cuti akademik");
                System.out.println("Loket : D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                System.out.println("Loket : tidak tersedia");

        sc.close();
        }
    }
    
}
