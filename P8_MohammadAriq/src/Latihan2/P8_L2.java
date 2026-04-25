package Latihan_2;

import java.util.Scanner;

public class P8_L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih (1): ");
        int p = input.nextInt();

        if (p == 1) {
            int v = 21 * 75 / 100;

            for (int a = 1; a <= v; a++) {
                System.out.print("Kehadiran: ");
                int k = input.nextInt();

                if (k >= v) {
                    System.out.println("Lulus");
                    break;
                } else {
                    System.out.println("Ulang");
                }
            }

        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}