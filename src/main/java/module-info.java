module com.example.project01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.project01 to javafx.fxml;
    exports com.example.project01;
}