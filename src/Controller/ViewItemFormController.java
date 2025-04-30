package Controller;

import DB.DBConnection;
import Model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewItemFormController {

    public TableView tblItems;
    public TableColumn colItem;
    public TableColumn colQuantity;
    public TableColumn colPrize;

    public void btnReloadOnAction(ActionEvent actionEvent) {
        loadTable();
    }

    public void loadTable(){
        colItem.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colPrize.setCellValueFactory(new PropertyValueFactory<>("prize"));

        ObservableList<Item> customerObservableList = FXCollections.observableArrayList();

        DBConnection.getInstance().getDBList().forEach(items ->{

            customerObservableList.add(items);
        });
        tblItems.setItems(customerObservableList);
    }
}
