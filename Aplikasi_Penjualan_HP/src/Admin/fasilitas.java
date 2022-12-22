package Admin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class fasilitas {
   private Connection koneksi;
    private Object data;
   public fasilitas() {
 koneksi = KoneksiDatabase.getKoneksi();
}
public void insert(DataHP data){
 PreparedStatement prepare = null;
    try { 
        String sql ="INSERT INTO data_hp(Kode_HP,Merk,Tipe,Harga,Jumlah)VALUES(?,?,?,?,?)";
        prepare = (PreparedStatement) koneksi.prepareStatement(sql);
        prepare.setString(1, data.getKode_HP());
        prepare.setString(2, data.getMerk());
        prepare.setString(3, data.getTipe());
        prepare.setInt(4, data.getHarga());
        prepare.setString(5, data.getJumlah());
        prepare.executeUpdate();
        System.out.println("Prepare statement berhasil dibuat");
    }catch(SQLException ex){
    System.out.println("Prepare statement gagal dibuat");
    System.out.println("Pesan : " + ex.getMessage());
}finally{
 if (prepare != null){
try{
    prepare.close();
    System.out.println("Prepare statemen berhasil ditutup");
}catch(SQLException ex){
    System.out.println("Prepare statemen gagal ditutup");
    System.out.println("Pesan : " + ex.getMessage());
            }
        }
      }
}
public void update(DataHP data){
 PreparedStatement prepare = null;
try {
    String sql ="UPDATE data_hp SET Merk =?,Tipe=?,Harga=?,Jumlah=? WHERE Kode_HP=?";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, data.getMerk());
    prepare.setString(2, data.getTipe());
    prepare.setInt(3, data.getHarga());
    prepare.setString(4, data.getJumlah());
    prepare.setString(5, data.getKode_HP());
    prepare.executeUpdate();
    System.out.println("Prepare statement berhasil dibuat");
}catch(SQLException ex){
    System.out.println("Prepare statement gagal dibuat");
    System.out.println("Pesan : " + ex.getMessage());
}finally{
 if (prepare != null){
try{
    prepare.close();
    System.out.println("Prepare statement berhasil ditutup");
}catch(SQLException ex){
    System.out.println("Prepare statement gagal ditutup");
    System.out.println("Pesan : " + ex.getMessage());
            }
        }
    }
}
public void delete(String Kode_HP){
 PreparedStatement prepare = null;
try {
    String sql ="DELETE FROM data_hp WHERE Kode_HP=?";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, Kode_HP);
    prepare.executeUpdate();
    System.out.println("Prepare statement berhasil dibuat");
}catch(SQLException ex){
    System.out.println("Prepare statement gagal dibuat");
    System.out.println("Pesan : " + ex.getMessage());
}finally{
 if (prepare != null){
try{
    prepare.close();
    System.out.println("Prepare statement berhasil ditutup");
}catch(SQLException ex){
    System.out.println("Prepare statement gagal ditutup");
    System.out.println("Pesan : " + ex.getMessage());
               }
           }
     }
 }
public List<DataHP> selectAll() {
        PreparedStatement prepare = null;
        ResultSet result = null;
        List<DataHP> list = new ArrayList<>();
        String sql = "SELECT * FROM data_hp";
        try{
            prepare = (PreparedStatement) koneksi.prepareStatement(sql);
            result = prepare.executeQuery();
            while (result.next()) {
                
                DataHP data = new DataHP();
                data.setKode_HP(result.getString("Kode_HP"));
                data.setMerk(result.getString("Merk"));
                data.setTipe(result.getString("Tipe"));
                data.setHarga(result.getInt("Harga"));
                data.setJumlah(result.getString("Jumlah"));
            }
            
            System.out.println("Prepare statement berhasil dibuat");
            return list;
    
        } catch (SQLException ex) {
            System.out.println("Prepare statement gagal dibuat");
            System.out.println("Pesan : " + ex.getMessage());
            return list;
            
        } finally {
            if (prepare != null) {
                try {
                    prepare.close();
                    System.out.println("Prepare statement berhasil ditutup");
                } catch (SQLException ex) {
                    System.out.println("Prepare statement gagal ditutup");
                    System.out.println("Pesan : " + ex.getMessage());
                }
            }
            if (result != null) {
                try {
                    result.close();
                    System.out.println("Resultset berhasil ditutup");
                } catch (SQLException ex) {
                    System.out.println("Resultset gagal ditutup");
                    System.out.println("Pesan : " + ex.getMessage());
                }
            }
        }
    }
void viewReport(){
    String reportSource;
        String reportDest;
        reportSource = "D:\\UAS_PBO_Gefy Fitry Wijaya_A22100052\\Aplikasi_Penjualan_HP\\src\\Admin\\Laporan.jrxml";
        reportDest = "D:\\UAS_PBO_Gefy Fitry Wijaya_A22100052\\Aplikasi_Penjualan_HP\\src\\Admin\\Laporan.html";
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null,
                    koneksi);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, reportDest);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException e) {
            e.getStackTrace();
        }
    }
}

 






