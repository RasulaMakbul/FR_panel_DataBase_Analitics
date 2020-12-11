/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frpaneldatabaseanalitics;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button LoginBtn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void LoginBtnAction(ActionEvent event) throws IOException {
        Parent ImportsceneParent = FXMLLoader.load(getClass().getResource("/importPage/fileImport.fxml"));
        Scene ImportScene= new Scene(ImportsceneParent);
        
        Stage ImportStage= new Stage();
        ImportStage.setScene(ImportScene);
        //ImportStage.initModality(Modality.APPLICATION_MODAL);
        ImportStage.show();
        
    }
    
}
