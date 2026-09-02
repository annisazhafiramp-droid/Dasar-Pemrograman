import java.util.Scanner;

public class Tugas02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double panjangTanah, lebarTanah, diameterKolam, sisiTaman, luasTanah, jariJari, luasKolam, luasTaman, luasSisa;

        // Input
        System.out.print("Masukkan Panjang Tanah (m): ");
        panjangTanah = input.nextDouble();

        System.out.print("Masukkan Lebar Tanah (m): ");
        lebarTanah = input.nextDouble();

        System.out.print("Masukkan Diameter Kolam Ikan (m): ");
        diameterKolam = input.nextDouble();

        System.out.print("Masukkan Sisi Taman Bunga (m): ");
        sisiTaman = input.nextDouble();

        // Proses
        luasTanah = panjangTanah * lebarTanah;
        jariJari = diameterKolam / 2;
        luasKolam = Math.PI * jariJari * jariJari;
        luasTaman = sisiTaman * sisiTaman;
        luasSisa = luasTanah - luasKolam - luasTaman;

        // Output
        System.out.println("Luas Tanah Keseluruhan : " + luasTanah + " m2");
        System.out.println("Luas Kolam Ikan         : " + luasKolam + " m2");
        System.out.println("Luas Taman Bunga        : " + luasTaman + " m2");
        System.out.println("Luas Tanah Tidak Digunakan: " + luasSisa + " m2");

        input.close();
    }
}