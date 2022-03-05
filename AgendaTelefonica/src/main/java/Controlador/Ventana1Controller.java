/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.Contacto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author gerar
 */
public class Ventana1Controller implements Initializable {
    LocalDateTime fechaHora;
    @FXML
    private TableView<Contacto> tbAgenda;
    @FXML
    private Button btnA;
    @FXML
    private Button btnB;
    @FXML
    private Button btnC;
    @FXML
    private Button btnD;
    @FXML
    private Button btnE;
    @FXML
    private Button btnF;
    @FXML
    private Button btnG;
    @FXML
    private Button btnH;
    @FXML
    private Button btnI;
    @FXML
    private Button btnJ;
    @FXML
    private Button btnK;
    @FXML
    private Button btnL;
    @FXML
    private Button btnM;
    @FXML
    private Button btnN;
    @FXML
    private Button btnÑ;
    @FXML
    private Button btnO;
    @FXML
    private Button btnP;
    @FXML
    private Button btnQ;
    @FXML
    private Button btnR;
    @FXML
    private Button btnS;
    @FXML
    private Button btnT;
    @FXML
    private Button btnU;
    @FXML
    private Button btnV;
    @FXML
    private Button btnX;
    @FXML
    private Button btnY;
    @FXML
    private Button btnZ;
    @FXML
    private TextField tfNombre;
    @FXML
    private Button btnBuscar;
    @FXML
    private Label lbNumContactos;
    
    private ObservableList<Contacto> contactos;
    private ObservableList<Contacto> busquedaI;
    private ObservableList<Contacto> busquedaN;
    @FXML
    private AnchorPane panel;
    @FXML
    private TextField tfNombreAgregar;
    @FXML
    private TextField tfApellidos;
    @FXML
    private TextField tfApodo;
    @FXML
    private TextField tfDireccion;
    @FXML
    private TextField tfEMail;
    @FXML
    private TextField tfTParticular;
    @FXML
    private TextField tfTMovil;
    @FXML
    private TextField tfTTrabajo;
    @FXML
    private TextField tfExtencion;
    @FXML
    private RadioButton rbFamilia;
    @FXML
    private RadioButton rbAmigos;
    @FXML
    private RadioButton rbPareja;
    @FXML
    private RadioButton rbOtros;
    @FXML
    private Button btnAgregar;
    @FXML
    private TextArea taNota;
    
