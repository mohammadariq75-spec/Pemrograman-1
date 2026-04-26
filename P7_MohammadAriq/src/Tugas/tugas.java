package Tugas;

import java.util.Scanner;

public class tugas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== APLIKASI PENILAIAN AKADEMIK =====");

        System.out.print("Masukin jumlah pertemuan: ");
        int realisasi = input.nextInt();

        System.out.print("Masukin jumlah kehadiran: ");
        int kehadiran = input.nextInt();

        System.out.print("Masukin Nilai tugas: ");
        double nTugas = input.nextDouble();

        System.out.print("Masukin Nilai UTS: ");
        double nUTS = input.nextDouble();

        System.out.print("Masukin Nilai UAS: ");
        double nUAS = input.nextDouble();

        // proses
        double persenHadir = hitungKehadiran(realisasi, kehadiran);

        double nilaiAkhir = hitungNilaiAkhir(
                persenHadir, nTugas, nUTS, nUAS
        );

        String grade = tentukanGrade(persenHadir, nilaiAkhir);

        // aturan khusus kayak P4
        if (persenHadir < 75 && nilaiAkhir >= 55) {
            nilaiAkhir = 55;
        }

        // output
        tampilkanHasil(persenHadir, nilaiAkhir, grade);

        input.close();
    }


    // HITUNG KEHADIRAN
    static double hitungKehadiran(int total, int hadir) {
        return (hadir * 100.0) / total;
    }


    // HITUNG NILAI AKHIR (BOBOT)
    static double hitungNilaiAkhir(
            double hadir,
            double tugas,
            double uts,
            double uas
    ) {
        double presensi = hadir * 0.10;
        double nilaiTugas = tugas * 0.20;
        double nilaiUTS = uts * 0.30;
        double nilaiUAS = uas * 0.40;

        return presensi + nilaiTugas + nilaiUTS + nilaiUAS;
    }


    // PENENTUAN GRADE
    static String tentukanGrade(double hadir, double nilai) {

        if (hadir < 75) {
            System.out.println("\n[PERINGATAN] Kehadiran kurang dari 75%!");

            if (nilai >= 55) return "D";
            return "E";
        }

        if (nilai >= 80) return "A";
        else if (nilai >= 70) return "B";
        else if (nilai >= 60) return "C";
        else if (nilai >= 55) return "D";
        else return "E";
    }


    // OUTPUT
    static void tampilkanHasil(
            double hadir,
            double nilai,
            String grade
    ) {

        System.out.println("\n===== HASIL NILAI =====");
        System.out.printf("Kehadiran : %.2f%%\n", hadir);
        System.out.printf("Nilai akhir : %.2f\n", nilai);
        System.out.println("Grade : " + grade);
    }
}