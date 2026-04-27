package Soal;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String pilihan;
        double totalNilai = 0;
        int jumlahMahasiswa = 0;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = input.nextDouble();

            totalNilai += nilai;
            jumlahMahasiswa++;

            System.out.print("Apakah ingin input lagi? (y/t): ");
            pilihan = input.next();

        } while (pilihan.equalsIgnoreCase("y"));

        if (jumlahMahasiswa > 0) {
            double rataRata = totalNilai / jumlahMahasiswa;
            System.out.println("Rata-rata nilai: " + rataRata);
        } else {
            System.out.println("Tidak ada data.");
        }

        input.close();
    }
}