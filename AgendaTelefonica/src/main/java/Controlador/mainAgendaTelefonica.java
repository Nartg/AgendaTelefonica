/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Controlador;

import Modelo.Contacto;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author gerar
 */
public class mainAgendaTelefonica extends Application {
    
    private static Scene scene;
    
    @Override
    public void start(Stage stage) throws IOException{
        scene = new Scene(loadFXML("/Vista/ventana1"));
        stage.setScene(scene);
        stage.setTitle("Agenda telefonica");
        stage.show();
        
    }
    
    static void setRoot(String fxml) throws IOException{
        scene.setRoot(loadFXML(fxml));
    }
    
    private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(mainAgendaTelefonica.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
