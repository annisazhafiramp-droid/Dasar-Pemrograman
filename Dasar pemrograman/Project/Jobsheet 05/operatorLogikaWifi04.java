import java.util.Scanner;

public class operatorLogikaWifi04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah Pengguna Mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.print("Apakah Pengguna Dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.print("Apakah Akun Sedang Diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");

        sc.close();
        }
    }
}
    
