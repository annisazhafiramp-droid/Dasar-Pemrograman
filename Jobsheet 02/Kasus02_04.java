import java.util.Scanner;

public class Kasus02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        // Input: panjang (int), lebar (int)
        // Output: keliling (int)
        int panjang;
        int lebar;
        int keliling;

        // Tambahkan petunjuk input
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

       // Proses:
       // input panjang, lebar
       // keliling = 2 x (panjang + lebar)
       // Output keliling

        keliling = 2 * (panjang + lebar);

        System.out.println("Keliling: " + keliling);

        input.close();
    }
}
