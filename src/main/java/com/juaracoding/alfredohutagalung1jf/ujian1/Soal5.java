package com.juaracoding.alfredohutagalung1jf.ujian1;

public class Soal5 {
    public static void main(String[] args) {
        //array untuk menyimpan harga tiket
        int[] hargaTiket = {50000, 60000, 70000, 80000, 90000};

        int totalHarga = 0;

        //fungsi utama harga tiket
        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film " + (i + 1) + " : " + hargaTiket[i]);
            totalHarga += hargaTiket[i];
        }

        System.out.println("Total harga tiket : " + totalHarga);
    }
}
