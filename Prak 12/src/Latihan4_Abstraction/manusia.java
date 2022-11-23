/*
 * Nama : Muhamad Fathur Rahman
 * Nim  : 21343055
 * Prodi: Teknik Informatika
 */

package Latihan4_Abstraction;

public class manusia {
    public static void main(String[] args) {
        // Object induk tidak bisa dibuat disini 
        
        // Buat objek anak umur 1 tahun baru
        AnakUmur1Tahun a1= new AnakUmur1Tahun();

        // Panggil method anak umur 1 tahun
        a1.makan();
        a1.minum();
        a1.namaAyahku();
        System.out.println();
    }
}