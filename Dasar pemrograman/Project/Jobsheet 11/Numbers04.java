import java.util.Arrays;

public class Numbers04 {
    public static void main(String[] args) {

        int[][] myNumbers = new int[3][];

        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        System.out.println("Isi array:");

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        System.out.println("\nIsi seluruh array:");

        System.out.println(Arrays.deepToString(myNumbers));

        System.out.println("\nPanjang setiap baris:");

        // Pertanyaan nomor 5: Modifikasi menampilkan panjang setiap baris
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": "
                    + myNumbers[i].length);
        }

        // Pertanyaan nomor 7
        System.out.println("\nMengubah panjang baris pertama:");

        myNumbers[0] = new int[7];

        System.out.println("Jumlah baris: " + myNumbers.length);
        System.out.println("Panjang baris pertama: " + myNumbers[0].length);

        System.out.println("\nArray setelah diubah:");

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
    }
}
