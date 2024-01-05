
package monedas;

import Recursos.Conversion;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import Recursos.TipoCambio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author migue
 */
public class InterfazFXMLController implements Initializable {

    String value1, value2;
    @FXML
    private Button btn1;
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        txt1.textProperty().addListener((observable, oldValue, newValue) -> {         
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        if(newValue.isEmpty())
        {
            lbl1.setVisible(false);
        }        
        if(newValue.isEmpty() ||!newValue.matches("\\d+"))
        {
            lbl1.setText("DECIMAL: Ingrese un valor correcto");
            lbl1.setVisible(true);
            txt2.setText("");
        }else
        {
            newValue=Integer.toBinaryString(Integer.parseInt(newValue));
            txt2.setText(newValue);                
                
        }    

        });
        
        txt2.textProperty().addListener((observable, oldValue, newValue) -> {         
        lbl1.setVisible(false);
        lbl2.setVisible(false);

        if(!newValue.matches("\\d+"))
        {
            lbl2.setText("BINARIO: Ingrese un valor correcto");
            lbl2.setVisible(true);
            txt1.setText("");
        }else
        {
            try {
                newValue=String.valueOf(Integer.parseInt(newValue,2));
                txt1.setText(newValue);  
                lbl2.setVisible(false);
            } catch (NumberFormatException e) {
                lbl2.setText("Ingrese un número binario válido");
                lbl2.setVisible(true);
            }               
        }    
        });        
        
        
    }    

    @FXML
    private void clic(ActionEvent event) {
  
    }

    @FXML
    private void keypress1(ActionEvent event) {

    }

    @FXML
    private void keypress2(ActionEvent event) {

    }

    
}
    
    
    

