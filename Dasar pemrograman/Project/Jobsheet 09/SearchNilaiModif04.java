
import java.util.Scanner;

public class SearchNilaiModif04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2. elemen banyak, isi array, dan key dari user
        System.out.print("Masukkan Banyaknya Elemen Array : ");
        int n = sc.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan Nilai Yang Ingin Dicari: ");
        int key = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " Ditemukan Pada Indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        // 3. pesan tidak ditemukan
        if (!ditemukan) {
            System.out.println("Nilai Yang Dicari Tidak Ditemukan : " + key
                    + " Tidak Ada Di Dalam Array Yang Berisi " + nilai.length + " Elemen.");
        }
        sc.close();
    }
}
