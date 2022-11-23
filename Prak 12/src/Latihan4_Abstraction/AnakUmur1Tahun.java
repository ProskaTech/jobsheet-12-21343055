/*
 * Nama : Muhamad Fathur Rahman
 * Nim  : 21343055
 * Prodi: Teknik Informatika
 */

package Latihan4_Abstraction;

class AnakUmur1Tahun extends Orang{
    
    public void namaAyahku(){
        System.out.println("Nama Ayahku adalah " + namaAyah);
    }

    @Override
    public void makan(){
        System.out.println("Anak Umur 1 Tahun Makan Asi");
    }

    @Override
    public void minum(){
        System.out.println("Anak Umur 1 Tahun Minum Asi");
    }
}
