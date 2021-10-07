module com.example.pruebagithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebagithub to javafx.fxml;
    exports com.example.pruebagithub;
}