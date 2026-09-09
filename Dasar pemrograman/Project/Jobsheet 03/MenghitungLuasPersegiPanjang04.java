import java.util.Scanner;

public class MenghitungLuasPersegiPanjang04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.print("Masukkan Panjang : ");
        panjang=sc.nextInt();
        System.out.print("Masukkan Lebar : ");
        lebar=sc.nextInt();

        luas=panjang*lebar;

        System.out.println("Luas Persegi adalah " + luas);
        
        sc.close();
    }
    
}
