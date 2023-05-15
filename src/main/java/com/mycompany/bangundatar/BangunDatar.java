package com.mycompany.bangundatar;

import java.util.Scanner;

public class BangunDatar {
    Scanner scanner = new Scanner(System.in);
    String nama;
    int luas;
    int keliling;
    
    void nama(){
        System.out.println(nama);
    }
    
    void intro(){
        System.out.println("====================================");
        System.out.println("Menghitung Luas dan keliling Persegi");
        System.out.println("====================================");
        System.out.print("Silahkan Masukkan Panjang Sisi = ");
        int sisi = scanner.nextInt();
        luas = sisi * sisi;
        keliling = 4 * sisi;
        System.out.println("Luas Persegi adalah = " + luas);
        System.out.println("Keliling persegi adalah = " + keliling);
        scanner.close();
    }
    
}
