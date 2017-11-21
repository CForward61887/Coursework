import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class Login_Screen extends Application{
    @Override
    public void start(Stage stage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        Scene scene = new Scene(root,600,400);
        stage.setTitle("Login Screen");
        stage.setResizable(false);
        stage.setScene(scene);

        stage.show();

    }
    public static void main(String args[]){launch(args);}
}