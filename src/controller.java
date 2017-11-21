import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.TextField;
import javafx.event.*;
import javafx.stage.Stage;


public class controller {
    @FXML private TextField Login_Field;
    @FXML private TextField Password_Field;

    private String CorrectLogin = "12345";
    private String CorrectPassword = "abcdef";



    @FXML protected void LoginButtonPressed(ActionEvent event) {
        System.out.println(Login_Field.getText());
        System.out.println(Password_Field.getText());
        if (Login_Field.getText().equals(CorrectLogin)) {
            if (Password_Field.getText().equals(CorrectPassword)) {
                Node node = (Node) event.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                Parent root = null;
                try{root = FXMLLoader.load(getClass().getResource("TimeGUI.fxml"));}catch (Exception e){}
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Time Screen");
                stage.setResizable(false);
                stage.setScene(scene);
                stage.show();
            }

        }

    }
}

