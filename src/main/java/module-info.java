module edu.uqtr.demolayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.uqtr.demolayout to javafx.fxml;
    exports edu.uqtr.demolayout;
}