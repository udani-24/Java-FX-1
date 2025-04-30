package Controller;

import DB.DBConnection;
import Model.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ItemFormController {
    public TextField itemName;
    public TextField prize;
    public TextField quantity;

    public void btnAddOnAction(ActionEvent actionEvent) {
        String Name = itemName.getText();
        Integer Prize = Integer.parseInt(prize.getText());
        Integer  Quantity = Integer.parseInt(quantity.getText());

        Item items = new Item(Name, Prize, Quantity);

        DBConnection.getInstance().getDBList().add(items);

    }

    public void btnViewAllOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(
                new Scene(
                        FXMLLoader.load(
                                getClass().getResource("/view/view_items.fxml")
                        )
                )
        );
        stage.show();
    }
}
