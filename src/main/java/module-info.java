module com.example.numberguessinggamegui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numberguessinggamegui to javafx.fxml;
    exports com.example.numberguessinggamegui;
}