package com.juaracoding.alfredohutagalung1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama film: ");
        String namaFilm = scanner.nextLine();

        //mengubah nama film menjadi huruf besar
        String namaFilmUpper = namaFilm.toUpperCase();
        System.out.println("Nama Film dalam huruf besar : " + namaFilmUpper);

        scanner.close();
    }
}
