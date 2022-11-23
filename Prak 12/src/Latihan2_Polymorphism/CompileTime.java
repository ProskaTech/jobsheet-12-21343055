/*
 * Nama : Muhamad Fathur Rahman
 * Nim  : 21343055
 * Prodi: Teknik Informatika
 */

package Latihan2_Polymorphism;

public class CompileTime {
    //method keliling dengan single argumen
    static int keliling (int a){
        return 4 * a;
    }
    //method keliling dengan dua argumen (method overloading)
    static int keliling(int l, int b){
        return 2 * (l + b);
    }
}
