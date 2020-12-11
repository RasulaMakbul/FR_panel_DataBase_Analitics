/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importPage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class FileImportController implements Initializable {

    List<String> lstFile;
    @FXML
    private Button ImportBtn;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lstFile.add(".xlsx");
        
    }    

    @FXML
    private void ImportBtnAction(ActionEvent event) throws IOException {
        FileChooser fc= new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Excel File", lstFile));
        File f= fc.showOpenDialog(null);
        
        if(f!=null)
        {
            //System.out.println(f.getAbsolutePath());
            //labSingleFile.setText("SelectedFile ::"+f.getAbsolutePath());
            Parent DataViewMainPageParent = FXMLLoader.load(getClass().getResource("/DataViewPage/DataViewFrontPage.fxml"));
            Scene viewScene= new Scene(DataViewMainPageParent );
        
            Stage viewStage= new Stage();
            viewStage.setScene(viewScene);
            //viewStage.initModality(Modality.APPLICATION_MODAL);
            viewStage.show();
        }
    }
    
}
