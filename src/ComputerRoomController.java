import javafx.fxml.FXML;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class ComputerRoomController {

    private String ComputerSelected;

    @FXML protected void EnterButtonPressed(ActionEvent event) {

        System.out.println("Enter Button");

        screenChange3("Booked", event);
    }
        private void screenChange3 (String name, ActionEvent event){
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        try{ Parent root = FXMLLoader.load(getClass().getResource(name + ".fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle(name);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}