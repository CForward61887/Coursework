import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class Login_Screen extends Application{
    @Override
    public void start(Stage stage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml")); // This selects the GUI made in Scene Builder
        Scene scene = new Scene(root,600,400);
        stage.setTitle("Login Screen"); // This sets the name for each scene which is located at the top of the window
        stage.setResizable(false);
        stage.setScene(scene);

        stage.show();

        Model.DatabaseConnection d = new Model.DatabaseConnection("Computer_Reservation_System.db");

    }
    public static void main(String args[]){launch(args);}
}