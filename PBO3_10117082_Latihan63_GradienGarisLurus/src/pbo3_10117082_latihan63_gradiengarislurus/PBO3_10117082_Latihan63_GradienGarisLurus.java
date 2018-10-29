/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan63_gradiengarislurus;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hasil dari 
* hitung gradien dengan x dan y yg sudah ditentukan dengan konsep interface
 */
public class PBO3_10117082_Latihan63_GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Koordinat kd = new Koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik ("+kd.getX1()+","+kd.getY1()
                +") dan ("+kd.getX2()+","+kd.getY2()+")"+"\nmemiliki gradien sebesar "
                +kd.hitungGradien());
        Koordinat kd1 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+kd1.getX1()+","+kd1.getY1()
                +") dan ("+kd1.getX2()+","+kd1.getY2()+")"+"\nmemiliki gradien sebesar "
                +kd1.hitungGradien());
        
    }
    
}
