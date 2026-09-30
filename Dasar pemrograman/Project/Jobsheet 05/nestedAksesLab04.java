import java.util.Scanner;

public class nestedAksesLab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();

        System.out.print("Apakah asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();


        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses Laboratorium Diberikan");
            } else {
                System.out.println("Akses Ditolak: Membutuhkan Izin Dosen Atau Status Asisten Lab");
            }
        } else {
            System.out.println("Akses Ditolak : Status Mahasiswa Tidak Memenuhi Syarat");
        }

        sc.close();
    }
}
