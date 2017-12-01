import javafx.fxml.FXML;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class ComputerareaController {

    private String ComputerareaPressed;

    @FXML protected void DellPressed(ActionEvent event) {

        System.out.println("The Dell");
        ComputerareaPressed = "Dell";
        screenChange2("ComputerRoom", event);
    }

    @FXML protected void UpgradePressed(ActionEvent event) {

        System.out.println("Upgrade");
        ComputerareaPressed = "Upgrade";
        screenChange2("ComputerRoom", event);
    }

    @FXML protected void eAssessmentPressed(ActionEvent event) {
        System.out.println("e-Assessment Centre");
        ComputerareaPressed = "eAssessment";
        screenChange2("ComputerRoom", event);

    }
    private void screenChange2 (String name, ActionEvent event){
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