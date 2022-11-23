/*
 * Nama : Muhamad Fathur Rahman
 * Nim  : 21343055
 * Prodi: Teknik Informatika
 */

package Latihan4_Abstraction;

abstract class Orang {
    public String namaAyah = "Randi Proska";
    abstract void makan();
    public void minum(){
        System.out.println("Minum Air Teh dan Kopi");
    }
}
