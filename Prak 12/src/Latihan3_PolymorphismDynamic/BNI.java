/*
 * Nama : Muhamad Fathur Rahman
 * Nim  : 21343055
 * Prodi: Teknik Informatika
 */

package Latihan3_PolymorphismDynamic;

public class BNI extends Bank {
    //overriding sukuBunga method
    float sukuBunga(){
        return 10.6f;
    }
}
class Mandiri extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
        return 9.4f;
    }
}
