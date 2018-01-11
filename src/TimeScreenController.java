import javafx.fxml.FXML;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class TimeScreenController {

    private String PeriodPressed;

    @FXML protected void Period1Pressed(ActionEvent event) {
        System.out.println("Period1"); // prints to the console which period was pressed
        PeriodPressed = "Period1";
        screenChange("ComputerareaGUI", event); // Triggers the screen change to the computer area GUI

    }
    @FXML protected void Period2Pressed(ActionEvent event) {
        System.out.println("Period2"); // prints to the console which period was pressed
        PeriodPressed = "Period2";
        screenChange("ComputerareaGUI", event); // Triggers the screen change to the computer area GUI
    }
    @FXML protected void Period3Pressed(ActionEvent event) {
        System.out.println("Period3"); // prints to the console which period was pressed
        PeriodPressed = "Period3";
        screenChange("ComputerareaGUI", event); // Triggers the screen change to the computer area GUI
    }
    @FXML protected void Period4Pressed(ActionEvent event) {
        System.out.println("Period4"); // prints to the console which period was pressed
        PeriodPressed = "Period4";
        screenChange("ComputerareaGUI", event); // Triggers the screen change to the computer area GUI
    }
    @FXML protected void Period5Pressed(ActionEvent event) {
        System.out.println("Period5"); // prints to the console which period was pressed
        PeriodPressed = "Period5";
        screenChange("ComputerareaGUI", event); // Triggers the screen change to the computer area GUI
    }

    private void screenChange(String name, ActionEvent event){
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