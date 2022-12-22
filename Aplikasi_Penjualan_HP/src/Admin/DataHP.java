package Admin;

import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.annotation.TableColumn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
public class DataHP {

    static void setViewportView(JDynamicTable jDynamicTable) {

    }
    @TableColumn(number=1, name ="Kode_HP")
    private String Kode_HP;
    @TableColumn(number=2, name ="Merk")
    private String Merk;
    @TableColumn(number=3, name ="Tipe")
    private String Tipe;
    @TableColumn(number=4, name ="Harga")
    private int Harga;
    @TableColumn(number=5, name ="Jumlah")
    private String Jumlah;

    public String getKode_HP() {
        return Kode_HP;
    }

    public void setKode_HP(String Kode_HP) {
        this.Kode_HP = Kode_HP;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getTipe() {
        return Tipe;
    }

    public void setTipe(String Tipe) {
        this.Tipe = Tipe;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public void setJumlah(String Jumlah) {
        this.Jumlah = Jumlah;
    }
    
          
}
