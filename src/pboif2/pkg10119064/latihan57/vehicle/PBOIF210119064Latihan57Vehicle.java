/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan57.vehicle;

import model.Bicycle;
import model.Skateboard;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menampilkan 
 * jenis kendaraan beserta atributtnya
 */
public class PBOIF210119064Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek Bicycle
        Bicycle bicycle = new Bicycle();
        //input
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        //output
        System.out.println("Brand : " + bicycle.getMyBrand());
        System.out.println("Model : " + bicycle.getMyModel());
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());
        
        System.out.println();
        
        //inisialisasi objek Skateboard
        Skateboard skateboard =  new Skateboard();
        //input
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLength(54.5);
        //output
        System.out.println("Brand : " + skateboard.getMyBrand());
        System.out.println("Model : " + skateboard.getMyModel());
        System.out.println("Panjang Board : " + skateboard.getMyBoardLength());
    }
    
}
