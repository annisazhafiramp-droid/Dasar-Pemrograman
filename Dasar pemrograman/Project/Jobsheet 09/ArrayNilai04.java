import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];

        Scanner sc = new Scanner(System.in);

        // Loop untuk menerima input nilai
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

         // Loop untuk menampilkan hasil dan status kelulusan
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }
        sc.close();
    }
    
}

