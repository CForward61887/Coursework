import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.TextField;
import javafx.event.*;
import javafx.stage.Stage;


public class controller {
    @FXML private TextField Login_Field;
    @FXML private TextField Password_Field;

    private String CorrectLogin = "12345"; // Sets the correct login number
    private String CorrectPassword = "abcdef"; // Sets the correct password



    @FXML protected void LoginButtonPressed(ActionEvent event) {
        System.out.println(Login_Field.getText()); // Prints what was entered into the Login textfield into the console
        System.out.println(Password_Field.getText()); // Prints what was entered into the Password textfield into the console
        if (Login_Field.getText().equals(CorrectLogin)) { // Checks that the login entered into the textfield is the correct login
            if (Password_Field.getText().equals(CorrectPassword)) { // Checks that the password entered into the textfield is correct and then proceeds to the next line where it is changed to the next scene
                Node node = (Node) event.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                Parent root = null;
                try{root = FXMLLoader.load(getClass().getResource("TimeGUI.fxml"));}catch (Exception e){} // This selects the GUI made in Scene Builder
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Time Screen"); // This sets the name for each scene which is located at the top of the window
                stage.setResizable(false);
                stage.setScene(scene);
                stage.show();
            }

        }

    }
}

