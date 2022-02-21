package edu.uqtr.demolayout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DemoLayoutApplication extends Application {

    private static DemoLayoutApplication instance;

    private Stage stage;

    public DemoLayoutApplication() {
        instance = this;
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(DemoLayoutApplication.class.getResource("layout_controller.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 700);
        stage.setTitle("Demo des layouts");
        stage.setScene(scene);
        stage.show();
    }

    public Stage getStage() {
        return stage;
    }

    public static DemoLayoutApplication getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        launch();
    }
}