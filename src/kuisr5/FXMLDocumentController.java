/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisr5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

/**
 *
 * @author Sandralio
 */
public class FXMLDocumentController {
    
    @FXML
    private Label label;

    @FXML
    private JFXTextField edit_nama;

    @FXML
    private JFXTextField edit_tinggi;

    @FXML
    private JFXTextField edit_berat;

    @FXML
    private RadioButton tb_laki;

    @FXML
    private RadioButton tb_perempuan;

    @FXML
    private Button tb_proses;

    @FXML
    private Button tb_hapus;

    @FXML
    private TextArea hasil_analisis;

    @FXML
    private TextArea saran;

    @FXML
    private TextArea berat_ideal;

    @FXML
    void menghapus(ActionEvent event) {
           edit_nama.setText("");
           edit_tinggi.setText("");
           edit_berat.setText("");
           tb_laki.setSelected(false);
           tb_perempuan.setSelected(false);
           hasil_analisis.setText("");
           berat_ideal.setText("");
           tb_hapus.setText("");
    }

    @FXML
    private void menghasilkan(ActionEvent event) {
    int ideal = 0;
    String hasil= null;
    String Saran = null;
    String nama = edit_nama.getText();
    int tinggi = Integer.parseInt(edit_tinggi.getText());
     int berat = Integer.parseInt(edit_berat.getText());
     
    if(tb_laki.isSelected()) {
        ideal = parseInt(edit_tinggi.getText()) -105;
        
        berat_ideal.setText(""+ideal);
    if (ideal== parseInt(edit_tinggi.getText())){
            hasil= "nama:  "+edit_nama.getText()+ " Tinggi:  "+edit_tinggi.getText()+" ideal ";
            Saran = "pertahankan";
        }
        else if (ideal > parseInt(edit_tinggi.getText())){
            hasil = "nama: "+edit_nama.getText()+ " Tinggi: "+edit_tinggi.getText()+" Overweight ";
            Saran = "Kurangi makan malam";
        }
        else if (ideal < parseInt(edit_tinggi.getText())){
            hasil = "nama:  "+edit_nama.getText()+ " Tinggi:  "+edit_tinggi.getText()+" Underweight ";
            Saran = "Sering-sering makan";
        }
    }
        if(tb_perempuan.isSelected()) {
        ideal = parseInt(edit_tinggi.getText()) -110;
      

    berat_ideal.setText(""+ideal);
    if (ideal== parseInt(edit_tinggi.getText())){
            hasil= "nama: "+edit_nama.getText()+" Tinggi:  "+edit_tinggi.getText()+" ideal";
            Saran = "pertahankan";
        }
        else if (ideal > parseInt(edit_tinggi.getText())){
            hasil = "nama: "+edit_nama.getText()+" Tinggi: "+edit_tinggi.getText()+" Overweight";
            Saran = "Kurangi makan malam";
        }
        else if (ideal < parseInt(edit_tinggi.getText())){
            hasil = "nama: "+edit_nama.getText()+" Tinggi: "+edit_tinggi.getText()+" Underweight";
            Saran = "Sering-sering makan";
        }
    }
    hasil_analisis.setText(hasil);
    saran.setText(Saran);
    
}
}