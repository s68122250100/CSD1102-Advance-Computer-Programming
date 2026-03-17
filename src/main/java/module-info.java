module com.example.voteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.voteapp to javafx.fxml;
    exports com.example.voteapp;
}