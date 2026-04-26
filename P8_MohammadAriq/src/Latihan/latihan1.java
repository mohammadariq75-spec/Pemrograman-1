package Latihan;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas perulangan: ");
        int b = input.nextInt();

        for (int a = 1; a <= b; a++) {
            System.out.println("Nilai ke : " + a);
        }
    }
}
