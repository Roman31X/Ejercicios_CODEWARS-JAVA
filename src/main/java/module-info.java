module com.example.ejercicios_codewars {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicios_codewars to javafx.fxml;
    exports com.example.ejercicios_codewars;
}