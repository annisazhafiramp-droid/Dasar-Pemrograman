    import java.util.Scanner;

    public class Latihan3_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Merk     : ");
        String merk = sc.nextLine();
        System.out.print("Kategori : ");
        String kategori = sc.nextLine();
        System.out.print("Ukuran   : ");
        int ukuran = sc.nextInt();

        int harga = 0;

        if (ukuran >= 36) {
            if (ukuran <= 44) {

                if (merk.equalsIgnoreCase("Converse")) {
                    if (kategori.equalsIgnoreCase("Slip On")) {
                        if (ukuran <= 40) {
                            harga = 800000;
                        }
                    } else {
                        if (ukuran >= 40) {
                            harga = 1200000;
                        }
                    }
                } else {
                    if (merk.equalsIgnoreCase("Sketcher")) {
                        if (kategori.equalsIgnoreCase("Woman")) {
                            if (ukuran <= 41) {
                                harga = 1000000;
                            }
                        } else {
                            if (ukuran >= 41) {
                                harga = 1800000;
                            }
                        }
                    } else {
                        if (kategori.equalsIgnoreCase("Kids")) {
                            if (ukuran <= 40) {
                                harga = 750000;
                            }
                        } else {
                            if (ukuran >= 40) {
                                harga = 1500000;
                            }
                        }
                    }
                }

                if (harga == 0) {
                    System.out.println("Data tidak sesuai");
                } else {
                    System.out.println("Harga sepatu : Rp " + harga);
                }

            } else {
                System.out.println("Ukuran tidak tersedia");
            }
        } else {
            System.out.println("Ukuran tidak tersedia");
        }

        sc.close();
    }
}