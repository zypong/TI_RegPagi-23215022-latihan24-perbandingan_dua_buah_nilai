/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;
import java.util.Scanner;
/**
NAMA  : IMZY ZULIJAR SETIAWAN
 *NIM   : 23215022
 *PRODI : TEKNIK INFORMATIKA
 */
public class perbandingan {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = scanner.nextInt();
            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("Ulangi Aktifitas? (Ya/Tidak): ");
            String pilihan = scanner.next();
            if (!pilihan.equalsIgnoreCase("Ya")) {
                break;
            }
        }
        System.out.println("BUILD SUCCESSFUL");
        scanner.close();
    }
}