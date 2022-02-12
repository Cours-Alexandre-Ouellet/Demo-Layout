package edu.uqtr.demolayout;

/**
 * Types de layout pouvant être démontrés dans l'application
 */
public enum TypeLayout {

    ANCHOR("anchor_pane.fxml"),
    BORDER ("border_pane.fxml"),
    EXEMPLE_COMPLET ("exercice.fxml"),
    FLOW ("flow_pane.fxml"),
    GRID ("grid_pane.fxml"),
    MENU ("layout_controller.fxml"),
    STACK ("stack_pane.fxml"),
    VBOX_HBOX ("box.fxml");

    // Référence au nom du fichier
    private String fichierFxml;

    /**
     * Crée un nouveau type de layout pouvant être affichée
     * @param fichierFxml le fichier FXML contenant l'affichage;
     */
    TypeLayout(String fichierFxml) {
        this.fichierFxml = fichierFxml;
    }

    /**
     * Accès au nom du fichier FXML associé à la constante.
     * @return le nom du fichier FXML de la constante.
     */
    public String getFichierFxml() {
        return fichierFxml;
    }
}
