import javafx.fxml.FXML;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import java.util.Optional;


public class BookedController {
    @FXML
    protected void YesButtonPressed(ActionEvent event) {

        System.out.println("Yes Button");

        screenChange4("TimeGUI", event);
    }


    private void screenChange4 (String name, ActionEvent event){
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        try{ Parent root = FXMLLoader.load(getClass().getResource(name + ".fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle(name);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.setOnCloseRequest((WindowEvent we) -> exitPrompt(we));
            stage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @FXML protected void NoButtonPressed(ActionEvent event) {

        System.out.println("No Button");

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText("Are you sure you want to exit?");

        Optional result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        } else {
            event.consume();
        }
    }

    public static void exitPrompt(WindowEvent we) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText("Are you sure you want to exit?");

        Optional result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        } else {
            we.consume();
        }

    }


}


