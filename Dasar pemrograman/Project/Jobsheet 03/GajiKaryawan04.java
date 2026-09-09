import java.util.Scanner;

public class GajiKaryawan04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;

        System.out.print("Masukkan gaji pokok : Rp.");
        gajiPokok = sc.nextInt();

        bonus=0.05*gajiPokok;
        System.out.println("Bonus Bulanan anda : Rp." +bonus);

        totGaji=gajiPokok+tunjTransp+tunjMkn+bonus-(0.1*gajiPokok);
        System.out.println("Gaji yang anda terima adalah Rp." +totGaji);

        sc.close();
    }
    
}