    private ToggleGroup tg;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        inicializaListaBotones();
        inicializaTabla();
        contactos = FXCollections.observableArrayList();
        iniciaContactos();
        tbAgenda.setItems(contactos);
        llenaTabla(contactos);
        inicializaRadioButtons();
        
        
    }
    public void iniciaContactos(){
        LocalDateTime a = LocalDateTime.now();
        Contacto c1 = new Contacto("Alan", "Garcia Escobar", "Mago", a, "Iztapalapa 65", "555555555", "alan@gmail.com","Amigos");
        Contacto c2 = new Contacto("Gerardo", "Martinez Flores", "Gerry", a, "Tulyehualco 66", "555555555", "gerry@gmail.com","Amigos");
        Contacto c3 = new Contacto("Angel", "Granados Perez", "Feo", a, "Milpa Alta 22", "555555555", "angel@gmail.com","Amigos");
        Contacto c4 = new Contacto("Isaac", "Palacios Solis", "Rico", a, "Santa Martha 88", "555555555", "isaac@gmail.com","Amigos");
        Contacto c5 = new Contacto("Gustavo", "Juarez Hernandez", "Guapo", a, "Reforma 55", "555555555", "gus@gmail.com","Amigos");
        contactos.add(c1);
        contactos.add(c2);
        contactos.add(c3);
        contactos.add(c4);
        contactos.add(c5);
        
    }
    EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent t) {
            busquedaI = FXCollections.observableArrayList();
            char letraI = t.getSource().toString().charAt(13);
            for(Contacto c : contactos){
                if( letraI == c.getNombre().charAt(0)){
                    busquedaI.add(c);
                }
            }
            if(busquedaI.size() != 0){
                llenaTabla(busquedaI);
            }
            else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Busqueda fallida");
                alert.setContentText("No se encontro ningun contacto con la inicial");
                alert.showAndWait();
            }
        }
    };
    public void inicializaListaBotones(){
        btnA.setOnMouseClicked(handler);
        btnB.setOnMouseClicked(handler);
        btnC.setOnMouseClicked(handler);
        btnD.setOnMouseClicked(handler);
        btnE.setOnMouseClicked(handler);
        btnF.setOnMouseClicked(handler);
        btnG.setOnMouseClicked(handler);
        btnH.setOnMouseClicked(handler);
        btnI.setOnMouseClicked(handler);
        btnJ.setOnMouseClicked(handler);
        btnK.setOnMouseClicked(handler);
        btnL.setOnMouseClicked(handler);
        btnM.setOnMouseClicked(handler);
        btnN.setOnMouseClicked(handler);
        btnÑ.setOnMouseClicked(handler);
        btnO.setOnMouseClicked(handler);
        btnP.setOnMouseClicked(handler);
        btnQ.setOnMouseClicked(handler);
        btnR.setOnMouseClicked(handler);
        btnS.setOnMouseClicked(handler);
        btnT.setOnMouseClicked(handler);
        btnU.setOnMouseClicked(handler);
        btnV.setOnMouseClicked(handler);
        btnX.setOnMouseClicked(handler);
        btnY.setOnMouseClicked(handler);
        btnZ.setOnMouseClicked(handler);
    }
    public void inicializaTabla(){
        TableColumn nombreCol = new TableColumn("Nombre");
        nombreCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("nombre"));
        TableColumn apellidosCol = new TableColumn("Apellidos");
        apellidosCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("apellidos"));
        TableColumn apodoCol = new TableColumn("Apodo");
        apodoCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("apodo"));
        TableColumn fecha_horaCol = new TableColumn("Fecha/Hora");
        fecha_horaCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("fechaHora"));
        TableColumn direccionCol = new TableColumn("Direccion");
        direccionCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("direccion"));
        TableColumn telParticularCol = new TableColumn("Tel Particular");
        telParticularCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("tParticular"));
        TableColumn telMovilCol = new TableColumn("Tel Movil");
        telMovilCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("tMovil"));
        TableColumn telTrabajoCol = new TableColumn("Tel Trabajo");
        telTrabajoCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("tTrabajo"));
        TableColumn extensionCol = new TableColumn("Extension\ntrabajo");
        extensionCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("extension"));
        TableColumn eMailCol = new TableColumn("eMail");
        eMailCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("eMail"));
        TableColumn tipoCol = new TableColumn("Tipo\nContacto");
        tipoCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("tipo"));
        TableColumn notaCol = new TableColumn("Nota");
        notaCol.setCellValueFactory(new PropertyValueFactory<Contacto, String>("nota"));
        tbAgenda.getColumns().addAll(nombreCol, apellidosCol, apodoCol, fecha_horaCol,direccionCol,telParticularCol,
                telMovilCol, telTrabajoCol, extensionCol, eMailCol, tipoCol, notaCol);
        
    }
    public void llenaTabla(ObservableList lista){
        tbAgenda.setItems(lista);
        lbNumContactos.setText(String.valueOf(lista.size()));
    }

    @FXML
    private void busquedaPorNombre(MouseEvent event) {
        String nombre = tfNombre.getText();
        busquedaN = FXCollections.observableArrayList();
        for(Contacto c : contactos){
            if (nombre.equals(c.getNombre())){
                busquedaN.add(c);
            }
        }
        if(busquedaI.size() != 0){
                llenaTabla(busquedaN);
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Busqueda fallida");
            alert.setContentText("No se encontro ningun contacto con el nombre escrito");
            alert.showAndWait();
        }
    }
    
    public void inicializaRadioButtons(){
        tg = new ToggleGroup();
        rbFamilia.setToggleGroup(tg);
        rbAmigos.setToggleGroup(tg);
        rbPareja.setToggleGroup(tg);
        rbOtros.setToggleGroup(tg);
    }

    @FXML
    private void verificaDatos(MouseEvent event) {
        if(tfNombreAgregar.getText().trim().equals("")){
            mensajeAlerta("No se ha introducido ningun nombre");
            return;
        }
        if(!verificaNumero(tfTParticular.getText().trim())
                && !verificaNumero(tfTMovil.getText().trim())
                && !verificaNumero(tfTTrabajo.getText().trim())){
            mensajeAlerta("No se ha introducido ningun numero\n Verifica los datos");
            return;
        }
        if(!verificaEMail(tfEMail.getText())){
            mensajeAlerta("Email invalido verifica");
            return;
        }
        String tipo = verificaTipo();
        if(tipo == null){
            mensajeAlerta("No se ha seleccionado un tipo para el contacto");
            return;
        }
        Contacto nuevo = new Contacto();
        nuevo.setNombre(tfNombreAgregar.getText());
        nuevo.setApellidos(tfApellidos.getText());
        nuevo.setApodo(tfApodo.getText());
        fechaHora = LocalDateTime.now();
        nuevo.setFechaHora(fechaHora);
        nuevo.setDireccion(tfDireccion.getText());
        if(verificaNumero(tfTParticular.getText().trim())){
            nuevo.settParticular(tfTParticular.getText());
        }
        if(verificaNumero(tfTMovil.getText().trim())){
            nuevo.settMovil(tfTMovil.getText());
        }
        if(verificaNumero(tfTTrabajo.getText().trim())){
            nuevo.settTrabajo(tfTTrabajo.getText());
        }
        if(verificaNumero(tfExtencion.getText().trim())){
            nuevo.setExtension(tfExtencion.getText());
        }
        nuevo.seteMail(tfEMail.getText());
        nuevo.setTipo(tipo);
        nuevo.setNota(taNota.getText());
        this.contactos.add(nuevo);
        this.tbAgenda.setItems(contactos);
        
    }
    public String verificaTipo(){
        RadioButton selectedRB =(RadioButton) tg.getSelectedToggle();
        if(selectedRB!=null)
            return selectedRB.getText();
        return null;
    }
    public Boolean verificaEMail(String email){
        Pattern patron = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patron.matcher(email);
        if(mat.find())
            return true;
        return false;
    }
    public Boolean verificaNumero(String numero){
        if(numero.equals(""))
            return false;
        return true;
    }
    public void mensajeAlerta(String mensaje){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Error al agregar");
            alert.setContentText(mensaje);
            alert.showAndWait();
    }
}


