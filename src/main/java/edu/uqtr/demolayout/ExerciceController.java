package edu.uqtr.demolayout;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class ExerciceController {

    @FXML
    private void quitter() {
        try {
            Parent racine = FXMLLoader.load(getClass().getResource("layout_controller.fxml"));
            DemoLayoutApplication.getInstance().getStage().getScene().setRoot(racine);

        } catch (IOException exception) {
            System.out.println("Impossible de charger layout_controller.fxml \n" + exception.getMessage());
        }
    }


}
