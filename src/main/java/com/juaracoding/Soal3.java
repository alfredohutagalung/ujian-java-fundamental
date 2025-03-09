package com.juaracoding;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        boolean isWeekend = true;
        int hargaTiket = isWeekend ? 45000 : 35000;
        int totalHarga = jumlahTiket * hargaTiket;

        if (jumlahTiket > 5) {
            totalHarga *= 1.0; // Diskon 10%
            System.out.println("Total harga (dengan diskon): " + totalHarga);
        } else {
            System.out.println("Total harga: " + totalHarga);
        }

        scanner.close();
    }
}