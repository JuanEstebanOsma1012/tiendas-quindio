package co.edu.uniquindio.tiendaQuindio.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.edu.uniquindio.tiendaQuindio.model.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CrudProductoController implements Initializable{

	Producto selectedItem;
	
    @FXML
    private TableColumn tblColCodigoProducto;

    @FXML
    private TableColumn tblColTipoProducto;

    @FXML
    private TableColumn tblColNombreProducto;

    @FXML
    private TableColumn tblColCantidadProducto;

    @FXML
    private TableColumn tblColPrecioProducto;

    @FXML
    private TextField txtCodigoProducto;

    @FXML
    private TableView<Producto> tblProducto;
    
    @FXML
    private Button btnDatosListos;
    
    ObservableList<Producto> listaProductosData = FXCollections.observableArrayList();
    
    ArrayList listaColumnas = new ArrayList<>();
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
    	txtCodigoProducto.setOnKeyReleased((event   ) -> {
    		
    	});;
    	
    	listaColumnas.add(tblColCodigoProducto);

    	tblColCodigoProducto.setCellValueFactory(new PropertyValueFactory<>("codigo"));
    	tblColNombreProducto.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    	tblColPrecioProducto.setCellValueFactory(new PropertyValueFactory<>("precio"));
    	tblColCantidadProducto.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
    	tblColTipoProducto.setCellValueFactory(new PropertyValueFactory<>("tipoProducto"));
    	
    	tblProducto.setItems(listaProductosData);
    	
    	tblProducto.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
    		
    		selectedItem = newValue;
    		
    	});;
		
    	
    	tblProducto.edit(row, column);
	}
    
    @FXML
    void guardarDatos(ActionEvent event){
    	
    }

    @FXML
    void buscarProducto(ActionEvent event) {

    }

    @FXML
    void crearProducto(ActionEvent event) {

    }

    @FXML
    void eliminarProducto(ActionEvent event) {

    	if (selectedItem != null) {
    		eliminarProducto(selectedItem);
		}
    }

    @FXML
    void actualizarProducto(ActionEvent event) {
    	
    	if (selectedItem != null) {
    		
    		int index = listaProductosData.indexOf(selectedItem); 
    		tblProducto.edit(index, tblColCodigoProducto);
    		tblProducto.edit(index, tblColNombreProducto);
    		tblProducto.edit(index, tblColPrecioProducto);
    		tblProducto.edit(index, tblColCantidadProducto);
    		tblProducto.edit(index, tblColTipoProducto);
    		
    		btnDatosListos.setVisible(true);
		}
    }

	

}
