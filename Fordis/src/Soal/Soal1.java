package Soal;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String pilihan;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            System.out.println("Nilai yang diinput: " + nilai);

            System.out.print("Apakah ingin input lagi? (y/t): ");
            pilihan = input.next();

        } while (pilihan.equalsIgnoreCase("y"));

        System.out.println("Program selesai");
        input.close();
    }
}