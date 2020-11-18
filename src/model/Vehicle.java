/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menampilkan 
 * jenis kendaraan beserta atributtnya
 */
public class Vehicle {
    private String myBrand;
    private String myModel;

    public Vehicle() {
        //mengambil nama berdasarkan nama class
        String nama[] = getClass().getCanonicalName().split("\\.");
        System.out.println("Nama  : " + nama[nama.length - 1]);
    }

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
    
    
}
