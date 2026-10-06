import java.util.Scanner;

public class Latihan1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan 1: ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan Bilangan 2: ");
        int bil2 = sc.nextInt();
        System.out.print("Masukkan Bilangan 3: ");
        int bil3 = sc.nextInt();
        
        int max;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                max = bil1;
            } else {
                max = bil3;
            }
        } else {
            if (bil2 > bil3) {
                max = bil2;
            } else {
                max = bil3;
            }
        }
        
        System.out.println("Bilangan terbesar : " + max);

        sc.close();
    }
    
}
