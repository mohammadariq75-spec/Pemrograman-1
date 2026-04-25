import java.util.Scanner;

public class latihan_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kehadiran, nilaiAkhir;

        System.out.print("Masukkan jumlah kehadiran: ");
        kehadiran = input.nextInt();

        System.out.print("Masukkan nilai akhir: ");
        nilaiAkhir = input.nextInt();

        if (kehadiran >= 75 && nilaiAkhir >= 85) {
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Lulus");
        } else if (kehadiran >= 75 && nilaiAkhir >= 70) {
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Tidak Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        input.close();
    }
}