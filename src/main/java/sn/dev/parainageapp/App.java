package sn.dev.parainageapp;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("/pages/login.fxml"));
        Scene scene = new Scene(parent);
        stage.setTitle("Page de Connnexion");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        DBConnection db = new DBConnection();
        db.getConnection();
        launch();
    }
}
