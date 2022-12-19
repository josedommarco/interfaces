package com.mycompany.examenfxml;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Persona;

public class PrimaryController {

    @FXML
    private TextField txtNombre;
    @FXML
    private ComboBox<String> comboSexo;
    @FXML
    private ComboBox<String> comboActividad;
    @FXML
    private Spinner<Integer> spinnerEdad;
    @FXML
    private Spinner<Double> spinnerPeso;
    @FXML
    private Spinner<Integer> spinnerAltura;
    @FXML
    private Button btnAñadir;
    @FXML
    private TableView<Persona> tabla;
    @FXML
    private TableColumn<Persona, String> cNombre;
    @FXML
    private TableColumn<Persona, String> cSexo;
    @FXML
    private TableColumn<Persona, String> cEdad;
    @FXML
    private TableColumn<Persona, String> cPeso;
    @FXML
    private TableColumn<Persona, String> cAltura;
    @FXML
    private TableColumn<Persona, String> cActividad;
    @FXML
    private TableColumn<Persona, String> cGER;
    @FXML
    private TableColumn<Persona, String> cGET;

    List<Persona> personaNueva = new ArrayList();
   
    
    public void initialize(URL url, ResourceBundle rb) {
        
        iniciarTabla();
        llenarCombos();
        llenarSpinners();
        actualizarTabla();

    }

    public void iniciarTabla() {
        cNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        cSexo.setCellValueFactory(new PropertyValueFactory("sexo"));
        cEdad.setCellValueFactory(new PropertyValueFactory("edad"));
        cPeso.setCellValueFactory(new PropertyValueFactory("peso"));
        cAltura.setCellValueFactory(new PropertyValueFactory("altura"));
        cActividad.setCellValueFactory(new PropertyValueFactory("actividad"));
        cGER.setCellValueFactory(new PropertyValueFactory("ger"));
        cGET.setCellValueFactory(new PropertyValueFactory("get"));

    }
    
    public void actualizarTabla(){
       ObservableList<Persona> x = FXCollections.observableArrayList();
        x.addAll(personaNueva);

        tabla.getItems().clear();
        tabla.getItems().addAll();
        
        
    }

    private void llenarCombos() {
        ObservableList<String> sexo = FXCollections.observableArrayList();
        String[] hm = {"Hombre", "Mujer"};
        sexo.addAll(hm);
        comboSexo.setItems(sexo);

        ObservableList<String> actividad = FXCollections.observableArrayList();
        String[] ac = {"Muy ligera", "Ligera", "Moderada", "Intensa"};
        actividad.addAll(ac);
        comboActividad.setItems(actividad);

    }

    private void llenarSpinners() {
        SpinnerValueFactory<Integer> edad = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 70, 0, 1);
        spinnerEdad.setValueFactory(edad);

        SpinnerValueFactory<Double> peso = new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 150.0, 50.0, 0.50);
        spinnerPeso.setValueFactory(peso);

        SpinnerValueFactory<Integer> altura = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 70, 0, 1);
        spinnerAltura.setValueFactory(altura);

    }

    @FXML
    private void AñadirTabla(ActionEvent event) {

        Persona persona = new Persona();

        persona.setNombre(txtNombre.getText());
        persona.setEdad(spinnerEdad.getValue());
        persona.setSexo(comboSexo.getValue());
        persona.setPeso(spinnerPeso.getValue());
        persona.setAltura(spinnerAltura.getValue());
        persona.setActividad(comboActividad.getValue());
        
        personaNueva.add(persona);
        actualizarTabla();
        limpiarTabla();
        

    }

    private void limpiarTabla() {
        
        txtNombre.setText("");
        comboSexo.getEditor().clear();
        spinnerEdad.getEditor().clear();
        spinnerPeso.getEditor().clear();
        spinnerAltura.getEditor().clear();
        comboActividad.getEditor().clear();
        
    }
}
