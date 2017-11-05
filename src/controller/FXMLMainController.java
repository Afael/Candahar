/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 * FXML Controller class
 *
 * @author 4f43L
 */
public class FXMLMainController implements Initializable {

    private final Map<String, Tab> openTabs = new HashMap<>();

    @FXML
    private ListView<String> listMenuLocation;
    private ObservableList<String> subListMenuLocation;
    @FXML
    private TabPane MainFormTab;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        generateSubListMenu();
        selectListMenu();
    }

    private void generateSubListMenu() {
        subListMenuLocation = FXCollections.observableArrayList();
        subListMenuLocation.add("Country");
        subListMenuLocation.add("State");
        subListMenuLocation.add("City");
        listMenuLocation.setItems(subListMenuLocation);
    }

    private void selectListMenu() {
        
        listMenuLocation.getSelectionModel()
                .selectedItemProperty()
                .addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            int selectMenu = listMenuLocation.getSelectionModel().getSelectedIndex();
            switch (selectMenu) {
                case 0:
                    openTab("/view/FXMLSyCountry.fxml", "Country");
                    break;
                case 1:
                    openTab("/view/FXMLSyState.fxml", "State");
                    break;
                case 2:
                    openTab("/view/FXMLSyCity.fxml", "City");
                    break;
                default:
                    break;
            }
        });
    }

    private void openTab(String fxmlFile, String name) {
        if (openTabs.containsKey(fxmlFile)) {
            MainFormTab.getSelectionModel().select(openTabs.get(fxmlFile));
        } else {
            try {
                Node cityForm = FXMLLoader.load(getClass().getResource(fxmlFile));
                Tab tab = new Tab(name, cityForm);
                MainFormTab.getTabs().add(tab);
                openTabs.put(fxmlFile, tab);
                MainFormTab.getSelectionModel().select(openTabs.get(fxmlFile));
                tab.setOnClosed(e -> openTabs.remove(fxmlFile));
            } catch (IOException e) {}

        }
    }
}
