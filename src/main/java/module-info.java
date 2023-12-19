module com.example.contactapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.contactapp to javafx.fxml;
    exports com.example.contactapp;
    exports com.example.contactapp.DataModel;
    opens com.example.contactapp.DataModel to javafx.fxml;
    exports com.example.contactapp.Controller;
    opens com.example.contactapp.Controller to javafx.fxml;
}