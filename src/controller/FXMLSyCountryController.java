/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.nio.sctp.Notification;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author 4f43L
 */
public class FXMLSyCountryController implements Initializable {

    @FXML
    private Button btnAdd;
    @FXML
    private Button btnEdit;
    @FXML
    private Button btnDelete;
    @FXML
    private TextField txtFind;
    @FXML
    private TextField txtLimit;
    @FXML
    private Button btnRefresh;
    @FXML
    private Button btnNext;
    @FXML
    private TableView<?> tblCountry;
    @FXML
    private Button btnPrevious;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnAddDataAction(ActionEvent event) {
        Notifications notification = Notifications.create()
                .title("Add data complete")
                .text("Data successfully added")
                .graphic(null)
                .hideAfter(Duration.seconds(5))
                .position(Pos.TOP_RIGHT);
        notification.darkStyle();
        notification.showInformation();
    }

    @FXML
    private void btnEditDataAction(ActionEvent event) {
    }

    @FXML
    private void btnDeleteDataAction(ActionEvent event) {
    }

    @FXML
    private void txtFindKeyRelease(KeyEvent event) {
    }

    @FXML
    private void btnPreviousAction(ActionEvent event) {
    }

    @FXML
    private void btnRefreshAction(ActionEvent event) {
    }

    @FXML
    private void btnNextAction(ActionEvent event) {
    }
    
}
