package edu.uqtr.demolayout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.io.IOException;

/**
 * Contrôle l'affichage des différents layout
 */
public class LayoutController {

    /**
     * Remplace le stage par celui correspondant à l'exemple à afficher.
     *
     * @param event les paramètres de l'événement
     */
    @FXML
    private void afficherExemple(ActionEvent event) {
        Node source = (Node) event.getSource();
        TypeLayout type = TypeLayout.valueOf((String) source.getUserData());

        chargerContenu(type.getFichierFxml());
    }

    /**
     * Charge le contenu du fichier en paramètre et le place comme racine du stage actuel
     *
     * @param nomFichier le nom du fichier à charger
     */
    private void chargerContenu(String nomFichier) {
        nomFichier = nomFichier;

        try {
            Parent racine = FXMLLoader.load(getClass().getResource(nomFichier));
            DemoLayoutApplication.getInstance().getStage().getScene().setRoot(racine);

        } catch (IOException exception) {
            System.out.println("Impossible de charger le fichier " + nomFichier + "\n" + exception.getMessage());
        }
    }
}