/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program menghitung gaji
 */
public class PBO210118080Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Tunj,TotalGaji;
        
        System.out.println("========================== Program Tunjangan ==========================");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: Rp. ");
        Scanner Sgaji = new Scanner(System.in);
        double Gaji = Sgaji.nextDouble();
        
        System.out.print("Status Anda ? (Menikah/Belum)\t\t:  ");
        Scanner Sstat = new Scanner(System.in);
        String Status = Sstat.next();
        System.out.println("");
        System.out.println("======================== Hasil Perhitungan Gaji ========================");
        Tunj=("Menikah".equals(Status))?0.35*Gaji:0;
        System.out.println("Gaji Pokok\t:Rp. "+Gaji);
        System.out.println("Tunjangan\t:Rp. "+Tunj);
        TotalGaji=Gaji+Tunj;
        System.out.println("Total Gaji\t: Rp. "+TotalGaji);
        System.out.println("(Developed By : Taufiq Rizky)");
        
        
        
    }
    
}
