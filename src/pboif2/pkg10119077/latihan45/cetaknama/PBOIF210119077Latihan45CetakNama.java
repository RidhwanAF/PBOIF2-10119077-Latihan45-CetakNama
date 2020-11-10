/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fuazan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Mencetak Nama
 */
public class PBOIF210119077Latihan45CetakNama {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Printer objPrinter = new Printer();
        
        System.out.println("======Aplikasi Pencetak Nama======");
        System.out.print("Masukkan nama anda : ");
        objPrinter.setNama(input.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        objPrinter.setJmlCetak(input.nextInt());
        
        objPrinter.cetak(objPrinter.getNama());
        objPrinter.cetak(objPrinter.getJmlCetak(), objPrinter.getNama());
    }
    
}
